package sri.mobile.components.android

import sri.core.{JSComponent, _}
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => OP
}
import sri.mobile.ViewPagerAndroidEvent
import sri.universal.components._
import sri.universal.{MergeJSObjects, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.{|, UndefOr => U}

@js.native
@JSImport("react-native", "ViewPagerAndroid")
object ViewPagerAndroidComponent extends JSComponent[ViewPagerAndroidProps]

trait ViewPagerAndroidProps extends ViewProps {
  val initialPage: js.UndefOr[Int] = js.undefined
  val scrollEnabled: js.UndefOr[Boolean] = js.undefined
  val onPageScroll
    : js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent], _]] =
    js.undefined
  val onPageSelected
    : js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent], _]] =
    js.undefined
  val onPageScrollStateChanged: js.UndefOr[js.Function1[String, _]] =
    js.undefined
  val keyboardDismissMode: js.UndefOr[KeyboardDismissModeViewPager] =
    js.undefined
}

@js.native
trait ViewPagerAndroidM extends js.Object {

  def setPage(selectedPage: Int): Unit = js.native

  def setPageWithoutAnimation(selectedPage: Int): Unit = js.native
}

@js.native
trait KeyboardDismissModeViewPager extends js.Object

object KeyboardDismissModeViewPager {
  val NONE = "none".asInstanceOf[KeyboardDismissModeViewPager]
  val ON_DRAG = "on-drag".asInstanceOf[KeyboardDismissModeViewPager]
}

object ViewPagerAndroid {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            initialPage: OP[Int] = NoValue,
            onPageScrollStateChanged: OP[String => _] = NoValue,
            onPageScroll: OP[ReactEvent[ViewPagerAndroidEvent] => _] = NoValue,
            onPageSelected: OP[ReactEvent[ViewPagerAndroidEvent] => _] =
              NoValue,
            @exclude extraProps: OP[ViewPagerAndroidProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ViewPagerAndroidComponent.type, Unit] =
              null)(children: ReactNode*)
    : ReactElement { type Instance = ViewPagerAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[ViewPagerAndroidComponent.type](
      ViewPagerAndroidComponent,
      props.asInstanceOf[ViewPagerAndroidProps],
      children = children.toJSArray)
  }

}

object ViewPagerAndroidC {

  @inline
  def apply(children: ReactNode*) =
    CreateElementJSNoInline[ViewPagerAndroidComponent.type](
      ViewPagerAndroidComponent,
      js.Dynamic.literal().asInstanceOf[ViewPagerAndroidProps],
      children = children.toJSArray)

}
