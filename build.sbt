lazy val figureFractions = (project in file("."))
  .settings(
    name := "bootcamp-figure-fractions",
    version := "0.1",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Dependencies.scalaTestDeps
  )
  .dependsOn(fractions, geometry)

lazy val fractions = (project in file("bootcamp-fractions"))
    .settings(
      libraryDependencies ++= Dependencies.scalaTestDeps
    )

lazy val geometry = (project in file("BootcampGeometricFigures"))
  .settings(
    libraryDependencies ++= Dependencies.scalaTestDeps
  )
