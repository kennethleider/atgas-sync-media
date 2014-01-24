#!/usr/bin/groovy

import groovy.time.TimeCategory
import groovy.transform.Field

@Field scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
@Field config = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI().toURL());

for (arg in args) {
    source = new File(arg) 

    if(!fileCheck(source)) {
        continue;
    }

    basename = (source.name =~ /(.*?)\..*/)[0][1]

    workingDir = new File(config.dirs.root, basename)
    if (!workingDir.exists() && !workingDir.mkdirs()) {
        System.err.println("Unabled to create ${workingDir}")
        continue;
    }

    copySource(workingDir, source)
    createConfigFile(workingDir, source)
}

def boolean fileCheck(File source) {
    if (!source.exists()) {
        System.err.println("${source} does not exist.  SKIPPING")
        return false;
    }

    int age = (System.currentTimeMillis() - source.lastModified())/1000
    def delay = config.delays.setup.toInteger()

    if (age < delay) {
        System.err.println("${source} is not old enough.  SKIPPING")
        return false
    }

    archiveFile = new File(config.dirs.archive, source.name + ".cfg")

    if (archiveFile.exists()) {
        println "${source} has already been processed"
        return false
    }

    return true
}


private void createConfigFile(File workingDir, File source) {
    configFile = new File(workingDir, "mythtv.cfg")
    mythConfig = new ConfigObject()
    if (configFile.exists()) {
        return
        //println "Updating ${configFile}"
        //mythConfig = new ConfigSlurper().parse(configFile.toURI().toURL());
    } else {
        println "Creating ${configFile}"
    }

    mythConfig.put("origin", source.absolutePath)
    mythConfig.put("source", new File(workingDir, config.names.copy).absolutePath)
    mythConfig.put("workingDir", workingDir.absolutePath)

    configFile.withWriter { mythConfig.writeTo(it) };
}

def copySource(File workingDir, File source) {
    destination = new File(workingDir, config.names.copy)

    if (destination.length() == source.length()) {
        println "${destination} already exists"
        return
    }
    println "Creating ${destination}"
    proc = "nice cp ${source} ${destination}".execute()
    proc.waitFor()

    if (proc.exitValue() != 0) {
        throw new javax.script.ScriptException("copy exited with ${proc.err.text}")
    }
}