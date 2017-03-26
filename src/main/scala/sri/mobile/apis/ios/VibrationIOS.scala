package sri.mobile.apis.ios

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait VibrationIOS extends js.Object {

  def vibrate(): Unit = js.native
}

@js.native
@JSImport("react-native","VibrationIOS")
object VibrationIOS extends VibrationIOS