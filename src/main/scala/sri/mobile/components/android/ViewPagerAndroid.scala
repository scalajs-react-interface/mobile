package sri.mobile.components.android

import sri.core.JSComponent
import sri.mobile.ViewPagerAndroidEvent
import sri.universal.ReactEvent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native","ViewPagerAndroid")
object ViewPagerAndroidComponent extends JSComponent[ViewPagerAndroidProps]

@ScalaJSDefined
trait ViewPagerAndroidProps extends ViewProps {
  val initialPage: js.UndefOr[Int] = js.undefined
  val scrollEnabled: js.UndefOr[Boolean] = js.undefined
  val onPageScroll: js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent],_]] = js.undefined
  val onPageSelected: js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent],_]] = js.undefined
  val onPageScrollStateChanged: js.UndefOr[js.Function1[String,_]] = js.undefined
  val keyboardDismissMode: js.UndefOr[KeyboardDismissModeViewPager] = js.undefined
}

@js.native
trait ViewPagerAndroidM extends js.Object {

  def setPage(selectedPage: Int): Unit = js.native

  def setPageWithoutAnimation(selectedPage: Int): Unit = js.native
}

@js.native
trait KeyboardDismissModeViewPager extends js.Object

object KeyboardDismissModeViewPager {
  val NONE =  "none".asInstanceOf[KeyboardDismissModeViewPager]
  val ON_DRAG =  "on-drag".asInstanceOf[KeyboardDismissModeViewPager]
}
