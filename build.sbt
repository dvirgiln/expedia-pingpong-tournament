
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.david",
      scalaVersion    := "2.12.4"
    )),
    name := "expedia-pingpong-tournament",
    version := "0.0.1-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatest"     %% "scalatest"            % "3.0.1"         % Test
    )
  )


mainClass in Compile := Some("com.david.DrawApp")

parallelExecution in Test := false
