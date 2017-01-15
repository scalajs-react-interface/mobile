package sri.mobile.components.ios

import sri.core._
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}




@js.native
@JSImport("react-native","ProgressViewIOS")
object ProgressViewIOSClass extends ReactClass

@js.native
trait ProgressViewIOSM extends js.Object

@ScalaJSDefined
trait BaseProgressViewIOSProps extends js.Object {
  var progress: js.UndefOr[Double] = js.undefined
  var progressImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("progressImage") var progressImageDynamic: js.UndefOr[js.Dynamic] = js.undefined
  var trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") var trackImageDynamic: js.UndefOr[js.Dynamic] = js.undefined
  var progressTintColor: js.UndefOr[String] = js.undefined
  var trackTintColor: js.UndefOr[String] = js.undefined
  var progressViewStyle: js.UndefOr[ProgressViewStyle] = js.undefined
}

@ScalaJSDefined
trait BaseProgressViewIOSPropsVal extends js.Object {
  val progress: js.UndefOr[Double] = js.undefined
  val progressImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("progressImage") val progressImageDynamic: js.UndefOr[js.Dynamic] = js.undefined
  val trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") val trackImageDynamic: js.UndefOr[js.Dynamic] = js.undefined
  val progressTintColor: js.UndefOr[String] = js.undefined
  val trackTintColor: js.UndefOr[String] = js.undefined
  val progressViewStyle: js.UndefOr[ProgressViewStyle] = js.undefined
}

@ScalaJSDefined
trait ProgressViewIOSProps extends BaseProgressViewIOSProps with BaseViewProps with UniversalProps[ProgressViewIOSM]

@ScalaJSDefined
trait ProgressViewIOSPropsVal extends BaseProgressViewIOSPropsVal with BaseViewPropsVal with UniversalPropsVal[ProgressViewIOSM]



@js.native
trait ProgressViewStyle extends js.Object

object ProgressViewStyle {
  val BAR =  "bar".asInstanceOf[ProgressViewStyle]
  val DEFAULT =  "default".asInstanceOf[ProgressViewStyle]
}
