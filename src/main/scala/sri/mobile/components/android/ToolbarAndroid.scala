package sri.mobile.components.android

import sri.core.{JSComponent, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.{JSImport, JSName}
import scala.scalajs.js.{undefined, |, UndefOr => U}

@js.native
@JSImport("react-native", "ToolbarAndroid")
object ToolbarAndroidComponent extends JSComponent[ToolbarAndroidProps]

trait ToolbarAndroidProps extends js.Object {
  val actions: js.UndefOr[js.Array[ToolbarAndroidAction]] = js.undefined
  val logo: js.UndefOr[ImageSource] = js.undefined
  @JSName("logo") val logoDynamic: js.UndefOr[js.Any] = js.undefined
  val navIcon: js.UndefOr[ImageSource] = js.undefined
  @JSName("navIcon") val navIconDynamic: js.UndefOr[js.Any] = js.undefined
  val onActionSelected: js.UndefOr[js.Function1[Int, _]] = js.undefined
  val onIconClicked: js.UndefOr[js.Function0[_]] = js.undefined
  val subtitle: js.UndefOr[String] = js.undefined
  val contentInsetStart: js.UndefOr[Double] = js.undefined
  val contentInsetEnd: js.UndefOr[Double] = js.undefined
  val subtitleColor: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
  val titleColor: js.UndefOr[String] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
}

object ToolbarAndroid {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            actions: OP[js.Array[ToolbarAndroidAction]] = NoValue,
            title: OP[String] = NoValue,
            titleColor: OP[String] = NoValue,
            subtitle: OP[String] = NoValue,
            subtitleColor: OP[String] = NoValue,
            logo: OP[ImageSource] = NoValue,
            navIcon: OP[ImageSource] = NoValue,
            onActionSelected: OP[Int => _] = NoValue,
            @rename("navIcon") navIconDynamic: OP[js.Any] = NoValue,
            @rename("logo") logoDynamic: OP[js.Any] = NoValue,
            @exclude extraProps: OP[ToolbarAndroidProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ToolbarAndroidComponent.type, Unit] =
              null)(children: ReactNode*)
    : ReactElement { type Instance = ToolbarAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[ToolbarAndroidComponent.type](
      ToolbarAndroidComponent,
      props.asInstanceOf[ToolbarAndroidProps],
      children = children.toJSArray)
  }

}

trait ToolbarAndroidAction extends js.Object {
  val title: String
  val icon: U[js.Any] = undefined
  val show: U[ToolbarAndroidActionShow] = undefined
  val showWithText: U[Boolean] = undefined
}

object ToolbarAndroidAction {
  @inline
  def apply(title: String,
            icon: OP[js.Any] = NoValue,
            show: OP[ToolbarAndroidActionShow] = NoValue,
            showWithText: OP[Boolean] = NoValue): ToolbarAndroidAction = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[ToolbarAndroidAction]
  }
}

@js.native
trait ToolbarAndroidActionShow extends js.Object

object ToolbarAndroidActionShow {
  @inline def ALWAYS = "always".asInstanceOf[ToolbarAndroidActionShow]
  @inline def IF_ROOM = "ifRoom".asInstanceOf[ToolbarAndroidActionShow]
  @inline def NEVER = "never".asInstanceOf[ToolbarAndroidActionShow]
}
