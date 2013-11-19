#!/usr/bin/groovy

@Grapes([
        @Grab(group='org.slf4j', module='slf4j-api', version='1.7.5'),
        @Grab(group='ch.qos.logback', module='logback-classic', version='1.0.13')
])


import groovy.io.FileType
import groovy.sql.Sql
import groovy.time.TimeCategory
import groovy.time.TimeDuration
import groovy.transform.Field
import groovy.util.logging.Slf4j

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Field scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
@Field public scriptConfig = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());
@Field Logger log = LoggerFactory.getLogger("convert.groovy")


while (!new File(scriptConfig.dirs.stopFile).exists()) {
    new File(scriptConfig.dirs.root).eachFile(FileType.DIRECTORIES, this.&doConvert)

    Thread.sleep(30000)
}

def doConvert(File workingDir) {
    if (new File(scriptConfig.dirs.stopFile).exists()) System.exit(0)

    if (checkForRecentActivity(workingDir)) return

    configFile = new File(workingDir, "mythtv.cfg")
    if (!configFile.exists()) return

    session = new ConversionSession(scriptConfig, configFile)
    println "Running conversion ${configFile.parent}"
    try {
        session.execute("recording", this.&gatherRecordingInfo)
        session.execute("mediaInfo", this.&gatherMediaInfo)
        session.execute("conversionProperties", this.&gatherConversionProperties)
        session.execute("handbrake", this.&handbrake)
        session.execute("move", this.&move)
        session.execute("report", this.&report)
        session.execute("archive", this.&archive)

        proc = "rm -rf ${workingDir}".execute()
        proc.waitFor()

    } catch (e) { log.error e.getMessage(); }

}

def boolean checkForRecentActivity(File workingDir) {
    File youngest = workingDir.listFiles().max { it.lastModified() }
    if (youngest == null) {
        System.err.println("${workingDir} may be empty.  SKIPPING")
        workingDir.delete()
        return true
    }
    int age = (System.currentTimeMillis() - youngest.lastModified())/1000
    def delay = scriptConfig.delays.convert.toInteger()

    if (age < delay) {
        log.error "${workingDir} may be being worked on.  SKIPPING"
        return true
    }

    return false
}

@Grab('mysql:mysql-connector-java:5.1.26')
@GrabConfig(systemClassLoader=true)
def gatherRecordingInfo(ConversionSession session) {
    name = new File(session.config.origin).name
    sql = Sql.newInstance(scriptConfig.db.url, scriptConfig.db.username, scriptConfig.db.password)
    row = sql.firstRow("select title, subtitle, season, episode, seriesid, programid from recorded where basename = ${name}")
    sql.close()
    if (row == null) {
        [ title : '', subtitle : '', season : '', episode : '', seriesid : '', programid : '' ]
    } else {
        row
    }
}

def gatherMediaInfo(ConversionSession session) {
    videoValues = mediaInfo('Video;height=%Height%,width=%Width%', session.config.source)

    maxHeight = videoValues*.height.max{ it.toInteger() }
    maxWidth = videoValues*.width.max { it.toInteger() }

    audioValues = mediaInfo("Audio;id=%StreamKindID%,format=%Format%,channels=%Channel(s)%,language=%Language/String3%", session.config.source)

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
    command = "mediainfo --Output=${output}\\n ${path}"
    log.info "Executing ${command}"
    proc = command.execute()
    proc.waitFor()
    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("mediainfo exited with ${proc.err.text}")
    }
    lines = proc.in.readLines()

    return lines.findAll { !it.isEmpty() }.collect {
        it.split(",").collectEntries { retval = it.split('=').toList() }
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

    if (videoQuality.quality.toInteger() > 30 ) throw new javax.script.ScriptException("not running these yet")

    return [ audio: "-a ${audioTracks} -E ${audioEncoders}",
            video: "-e x264 --x264-profile=${videoQuality.profile} -q ${videoQuality.quality} -5 -s scan -F",
            container: "-f mkv -N ${scriptConfig.audio.nativeLanguage} --native-dub"]
}

