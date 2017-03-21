package sri.mobile.components.android

import sri.core.JSComponent
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}
import scala.scalajs.js.{undefined, UndefOr => U}


@js.native
@JSImport("react-native", "ToolbarAndroid")
object ToolbarAndroidComponent extends JSComponent[ToolbarAndroidProps]


@ScalaJSDefined
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




@ScalaJSDefined
trait ToolbarAndroidAction extends js.Object {
  val title: String
  val icon: U[js.Any] = undefined
  val show: U[ToolbarAndroidActionShow] = undefined
  val showWithText: U[Boolean] = undefined
}

object  ToolbarAndroidAction {
  @inline
  def apply(title: String,icon:OptionalParam[js.Any] = OptDefault,
            show:OptionalParam[ToolbarAndroidActionShow] = OptDefault,
            showWithText:OptionalParam[Boolean] = OptDefault ):ToolbarAndroidAction = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[ToolbarAndroidAction]
  }
}


@js.native
trait ToolbarAndroidActionShow extends js.Object

object ToolbarAndroidActionShow {
 @inline def ALWAYS =  "always".asInstanceOf[ToolbarAndroidActionShow]
 @inline def IF_ROOM =  "ifRoom".asInstanceOf[ToolbarAndroidActionShow]
 @inline def NEVER =  "never".asInstanceOf[ToolbarAndroidActionShow]
}
