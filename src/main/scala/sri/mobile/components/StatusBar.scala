package sri.mobile.components

import sri.core.ReactClass
import sri.universal.components.{UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}



@js.native
@JSImport("react-native","StatusBar")
object StatusBarClass extends ReactClass

@js.native
trait StatusBarM extends js.Object

@ScalaJSDefined
trait BaseStatusBarProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  var networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  var showHideTransition: js.UndefOr[StatusBarShowHideTransition] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait BaseStatusBarPropsVal extends js.Object {
  val backgroundColor: js.UndefOr[String] = js.undefined
  val translucent: js.UndefOr[Boolean] = js.undefined
  val animated: js.UndefOr[Boolean] = js.undefined
  val barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  val networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined
  val showHideTransition: js.UndefOr[StatusBarShowHideTransition] = js.undefined
  val hidden: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait StatusBarProps extends BaseStatusBarProps  with UniversalProps[StatusBarM]

@ScalaJSDefined
trait StatusBarPropsVal extends BaseStatusBarPropsVal  with UniversalPropsVal[StatusBarM]


@js.native
trait StatusBarStyle extends js.Object

object StatusBarStyle {
  val DEFAULT =  "default".asInstanceOf[StatusBarStyle]
  val LIGHT_CONTENT =  "light-content".asInstanceOf[StatusBarStyle]
}


@js.native
trait StatusBarShowHideTransition extends js.Object

object StatusBarShowHideTransition {
  val FADE =  "fade".asInstanceOf[StatusBarShowHideTransition]
  val SLIDE =  "slide".asInstanceOf[StatusBarShowHideTransition]
}