def handbrake(ConversionSession session) {
    props = session.config.conversionProperties

    stdout = new File(session.config.workingDir, scriptConfig.names.handbrake.stdout)
    stderr = new File(session.config.workingDir, scriptConfig.names.handbrake.stderr)
    output = new File(session.config.workingDir, scriptConfig.names.handbrake.output)

    command = "nice HandBrakeCLI ${props.audio} ${props.video} ${props.container} -i ${session.config.source} -o ${output.absolutePath}"

    log.info "Executing ${command}"
    proc = command.execute()
    proc.consumeProcessOutput(stdout.newOutputStream(), stderr.newOutputStream())
    proc.waitFor()

    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("HandBrakeCLI exited with ${proc.exitValue()}")
    }

    Thread.sleep(300 * 1000)
    [ stdout : stdout.absolutePath, stderr : stderr.absolutePath, output : output.absolutePath ]
}

def move(ConversionSession session) {

    def recording = session.config.recording
    if (recording.title.isEmpty()) {
        throw new javax.script.ScriptException("recording.title is unknown")
    }

    if (session.config.recording.season.isEmpty()) {
        throw new javax.script.ScriptException("recording.season is unknown")
    }

    if (session.config.recording.episode.isEmpty()) {
        throw new javax.script.ScriptException("recording.episode is unknown")
    }

    destination = new File(scriptConfig.dirs.destination, session.config.recording.title)

    if (!destination.exists() && !destination.mkdirs()) {
        throw new javax.script.ScriptException("Unabled to create ${destination}")
    }

    originalName = new File(session.config.origin).getName()

    destinationName = String.format('S%02dE%02d-(%s).mkv',recording.season.toInteger(), recording.episode.toInteger(), originalName)
  
    destination = new File(destination, destinationName).absolutePath

    log.info "Creating ${destination}"
    command = [ 'nice', 'mv', session.config.handbrake.output, destination ]
    proc = command.execute()
    proc.waitFor()

    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("mv exited with ${proc.err.text}")
    }

    [ destination : destination ] 
}

def archive(ConversionSession session) {
    originalName = new File(session.config.origin).getName()

    destination = new File(scriptConfig.dirs.archive, originalName + ".cfg").absolutePath

    log.info "Archiving configuration to ${destination}"

    command = [ 'nice', 'mv', session.configPath.absolutePath, destination ]
    proc = command.execute()
    proc.waitFor()

    if (proc.exitValue() != 0) throw new javax.script.ScriptException("mv exited with ${proc.err.text}")

    [ destination : destination ]
}

def report(ConversionSession session) {
    originalName = new File(session.config.origin).getName()
    int startSize = new File(session.config.source).length()
    int finalSize = new File(session.config.move.destination).length()
    double ratio = startSize == 0 ? 0 : finalSize / startSize
    double duration = mediaInfo('General;duration=%Duration%',session.config.source)[0].duration.toDouble() / 1000
    double megsPerHour = startSize/(1024.0*1024.0) / (duration / 3600)
    String runTime = session.config.handbrake.runTime.replace(',','')
    String line = "${scriptConfig.reportName},${new Date().getDateTimeString()},${originalName},${startSize},${finalSize},${ratio},${runTime},${duration},${megsPerHour},${session.config.conversionProperties.video}"


    new File(scriptConfig.dirs.report).withWriterAppend { it.println(line) }
    [ line : line ]
}


class ConversionSession {
    private static Logger log = LoggerFactory.getLogger("convert.groovy")

    ConfigObject config;
    final File configPath
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
            force(step, objectClosure)
        } else {
            log.info "Skipping step ${step}"
        }
    }


    public force(String step, Closure<Object> objectClosure) {
        try {
            log.info "Executing step ${step}"
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


