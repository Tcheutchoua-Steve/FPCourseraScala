course := "progfun1"
assignment := "funsets"

scalaVersion := "2.13.0"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
lazy val root = (project in file("."))
  .aggregate(objsets)
  .aggregate(lectures)

lazy val objsets = (project in file("objsets"))
  .settings(
    course := "progfun1",
    assignment := "objsets",
    scalaVersion := "2.13.0",
    scalacOptions ++= Seq("-language:implicitConversions", "-deprecation"),
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,
    testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s"),
  )

lazy val lectures = (project in file("FPInScala"))
  .settings(
      scalaVersion := "2.13.0",
      scalacOptions ++= Seq("-language:implicitConversions", "-deprecation"),
      libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test,
      testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s"),
  )