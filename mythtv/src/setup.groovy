#!/usr/bin/groovy

scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
config = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());

for (arg in args) {
    source = new File(arg) 

    if (!source.exists()) {
        System.err.println("${source} does not exist.  SKIPPING")
        continue;
    }

    basename = (source.name =~ /(.*?)\..*/)[0][1]

    workingDir = new File(config.work.root, basename)

    configFile = new File(workingDir, "mythtv.cfg")
    if (!workingDir.exists() && !workingDir.mkdirs()) {
        System.err.println("Unabled to create ${workingDir}")    
        continue;
    }
    
    if (configFile.exists()) {
        println "${configFile} already exists"
    } else {
        println "Creating ${configFile}"

        mythConfig = new ConfigObject()
        mythConfig.put("source", source.absolutePath)
        mythConfig.put("workingDir", workingDir.absolutePath)
        configFile.withWriter { mythConfig.writeTo(it) };
    }

}
