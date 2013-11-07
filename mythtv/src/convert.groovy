#!/usr/bin/groovy

import groovy.io.FileType
import groovy.sql.Sql
import groovy.time.TimeCategory
import groovy.time.TimeDuration
import groovy.transform.Field

@Field scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
@Field public scriptConfig = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());

new File(scriptConfig.dirs.root).eachFile(FileType.DIRECTORIES, this.&doConvert)

def doConvert(File workingDir) {
    configFile = new File(workingDir, "mythtv.cfg")
    if (!configFile.exists()) return

    session = new ConversionSession(scriptConfig, configFile)
    println "Running conversion ${configFile.parent}"
    session.execute("copy", this.&copy)
    session.execute("recording", this.&gatherRecordingInfo)
    session.execute("mediaInfo", this.&gatherMediaInfo)
    session.execute("conversionProperties", this.&gatherConversionProperties)
    session.execute("handbrake", this.&handbrake)
    session.execute("move", this.&move)
    //session.execute("clean", this.&clean)
}

def copy(ConversionSession session) {
    videoCopy = new File(session.config.workingDir, scriptConfig.names.copy)
    println "Creating ${videoCopy}"
    proc = "nice cp ${session.config.source} ${videoCopy}".execute()
    proc.waitFor()

    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("copy exited with ${proc.err.text}")
    }

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
    videoValues = mediaInfo('Video;height=%Height%,width=%Width%', session.config.copy.path)

    maxHeight = videoValues*.height.max{ it.toInteger() }
    maxWidth = videoValues*.width.max { it.toInteger() }

    audioValues = mediaInfo("Audio;id=%StreamKindID%,format=%Format%,channels=%Channel(s)%,language=%Language/String3%", session.config.copy.path)

    // Only include if all values are set
    audioValues = audioValues.findAll { it.every { !it.value.isEmpty() } }

    // Make the tracks start at 1 not 0
    audioValues = audioValues.collect { it.id = it.id.toInteger() + 1; it }

    // Remove excluded languages
    audioValues = audioValues.findAll { !scriptConfig.audio.excludedLanguages.contains(it.language) }

    // Find the best quality audio with the most channels for each language
    audioValues = audioValues.groupBy {it.language}.collect { languageGroup ->
        byFormat = scriptConfig.audio.formatPreference.collect { format -> 
           languageGroup.value.findAll { it.format == format } 
        }

        formatList = byFormat.find { !it.isEmpty() }
        if (formatList == null) formatList = languageGroup.value

        formatList.max { it.channels.toInteger() }
    }.flatten()

    return [ width : maxWidth, height : maxHeight, audio : audioValues ]
}

def mediaInfo(String output, String path) {

    proc = "mediainfo --Output=${output}\\n ${path}".execute()
    proc.waitFor()
    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("mediainfo exited with ${proc.exitValue()}")
    }

    return proc.in.readLines().findAll { !it.isEmpty() }.collect {
        it.split(",").collectEntries { it.split('=').toList() }
    }
}

def gatherConversionProperties(ConversionSession session) {
    audio = session.config.mediaInfo.audio
    audioTracks = audio*.id.join(",")
    audioEncoders = audio.collect {"copy"}.join(",")

    height = session.config.mediaInfo.height.toInteger()
    width = session.config.mediaInfo.width.toInteger()
    area = height * width
    videoQuality = scriptConfig.video.quality.values().findAll { it.area < area}.last()

    return [ audio: "-a ${audioTracks} -E ${audioEncoders}",
            video: "-e x264 --x264-profile=${videoQuality.profile} -q ${videoQuality.quality} -5 -s scan -F",
            container: "-f mkv -N ${scriptConfig.audio.nativeLanguage} --native-dub"]
}

def handbrake(ConversionSession session) {
    props = session.config.conversionProperties

    stdout = new File(session.config.workingDir, scriptConfig.names.handbrake.stdout)
    stderr = new File(session.config.workingDir, scriptConfig.names.handbrake.stderr)
    output = new File(session.config.workingDir, scriptConfig.names.handbrake.output)

    command = "nice HandBrakeCLI -i ${session.config.copy.path} -o ${output.absolutePath} ${props.audio} ${props.video} ${props.container}"

    println "Executing ${command}"
    proc = command.execute()
    proc.consumeProcessOutput(stdout.newOutputStream(), stderr.newOutputStream())
    proc.waitFor()

    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("HandBrakeCLI exited with ${proc.exitValue()}")
    }

    [ stdout : stdout.absolutePath, stderr : stderr.absolutePath, output : output.absolutePath ]
}

def move(ConversionSession session) {

    def recording = session.config.recording
    if (recording.title.isEmpty()) {
        throw new javax.script.ScriptException("recording.title is unknown}")
    }

    if (session.config.recording.season.isEmpty()) {
        throw new javax.script.ScriptException("recording.season is unknown}")
    }

    if (session.config.recording.episode.isEmpty()) {
        throw new javax.script.ScriptException("recording.episode is unknown}")
    }

    destination = new File(scriptConfig.dirs.destination, session.config.recording.title)

    if (!destination.exists() && !destination.mkdirs()) {
        throw new javax.script.ScriptException("Unabled to create ${destination}")
    }

    originalName = new File(session.config.source).getName()

    destinationName = String.format('S%02dE%02d-(%s).mkv',recording.season.toInteger(), recording.episode.toInteger(), originalName)
  
    destination = new File(destination, destinationName).absolutePath

    println "Creating ${destination}"
    proc = "nice mv ${session.config.handbrake.output} ${destination}".execute()
    proc.waitFor()

    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("mv exited with ${proc.err.text}")
    }

    [ destination : destination ] 
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


