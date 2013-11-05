#!/usr/bin/groovy -d

@Grab('mysql:mysql-connector-java:5.1.26')
@GrabConfig(systemClassLoader=true)
import com.mysql.jdbc.Driver 
import groovy.sql.Sql

scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
config = new ConfigSlurper().parse(new File("${scriptDir}/transcode.cfg").toURI());

sql = Sql.newInstance(config.db.url, config.db.username, config.db.password)

for (arg in args) {
    source = new File(arg) 
    basename = (source.name =~ /(.*?)\..*/)[0][1]
    workingDir = new File(config.work.root, basename)
    configFile = new File(workingDir, "mythtv.cfg")
    if (!source.exists()) {
        System.err.println("${source} does not exist.  SKIPPING")    
        conintue;
    }
    
    if (!workingDir.exists() && !workingDir.mkdirs()) {
        System.err.println("Unabled to create ${workingDir}")    
        conintue;
    }
    
    if (configFile.exists()) {
        println "${configFile} already exists"
    } else {
        println "Creating ${configFile}"
        row = sql.firstRow("select title, subtitle, season, episode, seriesid, programid from recorded where basename = ${source.name}")

        mythConfig = new ConfigObject()
        mythConfig.putAll(row)
        configFile.withWriter { mythConfig.writeTo(it) };
    }

}
