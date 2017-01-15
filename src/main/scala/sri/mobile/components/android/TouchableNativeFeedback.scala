package sri.mobile.components.android

import sri.core.ReactClass
import sri.universal.components.{BaseTouchableWithoutFeedbackProps, BaseTouchableWithoutFeedbackPropsVal, UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}


@js.native
@JSImport("react-native", "TouchableNativeFeedback")
object TouchableNativeFeedbackClass extends ReactClass {
  def SelectableBackground(): NativeFeedbackBackgroundType = js.native

  def SelectableBackgroundBorderless(): NativeFeedbackBackgroundType = js.native

  def Ripple(color: String, borderless: Boolean): NativeFeedbackBackgroundType = js.native

}

@js.native
trait TouchableNativeFeedbackM extends js.Object

@ScalaJSDefined
trait BaseTouchableNativeFeedbackProps extends js.Object {
  var useForeground: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[NativeFeedbackBackgroundType] = js.undefined
}

@ScalaJSDefined
trait BaseTouchableNativeFeedbackPropsVal extends js.Object {
  val useForeground: js.UndefOr[Boolean] = js.undefined
  val background: js.UndefOr[NativeFeedbackBackgroundType] = js.undefined
}

@ScalaJSDefined
trait TouchableNativeFeedbackProps extends BaseTouchableNativeFeedbackProps with BaseTouchableWithoutFeedbackProps with UniversalProps[TouchableNativeFeedbackM]

@ScalaJSDefined
trait TouchableNativeFeedbackPropsVal extends BaseTouchableNativeFeedbackPropsVal with BaseTouchableWithoutFeedbackPropsVal with UniversalPropsVal[TouchableNativeFeedbackM]


@js.native
trait NativeFeedbackBackgroundType extends js.Object