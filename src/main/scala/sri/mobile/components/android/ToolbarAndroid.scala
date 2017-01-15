package sri.mobile.components.android

import sri.core.ReactClass
import sri.universal.components.{ImageSource, UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName, ScalaJSDefined}
import scala.scalajs.js.{undefined, UndefOr => U}


@js.native
@JSImport("react-native", "ToolbarAndroid")
object ToolbarAndroidClass extends ReactClass

@js.native
trait ToolbarAndroidM extends js.Object

@ScalaJSDefined
trait BaseToolbarAndroidProps extends js.Object {
  var actions: js.UndefOr[js.Array[ToolbarAndroidAction]] = js.undefined
  var logo: js.UndefOr[ImageSource] = js.undefined
  @JSName("logo") var logoDynamic: js.UndefOr[js.Any] = js.undefined
  var navIcon: js.UndefOr[ImageSource] = js.undefined
  @JSName("navIcon") var navIconDynamic: js.UndefOr[js.Any] = js.undefined
  var onActionSelected: js.UndefOr[js.Function1[Int, _]] = js.undefined
  var onIconClicked: js.UndefOr[js.Function0[_]] = js.undefined
  var subtitle: js.UndefOr[String] = js.undefined
  var contentInsetStart: js.UndefOr[Double] = js.undefined
  var contentInsetEnd: js.UndefOr[Double] = js.undefined
  var subtitleColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseToolbarAndroidPropsVal extends js.Object {
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
trait ToolbarAndroidProps extends BaseToolbarAndroidProps with UniversalProps[ToolbarAndroidM]

@ScalaJSDefined
trait ToolbarAndroidPropsVal extends BaseToolbarAndroidPropsVal with UniversalPropsVal[ToolbarAndroidM]


@ScalaJSDefined
trait ToolbarAndroidAction extends js.Object {
  var title: String
  var icon: U[js.Any] = undefined
  var show: U[ToolbarAndroidActionShow] = undefined
  var showWithText: U[Boolean] = undefined
}


@js.native
trait ToolbarAndroidActionShow extends js.Object

object ToolbarAndroidActionShow {
  val ALWAYS =  "always".asInstanceOf[ToolbarAndroidActionShow]
  val IF_ROOM =  "ifRoom".asInstanceOf[ToolbarAndroidActionShow]
  val NEVER =  "never".asInstanceOf[ToolbarAndroidActionShow]
}
