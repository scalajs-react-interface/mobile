package sri.mobile.components.android

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro, exclude, rename}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.universal.MergeJSObjects
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "TouchableNativeFeedback")
object TouchableNativeFeedbackComponent
    extends JSComponent[TouchableNativeFeedbackProps] {
  def SelectableBackground(): NativeFeedbackBackgroundType = js.native

  def SelectableBackgroundBorderless(): NativeFeedbackBackgroundType =
    js.native

  def Ripple(color: String, borderless: Boolean): NativeFeedbackBackgroundType =
    js.native

}

trait TouchableNativeFeedbackProps extends TouchableWithoutFeedbackProps {
  val useForeground: js.UndefOr[Boolean] = js.undefined
  val background: js.UndefOr[NativeFeedbackBackgroundType] = js.undefined
}

@js.native
trait NativeFeedbackBackgroundType extends js.Object

object TouchableNativeFeedback {

  @inline
  def apply(
      style: OP[js.Any] = NoValue,
      @exclude extraProps: OP[TouchableNativeFeedbackProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TouchableNativeFeedbackComponent.type, Unit] =
        null)(children: ReactNode*): ReactElement {
    type Instance = TouchableNativeFeedbackComponent.type
  } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJSNoInline[TouchableNativeFeedbackComponent.type](
      TouchableNativeFeedbackComponent,
      props.asInstanceOf[TouchableNativeFeedbackProps],
      children = children.toJSArray)
  }
}

object TouchableNativeFeedbackC {

  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[TouchableNativeFeedbackComponent.type](
      TouchableNativeFeedbackComponent,
      js.Dynamic.literal().asInstanceOf[TouchableNativeFeedbackProps],
      children = children.toJSArray)
}
