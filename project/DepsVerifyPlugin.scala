import sbt._
import Keys._

object DepsVerifyPlugin extends sbt.AutoPlugin {
  override def requires = plugins.JvmPlugin
  override def trigger = allRequirements
  override def projectSettings = Seq(
    publishConfiguration := {
      val old = publishConfiguration.value
      val ur = update.value
      ur.configuration("compile") foreach { compileReport =>
        val allModules = compileReport.allModules
        val snapshotDeps = allModules filter { _.revision contains "SNAPSHOT" }
        if (snapshotDeps.nonEmpty) {
          sys.error(
            "SNAPSHOT found in classpath:\n" +
              snapshotDeps.mkString("\n")
          )
        }
      }
      old
    }
  )
}