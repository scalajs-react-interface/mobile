package sri.mobile.components.ios

import sri.core.ReactClass
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}



@js.native
@JSImport("react-native","TabBarIOS")
object TabBarIOSClass extends ReactClass

@js.native
trait TabBarIOSM extends js.Object

@ScalaJSDefined
trait BaseTabBarIOSProps extends js.Object {
  var barTintColor: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var unselectedItemTintColor: js.UndefOr[String] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait BaseTabBarIOSPropsVal extends js.Object {
  val barTintColor: js.UndefOr[String] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val unselectedItemTintColor: js.UndefOr[String] = js.undefined
  val translucent: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait TabBarIOSProps extends BaseTabBarIOSProps with BaseViewProps with UniversalProps[TabBarIOSM]

@ScalaJSDefined
trait TabBarIOSPropsVal extends BaseTabBarIOSPropsVal with BaseViewPropsVal with UniversalPropsVal[TabBarIOSM]


@js.native
@JSImport("react-native","TabBarIOSItem")
object TabBarIOSItemClass extends ReactClass

@js.native
trait TabBarIOSItemM extends js.Object

@ScalaJSDefined
trait BaseTabBarIOSItemProps extends js.Object {
  var systemIcon: js.UndefOr[SystemIcon] = js.undefined
  var selectedIcon: js.UndefOr[ImageSource] = js.undefined
  var onPress: js.Function0[Unit]
  var icon: js.UndefOr[ImageSource] = js.undefined
  var selected: Boolean
  var badgeColor: js.UndefOr[String] = js.undefined
  var badge: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseTabBarIOSItemPropsVal extends js.Object {
  val systemIcon: js.UndefOr[SystemIcon] = js.undefined
  val selectedIcon: js.UndefOr[ImageSource] = js.undefined
  val onPress: js.Function0[Unit]
  val icon: js.UndefOr[ImageSource] = js.undefined
  val selected: Boolean
  val badgeColor: js.UndefOr[String] = js.undefined
  val badge: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait TabBarIOSItemProps extends BaseTabBarIOSItemProps with BaseViewProps with UniversalProps[TabBarIOSItemM]

@ScalaJSDefined
trait TabBarIOSItemPropsVal extends BaseTabBarIOSItemPropsVal with BaseViewPropsVal with UniversalPropsVal[TabBarIOSItemM]

@js.native
trait SystemIcon extends js.Object

object SystemIcon {
  val BOOKMARKS =  "bookmarks".asInstanceOf[SystemIcon]
  val CONTACTS =  "contacts".asInstanceOf[SystemIcon]
  val DOWNLOADS =  "downloads".asInstanceOf[SystemIcon]
  val FAVORITES =  "favorites".asInstanceOf[SystemIcon]
  val FEATURED =  "featured".asInstanceOf[SystemIcon]
  val HISTORY =  "history".asInstanceOf[SystemIcon]
  val MORE =  "more".asInstanceOf[SystemIcon]
  val MOST_RECENT =  "most-recent".asInstanceOf[SystemIcon]
  val MOST_VIEWED =  "most-viewed".asInstanceOf[SystemIcon]
  val RECENTS =  "recents".asInstanceOf[SystemIcon]
  val SEARCH =  "search".asInstanceOf[SystemIcon]
  val TOP_RATED =  "top-rated".asInstanceOf[SystemIcon]
}
