package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait CameraRoll extends js.Object {

  def saveImageWithTag(tag: String, successCallback: js.Function, errorCallback: js.Function): Unit = js.native

  def getPhotos(params: js.Object, callback: js.Function, errorCallback: js.Function): Unit = js.native

}

@js.native
@JSImport("react-native","CameraRoll")
object CameraRoll extends CameraRoll