organization  := "de.frosner"

version       := "2.1.0"

name          := "drunken-data-quality"

scalaVersion  := "2.10.5"

sparkVersion := "1.3.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion.value % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion.value % "provided"

libraryDependencies += "org.apache.spark" %% "spark-hive" % sparkVersion.value % "provided"

libraryDependencies += "org.mockito" % "mockito-all" % "1.8.4" % "test"

spName := "FRosner/drunken-data-quality"

spAppendScalaVersion := true

spIgnoreProvided := true

sparkComponents ++= Seq("sql", "hive")

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

fork := true

javaOptions += "-Xmx2G"

javaOptions += "-XX:MaxPermSize=128m"
