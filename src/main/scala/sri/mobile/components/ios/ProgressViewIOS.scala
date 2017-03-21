package sri.mobile.components.ios

import sri.core.JSComponent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}

@js.native
@JSImport("react-native", "ProgressViewIOS")
object ProgressViewIOSComponent extends JSComponent[ProgressViewIOSProps]

@ScalaJSDefined
trait ProgressViewIOSProps extends js.Object {
  val progress: js.UndefOr[Double] = js.undefined
  val progressImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("progressImage") val progressImageDynamic: js.UndefOr[js.Dynamic] =
    js.undefined
  val trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") val trackImageDynamic: js.UndefOr[js.Dynamic] =
    js.undefined
  val progressTintColor: js.UndefOr[String] = js.undefined
  val trackTintColor: js.UndefOr[String] = js.undefined
  val progressViewStyle: js.UndefOr[ProgressViewStyle] = js.undefined
}

@js.native
trait ProgressViewStyle extends js.Object

object ProgressViewStyle {
  @inline def BAR = "bar".asInstanceOf[ProgressViewStyle]
  @inline def DEFAULT = "default".asInstanceOf[ProgressViewStyle]
}
