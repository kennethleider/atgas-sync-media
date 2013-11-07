#!/usr/bin/groovy

import groovy.io.FileType
import groovy.sql.Sql
import groovy.time.TimeCategory
import groovy.time.TimeDuration
import groovy.transform.Field

@Field scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
@Field public scriptConfig = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());

new File(scriptConfig.work.root).eachFile(FileType.DIRECTORIES, this.&doConvert)

def doConvert(File workingDir) {
    configFile = new File(workingDir, "mythtv.cfg")
    if (!configFile.exists()) return

    session = new ConversionSession(scriptConfig, configFile)
    if (!session.notDone("handbrake")) return
    println "Running conversion ${configFile.parent}"
    session.execute("copy", this.&copy)
    //session.execute("recording", this.&gatherRecordingInfo)
    session.execute("mediaInfo", this.&gatherMediaInfo)
    session.execute("conversionProperties", this.&gatherConversionProperties)
    session.execute("handbrake", this.&handbrake)
    System.exit(0)
    //session.execute("nameAudioTracks", this.&nameAudioTracks)
    //session.execute("move", this.&move)
    //session.execute("clean", this.&clean)
}

def copy(ConversionSession session) {
    videoCopy = new File(session.config.workingDir, "source.mpg")
    println "Creating ${videoCopy}"
    videoCopy << new BufferedInputStream(new FileInputStream(session.config.source))

    return [ "path" : videoCopy.canonicalPath ]
}

@Grab('mysql:mysql-connector-java:5.1.26')
@GrabConfig(systemClassLoader=true)
def gatherRecordingInfo(ConversionSession session) {
    sql = Sql.newInstance(scriptConfig.db.url, scriptConfig.db.username, scriptConfig.db.password)
    row = sql.firstRow("select title, subtitle, season, episode, seriesid, programid from recorded where basename = ${session.config.name}")
    return row
}

def gatherMediaInfo(ConversionSession session) {
    proc = "mediainfo --Output=Video;%ID%,%FrameRate%,%Codec%,%Height%,%Width%\\n ${session.config.copy.path}".execute()
    proc.waitFor()

    videoValues = proc.in.readLines().findAll { !it.isEmpty() }.collect {
        values = it.split(",")
        return [ id : values[0], fps : values[1], codec : values[2], height: values[3], width: values[4] ]
    }

    proc = "mediainfo --Output=Audio;%StreamKindID%,%Format%,%Channel(s)%,%BitRate%,%Language%\\n ${session.config.copy.path}".execute()
    proc.waitFor()

    audioValues = proc.in.readLines().findAll { !it.isEmpty() }.collect {
        values = it.split(",")
        return [ id : values[0], format : values[1], channels : values[2], bitrate: values[3], language: values[4] ]
    }

    // Only include if all values are set
    audioValues = audioValues.findAll { it.every { !it.value.isEmpty() } }

    audioValues = audioValues.collect { it.id = it.id.toInteger() + 1; it }

    // Remove excluded languages
    audioValues - audioValues.findAll { !scriptConfig.audio.excludedLanguages.contains(it.language.toLowerCase()) }

    // Find the best quality audio with the most channels for each language
    audioValues = audioValues.groupBy {it.language}.collect { languageGroup ->
        formatList = languageGroup.value.findAll { it.format =~ /AC-3/ }
        if (formatList.isEmpty()) formatList = languageGroup.value.findAll { it.format =~ /MPEG Audio/ }
        if (formatList.isEmpty()) formatList = languageGroup.value

        formatList.max { it.channels.toInteger() }
    }.flatten()

    return [ video : videoValues, audio : audioValues ]
}

def gatherConversionProperties(ConversionSession session) {
    audio = session.config.mediaInfo.audio
    audioTracks = audio*.id.join(",")
    audioEncoders = audio.collect {"copy"}.join(",")

    height = session.config.mediaInfo.video[0].height.toInteger()
    width = session.config.mediaInfo.video[0].width.toInteger()
    area = height * width
    videoQuality = scriptConfig.video.quality.values().findAll { it.area < area}.last().quality
    prefLang = "en"
    return [ audio: "-a ${audioTracks} -E ${audioEncoders}",
            video: "-e x264 --x264-profile=high -q ${videoQuality} -5 -s scan -F",
            container: "-f mkv -N ${prefLang} --native-dub"]
}

def handbrake(ConversionSession session) {
    props = session.config.conversionProperties
    command = "nice HandBrakeCLI -i ${session.config.copy.path} -o ${session.config.workingDir}/handbrake.mkv ${props.audio} ${props.video} ${props.container}"

    out = new File(session.config.workingDir, "handbrake.out.txt").newOutputStream()
    err = new File(session.config.workingDir, "handbrake.err.txt").newOutputStream()

    println "Executing ${command}"
    proc = command.execute()
    proc.consumeProcessOutput(out, err)
    proc.waitFor()

    [:]
}

class ConversionSession {

    ConfigObject config;
    private final File configPath
    private final ConfigObject scriptConfig

    ConversionSession(ConfigObject scriptConfig, File configPath) {
        this.scriptConfig = scriptConfig
        this.configPath = configPath
        load()
    }

    private def load() {
        config = new ConfigSlurper().parse(configPath.toURI().toURL());
    }

    private def save() {
        configPath.withWriter { config.writeTo(it) };
    }

    def execute(String step, Closure<Object> objectClosure) {
        if (notDone(step)) {
            try {
                println "Executing step ${step}"
                Date start = new Date()
                Map values = objectClosure(this)
                Date end = new Date()
                TimeDuration duration = TimeCategory.minus(end, start)
                values.put("runTime", duration.toString())
                values.put("runTimeMilliseconds", duration.toMilliseconds())
                config.put(step, toConfigObject(values))
            } catch (Exception e) {
                fail(step, e)
                throw e
            }
            done(step)
        } else {
            println "Skipping step ${step}"
        }
    }

    def toConfigObject(Object object) {
        if (object instanceof Map) {
            ConfigObject retval = new ConfigObject()
            retval.putAll(object.collectEntries { key, value -> [ key, toConfigObject(value)]})
            return retval;
        } else if (object instanceof Collection) {
            return object.collect { toConfigObject(it) }
        } else {
           return object.toString()
        }
    }

    def fail(String step, Exception e) {
        config[step] = new ConfigObject()
        config[step].status = "FAIL"
        new File(config.workingDir, scriptConfig.names.exception).withOutputStream { e.printStackTrace(new PrintStream(it))}
        save()
    }

    private def done(String step) {
        config[step].status = "DONE"
        save()
    }

    boolean notDone(String step) {
        return config[step].status != "DONE"
    }
}

