package sri.mobile.components

import sri.core.{React, _}
import sri.mobile.components.android._
import sri.mobile.components.ios._

import scala.scalajs.js
import scala.scalajs.js.|

trait MobileComponents {
  @inline
  def WebView(
      props: WebViewProps | WebViewPropsVal =
        js.Dynamic.literal().asInstanceOf[WebViewProps]) =
    React.createElement(WebViewClass, props)

  @inline
  def StatusBar(
      props: StatusBarProps | StatusBarPropsVal =
        js.Dynamic.literal().asInstanceOf[StatusBarProps]) =
    React.createElement(StatusBarClass, props)

  @inline
  def DrawerLayoutAndroid(
      props: DrawerLayoutAndroidProps | DrawerLayoutAndroidPropsVal)(
      children: ReactNode*) =
    React.createElement(DrawerLayoutAndroidClass, props, children: _*)

  @inline
  def ProgressBarAndroid(
      props: ProgressBarAndroidProps | ProgressBarAndroidPropsVal =
        js.Dynamic.literal().asInstanceOf[ProgressBarAndroidProps]) =
    React.createElement(ProgressBarAndroidClass, props)

  @inline
  def ToolbarAndroid(props: ToolbarAndroidProps | ToolbarAndroidPropsVal)(
      children: ReactNode*) =
    React.createElement(ToolbarAndroidClass, props, children: _*)

  @inline
  def ToolbarAndroid(children: ReactNode*) =
    React.createElement(ToolbarAndroidClass,
                        js.Dynamic.literal(),
                        children: _*)

  @inline
  def TouchableNativeFeedback(
      props: TouchableNativeFeedbackProps | TouchableNativeFeedbackPropsVal)(
      children: ReactNode*) =
    React.createElement(TouchableNativeFeedbackClass, props, children: _*)

  @inline
  def TouchableNativeFeedback(children: ReactNode*) =
    React.createElement(TouchableNativeFeedbackClass,
                        js.Dynamic.literal(),
                        children: _*)

  @inline
  def DatePickerIOS(props: DatePickerIOSProps | DatePickerIOSPropsVal) =
    React.createElement(DatePickerIOSClass, props)

  @inline
  def PickerIOS[T](props: PickerIOSProps[T] | PickerIOSPropsVal[T])(
      children: ReactNode*) =
    React.createElement(PickerIOSClass, props, children: _*)

  @inline
  def PickerIOS(children: ReactNode*) =
    React.createElement(PickerIOSClass, js.Dynamic.literal(), children: _*)

  @inline
  def PickerItemIOS[T](
      props: PickerIOSItemProps[T] | PickerIOSItemPropsVal[T]) =
    React.createElement(PickerIOSItemClass, props)

  @inline
  def ProgressViewIOS(
      props: ProgressViewIOSProps | ProgressViewIOSPropsVal =
        js.Dynamic.literal().asInstanceOf[ProgressViewIOSProps]) =
    React.createElement(ProgressViewIOSClass, props)

  @inline
  def SegmentedControlIOS(
      props: SegmentedControlIOSProps | SegmentedControlIOSPropsVal =
        js.Dynamic.literal().asInstanceOf[SegmentedControlIOSProps]) =
    React.createElement(SegmentedControlIOSClass, props)

  @inline
  def TabBarIOS(props: TabBarIOSProps | TabBarIOSPropsVal)(
      children: ReactNode*) =
    React.createElement(TabBarIOSClass, props, children: _*)

  @inline
  def TabBarIOS(children: ReactNode*) =
    React.createElement(TabBarIOSClass, js.Dynamic.literal(), children: _*)

  @inline
  def TabBarIOSItem(props: TabBarIOSItemProps | TabBarIOSItemPropsVal)(
      children: ReactElement) =
    React.createElement(TabBarIOSItemClass, props, children)

  @inline
  def ViewPagerAndroid(
      props: ViewPagerAndroidProps | ViewPagerAndroidPropsVal)(
      children: ReactNode*) =
    React.createElement(ViewPagerAndroidClass, props, children: _*)

  @inline
  def ViewPagerAndroid(children: ReactNode*) =
    React.createElement(ViewPagerAndroidClass,
                        js.Dynamic.literal(),
                        children: _*)

}
