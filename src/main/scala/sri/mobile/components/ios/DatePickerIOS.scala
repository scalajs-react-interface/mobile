package sri.mobile.components.ios

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "DatePickerIOS")
object DatePickerIOSComponent extends JSComponent[DatePickerIOSProps]

@ScalaJSDefined
trait DatePickerIOSProps extends js.Object {
  val timeZoneOffsetInMinutes: js.UndefOr[Int] = js.undefined
  val date: js.UndefOr[js.Date] = js.undefined
  val minuteInterval: js.UndefOr[MinuteInterval] = js.undefined
  val mode: js.UndefOr[DatePickerIOSMode] = js.undefined
  val minimumDate: js.UndefOr[js.Date] = js.undefined
  val maximumDate: js.UndefOr[js.Date] = js.undefined
  val onDateChange: js.Function1[js.Date, Unit]
}

@js.native
trait DatePickerIOSMode extends js.Object

object DatePickerIOSMode {
  @inline def DATE = "date".asInstanceOf[DatePickerIOSMode]
  @inline def TIME = "time".asInstanceOf[DatePickerIOSMode]
  @inline def DATE_TIME = "datetime".asInstanceOf[DatePickerIOSMode]
}

@js.native
trait MinuteInterval extends js.Object

object MinuteInterval {
  @inline def _1 = 1.asInstanceOf[MinuteInterval]
  @inline def _2 = 2.asInstanceOf[MinuteInterval]
  @inline def _3 = 3.asInstanceOf[MinuteInterval]
  @inline def _4 = 4.asInstanceOf[MinuteInterval]
  @inline def _5 = 5.asInstanceOf[MinuteInterval]
  @inline def _6 = 6.asInstanceOf[MinuteInterval]
  @inline def _10 = 10.asInstanceOf[MinuteInterval]
  @inline def _12 = 12.asInstanceOf[MinuteInterval]
  @inline def _15 = 15.asInstanceOf[MinuteInterval]
  @inline def _20 = 20.asInstanceOf[MinuteInterval]
  @inline def _30 = 30.asInstanceOf[MinuteInterval]

}
