package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait InteractionManager extends js.Object {

  def runAfterInteractions(callback: js.Function): Unit = js.native

  def createInteractionHandle(): Unit = js.native

  def clearInteractionHandle(handle: Int): Unit = js.native

}

@js.native
@JSImport("react-native","InteractionManager")
object InteractionManager extends InteractionManager