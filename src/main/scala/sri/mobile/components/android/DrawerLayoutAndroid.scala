package sri.mobile.components.android

import sri.core.{ReactClass, ReactElement}
import sri.mobile.DrawerLayoutAndroidEvent
import sri.universal.ReactEvent
import sri.universal.components.{UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native", "DrawerLayoutAndroid")
object DrawerLayoutAndroidClass extends ReactClass {
  val positions: js.Dynamic = js.native
}


@ScalaJSDefined
trait BaseDrawerLayoutAndroidProps extends js.Object {
  var drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
  var statusBarBackgroundColor: js.UndefOr[String] = js.undefined
  var onDrawerSlide: js.UndefOr[js.Function1[ReactEvent[DrawerLayoutAndroidEvent], _]] = js.undefined
  var onDrawerStateChanged: js.UndefOr[js.Function1[String, _]] = js.undefined
  var onDrawerOpen: js.UndefOr[js.Function0[_]] = js.undefined
  var onDrawerClose: js.UndefOr[js.Function0[_]] = js.undefined
  var renderNavigationView: js.Function0[ReactElement]
}

@ScalaJSDefined
trait BaseDrawerLayoutAndroidPropsVal extends js.Object {
  val drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
  val drawerWidth: js.UndefOr[Double] = js.undefined
  val statusBarBackgroundColor: js.UndefOr[String] = js.undefined
  val onDrawerSlide: js.UndefOr[js.Function1[ReactEvent[DrawerLayoutAndroidEvent], _]] = js.undefined
  val onDrawerStateChanged: js.UndefOr[js.Function1[String, _]] = js.undefined
  val onDrawerOpen: js.UndefOr[js.Function0[_]] = js.undefined
  val onDrawerClose: js.UndefOr[js.Function0[_]] = js.undefined
  val renderNavigationView: js.Function0[ReactElement]
}

@ScalaJSDefined
trait DrawerLayoutAndroidProps extends BaseDrawerLayoutAndroidProps with UniversalProps[DrawerLayoutAndroidM]

@ScalaJSDefined
trait DrawerLayoutAndroidPropsVal extends BaseDrawerLayoutAndroidPropsVal with UniversalPropsVal[DrawerLayoutAndroidM]


@js.native
trait DrawerLayoutAndroidM extends js.Object

object DrawerLayoutAndroidS {

}

@js.native
trait DrawerPosition extends js.Object

object DrawerPosition {
  val LEFT = DrawerLayoutAndroidClass.positions.Left.asInstanceOf[DrawerPosition]
  val RIGHT = DrawerLayoutAndroidClass.positions.Right.asInstanceOf[DrawerPosition]
}


@js.native
trait DrawerLayoutAndroidKeyBoardDismissMode extends js.Object

object DrawerLayoutAndroidKeyBoardDismissMode {
  val NONE = "none".asInstanceOf[DrawerLayoutAndroidKeyBoardDismissMode]
  val ON_DRAG = "on-drag".asInstanceOf[DrawerLayoutAndroidKeyBoardDismissMode]
}

@js.native
trait DrawerLockMode extends js.Object

object DrawerLockMode {
  val UNLOCKED = "unlocked".asInstanceOf[DrawerLockMode]
  val LOCKED_CLOSED = "locked-closed".asInstanceOf[DrawerLockMode]
  val LOCKED_OPEN = "locked-open".asInstanceOf[DrawerLockMode]
}
