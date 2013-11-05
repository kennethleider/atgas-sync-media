import groovy.io.FileType

scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
config = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());

new File(config.work.root).eachFile(FileType.DIRECTORIES, this.&doConvert)

def doConvert(File workingDir) {
    configFile = new File(workingDir, "mythtv.cfg")
    if (!configFile.exists()) return

    session = new Session(new ConfigSlurper().parse(configFile.toURI().toURL()))
    session.execute("copy", this.&copy)
    session.execute("mediaInfo", this.&gatherMediaInfo)
    session.execute("trackSelection", this.&trackSelection)
    session.execute("conversionProperties", this.&gatherConversionProperties)
    session.execute("handbrake", this.&handbrake)
    session.execute("nameAudioTracks", this.&nameAudioTracks)
    session.execute("move", this.&move)
    session.execute("clean", this.&clean)
}

def copy(Session session) {
    videoCopy = new File(workingDir, "source.mpg")

    if (!videoCopy.exists()) {
        println "Creating ${videoCopy}"
        videoCopy << new BufferedInputStream(new FileInputStream(source))
    }
}

def gatherMediaInfo(Session session) {
    //To change body of created methods use File | Settings | File Templates.
}