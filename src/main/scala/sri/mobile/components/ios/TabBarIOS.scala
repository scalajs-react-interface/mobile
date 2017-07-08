package sri.mobile.components.ios

import sri.core.{JSComponent, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.universal.MergeJSObjects
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "TabBarIOS")
object TabBarIOSComponent extends JSComponent[TabBarIOSProps]

trait TabBarIOSProps extends js.Object {
  val barTintColor: js.UndefOr[String] = js.undefined
  val tintColor: js.UndefOr[String] = js.undefined
  val unselectedItemTintColor: js.UndefOr[String] = js.undefined
  val translucent: js.UndefOr[Boolean] = js.undefined
}

@js.native
@JSImport("react-native", "TabBarIOSItem")
object TabBarIOSItemComponent extends JSComponent[TabBarIOSItemProps]

trait TabBarIOSItemProps extends ViewProps {
  val systemIcon: js.UndefOr[SystemIcon] = js.undefined
  val selectedIcon: js.UndefOr[ImageSource] = js.undefined
  val onPress: js.Function0[Unit]
  val icon: js.UndefOr[ImageSource] = js.undefined
  val selected: Boolean
  val badgeColor: js.UndefOr[String] = js.undefined
  val badge: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[String] = js.undefined
}

@js.native
trait SystemIcon extends js.Object

object SystemIcon {
  val BOOKMARKS = "bookmarks".asInstanceOf[SystemIcon]
  val CONTACTS = "contacts".asInstanceOf[SystemIcon]
  val DOWNLOADS = "downloads".asInstanceOf[SystemIcon]
  val FAVORITES = "favorites".asInstanceOf[SystemIcon]
  val FEATURED = "featured".asInstanceOf[SystemIcon]
  val HISTORY = "history".asInstanceOf[SystemIcon]
  val MORE = "more".asInstanceOf[SystemIcon]
  val MOST_RECENT = "most-recent".asInstanceOf[SystemIcon]
  val MOST_VIEWED = "most-viewed".asInstanceOf[SystemIcon]
  val RECENTS = "recents".asInstanceOf[SystemIcon]
  val SEARCH = "search".asInstanceOf[SystemIcon]
  val TOP_RATED = "top-rated".asInstanceOf[SystemIcon]
}

object TabBarIOS {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            @exclude extraProps: OP[TabBarIOSProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[TabBarIOSComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = TabBarIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[TabBarIOSComponent.type](
      TabBarIOSComponent,
      props.asInstanceOf[TabBarIOSProps],
      children = children.toJSArray)
  }

}

object TabBarIOSC {

  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[TabBarIOSComponent.type](
      TabBarIOSComponent,
      js.Dynamic.literal().asInstanceOf[TabBarIOSProps],
      children = children.toJSArray)

}

object TabBarIOSItem {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            @exclude extraProps: OP[TabBarIOSItemProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[TabBarIOSItemComponent.type, Unit] =
              null)(children: ReactNode)
    : ReactElement { type Instance = TabBarIOSItemComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[TabBarIOSItemComponent.type](
      TabBarIOSItemComponent,
      props.asInstanceOf[TabBarIOSItemProps],
      children = js.Array(children))
  }

}
