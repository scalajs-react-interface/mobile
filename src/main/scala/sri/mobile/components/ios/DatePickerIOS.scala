package sri.mobile.components.ios

import sri.core.ReactClass
import sri.universal.components.{UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native", "DatePickerIOS")
object DatePickerIOSClass extends ReactClass

@js.native
trait DatePickerIOSM extends js.Object

@ScalaJSDefined
trait BaseDatePickerIOSProps extends js.Object {
  var timeZoneOffsetInMinutes: js.UndefOr[Int] = js.undefined
  var date: js.Date
  var minuteInterval: js.UndefOr[MinuteInterval] = js.undefined
  var mode: js.UndefOr[DatePickerIOSMode] = js.undefined
  var minimumDate: js.UndefOr[js.Date] = js.undefined
  var maximumDate: js.UndefOr[js.Date] = js.undefined
  var onDateChange: js.Function1[js.Date, Unit]
}

@ScalaJSDefined
trait BaseDatePickerIOSPropsVal extends js.Object {
  val timeZoneOffsetInMinutes: js.UndefOr[Int] = js.undefined
  val date: js.Date
  val minuteInterval: js.UndefOr[MinuteInterval] = js.undefined
  val mode: js.UndefOr[DatePickerIOSMode] = js.undefined
  val minimumDate: js.UndefOr[js.Date] = js.undefined
  val maximumDate: js.UndefOr[js.Date] = js.undefined
  val onDateChange: js.Function1[js.Date, Unit]
}

@ScalaJSDefined
trait DatePickerIOSProps extends BaseDatePickerIOSProps with UniversalProps[DatePickerIOSM]

@ScalaJSDefined
trait DatePickerIOSPropsVal extends BaseDatePickerIOSPropsVal with UniversalPropsVal[DatePickerIOSM]


@js.native
trait DatePickerIOSMode extends js.Object

object DatePickerIOSMode {
  val DATE = "date".asInstanceOf[DatePickerIOSMode]
  val TIME = "time".asInstanceOf[DatePickerIOSMode]
  val DATE_TIME = "datetime".asInstanceOf[DatePickerIOSMode]
}


@js.native
trait MinuteInterval extends js.Object

object MinuteInterval {
  val _1 = 1.asInstanceOf[MinuteInterval]
  val _2 = 2.asInstanceOf[MinuteInterval]
  val _3 = 3.asInstanceOf[MinuteInterval]
  val _4 = 4.asInstanceOf[MinuteInterval]
  val _5 = 5.asInstanceOf[MinuteInterval]
  val _6 = 6.asInstanceOf[MinuteInterval]
  val _10 = 10.asInstanceOf[MinuteInterval]
  val _12 = 12.asInstanceOf[MinuteInterval]
  val _15 = 15.asInstanceOf[MinuteInterval]
  val _20 = 20.asInstanceOf[MinuteInterval]
  val _30 = 30.asInstanceOf[MinuteInterval]

}

