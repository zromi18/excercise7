name := "excercise7"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.1" //% "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.6.1" //% "provided"
libraryDependencies += "com.databricks" %% "spark-csv" % "1.4.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.1" //% "provided"
libraryDependencies += "org.specs2" %% "specs2" % "3.7" % "test"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0-RC1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0-RC1" % "test"