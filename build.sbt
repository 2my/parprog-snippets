
scalaVersion := "2.11.5"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-optimise",
  "-Yinline-warnings"
)

fork := true

javaOptions += "-Xmx3G"

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "com.storm-enroute" %% "scalameter-core" % "0.6",
  "org.scala-lang.modules" %% "scala-swing" % "1.0.1",
  "com.github.scala-blitz" %% "scala-blitz" % "1.1"
)
