package sri.mobile.components.android

import sri.core._
import scalajsplus.macros.{FunctionObjectMacro, exclude, rename}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.mobile.DrawerLayoutAndroidEvent
import sri.universal.{MergeJSObjects, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "DrawerLayoutAndroid")
object DrawerLayoutAndroidComponent
    extends JSComponent[DrawerLayoutAndroidProps] {
  val positions: js.Dynamic = js.native
}

trait DrawerLayoutAndroidProps extends js.Object {
  val drawerPosition: js.UndefOr[DrawerPosition] = js.undefined
  val drawerWidth: js.UndefOr[Double] = js.undefined
  val statusBarBackgroundColor: js.UndefOr[String] = js.undefined
  val onDrawerSlide
    : js.UndefOr[js.Function1[ReactEvent[DrawerLayoutAndroidEvent], _]] =
    js.undefined
  val onDrawerStateChanged: js.UndefOr[js.Function1[String, _]] = js.undefined
  val onDrawerOpen: js.UndefOr[js.Function0[_]] = js.undefined
  val onDrawerClose: js.UndefOr[js.Function0[_]] = js.undefined
  val renderNavigationView: js.Function0[ReactElement]
}

@js.native
trait DrawerPosition extends js.Object

object DrawerPosition {
  @inline def LEFT =
    DrawerLayoutAndroidComponent.positions.Left.asInstanceOf[DrawerPosition]
  @inline def RIGHT =
    DrawerLayoutAndroidComponent.positions.Right.asInstanceOf[DrawerPosition]
}

@js.native
trait DrawerLayoutAndroidKeyBoardDismissMode extends js.Object

object DrawerLayoutAndroidKeyBoardDismissMode {
  @inline def NONE =
    "none".asInstanceOf[DrawerLayoutAndroidKeyBoardDismissMode]
  @inline def ON_DRAG =
    "on-drag".asInstanceOf[DrawerLayoutAndroidKeyBoardDismissMode]
}

@js.native
trait DrawerLockMode extends js.Object

object DrawerLockMode {
  @inline def UNLOCKED = "unlocked".asInstanceOf[DrawerLockMode]
  @inline def LOCKED_CLOSED = "locked-closed".asInstanceOf[DrawerLockMode]
  @inline def LOCKED_OPEN = "locked-open".asInstanceOf[DrawerLockMode]
}

object DrawerLayoutAndroid {

  @inline
  def apply(
      style: OP[js.Any] = NoValue,
      @exclude extraProps: OP[DrawerLayoutAndroidProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[DrawerLayoutAndroidComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = DrawerLayoutAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[DrawerLayoutAndroidComponent.type](
      DrawerLayoutAndroidComponent,
      props.asInstanceOf[DrawerLayoutAndroidProps],
      children = children.toJSArray)
  }

}
