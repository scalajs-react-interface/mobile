package sri.mobile.components.ios

import sri.core.JSComponent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "SegmentedControlIOS")
object SegmentedControlIOSComponent
    extends JSComponent[SegmentedControlIOSProps]

@ScalaJSDefined
trait SegmentedControlIOSProps extends ViewProps {
  var momentary: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[js.Dynamic, Unit]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[String, Unit]] = js.undefined
  var values: js.UndefOr[js.Array[String]] = js.undefined
  var selectedIndex: js.UndefOr[Int] = js.undefined
}
