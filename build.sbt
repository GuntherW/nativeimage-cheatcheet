lazy val root = project
  .in(file("."))
  .settings(
    name := "nativeimage-cheatsheet",
    version := "0.1.0",
    scalaVersion := "3.0.0-RC1"
  )
  .enablePlugins(NativeImagePlugin)
