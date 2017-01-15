package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.JSImport

@js.native
trait Linking extends js.Object {

  def addEventListener(tpe: String, handler: js.Function): Unit = js.native

  def removeEventListener(tpe: String, handler: js.Function): Unit = js.native

  def openURL(url: String): Promise[Boolean] = js.native

  def getInitialURL(): Promise[String] = js.native

  def canOpenURL(url: String): Promise[Boolean] = js.native

}

@js.native
@JSImport("react-native","Linking")
object Linking extends Linking