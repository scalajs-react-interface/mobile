package sri.mobile.components.android

import sri.core.JSComponent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "TouchableNativeFeedback")
object TouchableNativeFeedbackComponent extends JSComponent[TouchableNativeFeedbackProps] {
  def SelectableBackground(): NativeFeedbackBackgroundType = js.native

  def SelectableBackgroundBorderless(): NativeFeedbackBackgroundType = js.native

  def Ripple(color: String, borderless: Boolean): NativeFeedbackBackgroundType = js.native

}


@ScalaJSDefined
trait TouchableNativeFeedbackProps extends TouchableWithoutFeedbackProps {
  val useForeground: js.UndefOr[Boolean] = js.undefined
  val background: js.UndefOr[NativeFeedbackBackgroundType] = js.undefined
}




@js.native
trait NativeFeedbackBackgroundType extends js.Object