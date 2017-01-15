package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.Promise
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
trait UIManager extends js.Object {

  def takeSnapshot(view: js.Any = ???, options: SnapShotOptions = ???): Promise[js.Any] = js.native
}

@js.native
@JSImport("react-native","UIManager")
object UIManager extends UIManager

@ScalaJSDefined
 trait SnapShotOptions extends js.Object {

  var width: js.UndefOr[Double] = js.undefined

  var height: js.UndefOr[Double] = js.undefined

  var format: js.UndefOr[String] = js.undefined

  var quality: js.UndefOr[Double] = js.undefined

}