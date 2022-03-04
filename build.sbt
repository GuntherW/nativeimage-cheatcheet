lazy val root = project
  .in(file("."))
  .settings(
    name                := "nativeimage-cheatsheet",
    version             := "0.1.0",
    scalaVersion        := "3.1.1",
    Compile / mainClass := Some("de.wittig.app")
  )
  .enablePlugins(NativeImagePlugin)
