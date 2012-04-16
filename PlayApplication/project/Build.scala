import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "protobufplay"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
            
	"org.apache.hadoop" % "hadoop-core" % "1.0.2",
	"org.apache.hbase"  % "hbase"       % "0.92.1",

	"ca.underflow.hbase" % "HBaseCoprocessors" % "0.0.1-SNAPSHOT" changing()
    
    )

    val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
 
    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings()

}
