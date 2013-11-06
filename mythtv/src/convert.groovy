#!/usr/bin/groovy

import groovy.io.FileType
import groovy.sql.Sql
import groovy.transform.Field

@Field scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
@Field config = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());

new File(config.work.root).eachFile(FileType.DIRECTORIES, this.&doConvert)

def doConvert(File workingDir) {
    configFile = new File(workingDir, "mythtv.cfg")
    if (!configFile.exists()) return

    session = new ConversionSession(configFile)
    println "Running conversion ${configFile.parent}"
    session.execute("copy", this.&copy)
    //session.execute("recording", this.&gatherRecordingInfo)
    session.execute("mediaInfo", this.&gatherMediaInfo)
    session.execute("conversionProperties", this.&gatherConversionProperties)
    //session.execute("handbrake", this.&handbrake)
    //session.execute("nameAudioTracks", this.&nameAudioTracks)
    session.execute("move", this.&move)
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
    sql = Sql.newInstance(config.db.url, config.db.username, config.db.password)
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

    proc = "mediainfo --Output=Audio;%ID%,%Format%,%Channel(s)%,%BitRate%,%Language%\\n ${session.config.copy.path}".execute()
    proc.waitFor()

    audioValues = proc.in.readLines().findAll { !it.isEmpty() }.collect {
        values = it.split(",")
        return [ id : values[0], format : values[1], channels : values[2], bitrate: values[3], language: values[4] ]
    }

    // Only include if all values are set
    audioValues = audioValues.findAll { it.every { !it.value.isEmpty() } }

    // Remove excluded languages
    audioValues - audioValues.findAll { !config.audio.excludedLanguages.contains(it.language.toLowerCase()) }

    // Find the best quality audio with the most channels for each language
    audioValues = audioValues.groupBy {it.language}.collect { languageGroup ->
        formatList = languageGroup.value.findAll { it.format =~ /AC-3/ }
        if (formatList.isEmpty()) formatList = languageGroup.value.findAll { it.format =~ /MPEG Audio/ }
        if (formatList.isEmpty()) formatList = languageGroup.value

        formatList.max { it.channels.toInteger() }
    }.flatten()

    return [ video : videoValues, audio : audioValues ]
}

def getGatherConversionProperties(ConversionSession session) {

   return [ audio: "-a ${audioTracks} -E ${audioCodecs} -B ${audioBitrates} -A ${audioLanguages}",
            video: "-e x264 --x264-profile=high -q ${videoQuality} -5 -s scan -F",
            container: "-f mkv -N ${prefLang} --native-dub"]
}

def handbrake(ConversionSession session) {
    props = session.config.conversionProperties
    proc = "nice 15 HandBrakeCLI -i ${session.config.copy.path} -o ${session.config.workingDir}/handbrake.mkv ${props.audio} ${props.video} ${props.container}"
    proc.waitFor()
}

class ConversionSession {

    ConfigObject config;
    private final File configPath

    ConversionSession(File configPath) {
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
                Map values = objectClosure(this)
                config.put(step, values)
            } catch (Exception e) {
                fail(step, e)
                throw e
            }
            done(step)
        } else {
            println "Skipping step ${step}"
        }
    }

    def fail(String step, Exception e) {
        config[step] = new ConfigObject()
        config[step].status = "FAIL"
        config[step].exception = e.toString()
        save()
    }

    private def done(String step) {
        config[step].status = "DONE"
        save()
    }

    private boolean notDone(String step) {
        return config[step].status != "DONE"
    }
}

