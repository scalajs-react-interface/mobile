package sri.mobile.components.ios

import sri.core.{JSComponent, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "SegmentedControlIOS")
object SegmentedControlIOSComponent
    extends JSComponent[SegmentedControlIOSProps]

trait SegmentedControlIOSProps extends ViewProps {
  var momentary: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[js.Dynamic, Unit]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[String, Unit]] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
  var selectedIndex: js.UndefOr[Int] = js.undefined
}

object SegmentedControlIOS {

  @inline
  def apply(
      style: OP[js.Any] = NoValue,
      tintColor: OP[String] = NoValue,
      selectedIndex: OP[Int] = NoValue,
      enabled: OP[Boolean] = NoValue,
      momentary: OP[Boolean] = NoValue,
      onChange: OP[js.Dynamic => _] = NoValue,
      onValueChange: OP[String => _] = NoValue,
      values: js.Array[String],
      @exclude extraProps: OP[SegmentedControlIOSProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[SegmentedControlIOSComponent.type, Unit] =
        null)
    : ReactElement { type Instance = SegmentedControlIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[SegmentedControlIOSComponent.type](
      SegmentedControlIOSComponent,
      props.asInstanceOf[SegmentedControlIOSProps])
  }

}
