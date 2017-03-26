package sri.mobile.components.ios

import sri.core.JSComponent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "PickerIOS")
object PickerIOSClass extends JSComponent[PickerIOSProps[_]]

@ScalaJSDefined
trait PickerIOSProps[T] extends ViewProps {
  val onValueChange: js.UndefOr[js.Function2[T, Int, _]] = js.undefined
  val selectedValue: js.UndefOr[T] = js.undefined
}


@js.native
@JSImport("react-native", "PickerIOS.Item")
object PickerIOSItemClass extends JSComponent[PickerIOSItemProps[_]]

@js.native
trait PickerItemIOSM extends js.Object

@ScalaJSDefined
trait PickerIOSItemProps[T] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}


