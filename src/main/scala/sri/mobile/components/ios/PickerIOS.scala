package sri.mobile.components.ios

import sri.core.ReactClass
import sri.universal.components.{BaseViewProps, BaseViewPropsVal, UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "PickerIOS")
object PickerIOSClass extends ReactClass

@js.native
trait PickerIOSM extends js.Object

@ScalaJSDefined
trait BasePickerIOSProps[T] extends js.Object {
  var onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  var selectedValue: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait BasePickerIOSPropsVal[T] extends js.Object {
  val onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  val selectedValue: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait PickerIOSProps[T]
    extends BasePickerIOSProps[T]
    with BaseViewProps
    with UniversalProps[PickerIOSM]

@ScalaJSDefined
trait PickerIOSPropsVal[T]
    extends BasePickerIOSPropsVal[T]
    with BaseViewPropsVal
    with UniversalPropsVal[PickerIOSM]

@js.native
@JSImport("react-native", "PickerIOS.Item")
object PickerIOSItemClass extends ReactClass

@js.native
trait PickerItemIOSM extends js.Object

@ScalaJSDefined
trait BasePickerItemIOSProps[T] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait BasePickerItemIOSPropsVal[T] extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val value: js.UndefOr[T] = js.undefined
}

@ScalaJSDefined
trait PickerIOSItemProps[T]
    extends BasePickerItemIOSProps[T]
    with UniversalProps[PickerItemIOSM]

@ScalaJSDefined
trait PickerIOSItemPropsVal[T]
    extends BasePickerItemIOSPropsVal[T]
    with UniversalPropsVal[PickerItemIOSM]
