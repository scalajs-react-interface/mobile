package sri.mobile.components.ios

import sri.core.ReactClass
import sri.universal.components.{BaseViewProps, BaseViewPropsVal, UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}




@js.native
@JSImport("react-native","SegmentedControlIOS")
object SegmentedControlIOSClass extends ReactClass

@js.native
trait SegmentedControlIOSM extends js.Object

@ScalaJSDefined
trait BaseSegmentedControlIOSProps extends js.Object {
  var momentary: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[js.Dynamic,Unit]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[String,Unit]] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
  var selectedIndex: js.UndefOr[Int] = js.undefined
}

@ScalaJSDefined
trait BaseSegmentedControlIOSPropsVal extends js.Object {
  val momentary: js.UndefOr[Boolean] = js.undefined
  val onChange: js.UndefOr[js.Function1[js.Dynamic,Unit]] = js.undefined
  val enabled: js.UndefOr[Boolean] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[String,Unit]] = js.undefined
  val values: js.UndefOr[js.Array[String]] = js.undefined
  val selectedIndex: js.UndefOr[Int] = js.undefined
}

@ScalaJSDefined
trait SegmentedControlIOSProps extends BaseSegmentedControlIOSProps with BaseViewProps with UniversalProps[SegmentedControlIOSM]

@ScalaJSDefined
trait SegmentedControlIOSPropsVal extends BaseSegmentedControlIOSPropsVal with BaseViewPropsVal with UniversalPropsVal[SegmentedControlIOSM]



