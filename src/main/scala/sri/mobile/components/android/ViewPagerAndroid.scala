package sri.mobile.components.android

import sri.core.ReactClass
import sri.mobile.ViewPagerAndroidEvent
import sri.universal.ReactEvent
import sri.universal.components.{BaseViewProps, BaseViewPropsVal, UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}


@js.native
@JSImport("react-native","ViewPagerAndroid")
object ViewPagerAndroidClass extends ReactClass


@ScalaJSDefined
trait BaseViewPagerAndroidProps extends js.Object {
  var initialPage: js.UndefOr[Int] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var onPageScroll: js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent],_]] = js.undefined
  var onPageSelected: js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent],_]] = js.undefined
  var onPageScrollStateChanged: js.UndefOr[js.Function1[String,_]] = js.undefined
  var keyboardDismissMode: js.UndefOr[KeyboardDismissModeViewPager] = js.undefined
}

@ScalaJSDefined
trait BaseViewPagerAndroidPropsVal extends js.Object {
  val initialPage: js.UndefOr[Int] = js.undefined
  val scrollEnabled: js.UndefOr[Boolean] = js.undefined
  val onPageScroll: js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent],_]] = js.undefined
  val onPageSelected: js.UndefOr[js.Function1[ReactEvent[ViewPagerAndroidEvent],_]] = js.undefined
  val onPageScrollStateChanged: js.UndefOr[js.Function1[String,_]] = js.undefined
  val keyboardDismissMode: js.UndefOr[KeyboardDismissModeViewPager] = js.undefined
}

@ScalaJSDefined
trait ViewPagerAndroidProps extends BaseViewPagerAndroidProps with BaseViewProps with UniversalProps[ViewPagerAndroidM]

@ScalaJSDefined
trait ViewPagerAndroidPropsVal extends BaseViewPagerAndroidPropsVal with BaseViewPropsVal with UniversalPropsVal[ViewPagerAndroidM]




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
