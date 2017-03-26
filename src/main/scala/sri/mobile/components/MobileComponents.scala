package sri.mobile.components

import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault => NoValue,
  OptionalParam => U
}
import sri.mobile.ViewPagerAndroidEvent
import sri.mobile.components.android._
import sri.mobile.components.ios._
import sri.universal.{MergeJSObjects, ReactEvent}
import sri.universal.components.ImageSource

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|

trait MobileComponents {
  @inline
  def WebView(style: U[js.Any] = NoValue,
              automaticallyAdjustContentInsets: U[Boolean] = NoValue,
              startInLoadingState: U[Boolean] = NoValue,
              onNavigationStateChange: U[NavigationState => _] = NoValue,
              source: U[WebViewSource] = NoValue,
              @exclude extraProps: U[WebViewProps] = NoValue,
              @exclude key: String | Int = null,
              @exclude ref: js.Function1[WebViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = WebViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[WebViewComponent.type](WebViewComponent,
                                           props.asInstanceOf[WebViewProps])
  }

  @inline
  def StatusBar(style: U[js.Any] = NoValue,
                @exclude extraProps: U[StatusBarProps] = NoValue,
                @exclude key: String | Int = null,
                @exclude ref: js.Function1[StatusBarComponent.type, Unit] =
                  null)(children: ReactNode*)
    : ReactElement { type Instance = StatusBarComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[StatusBarComponent.type](
      StatusBarComponent,
      props.asInstanceOf[StatusBarProps])
  }

  @inline
  def DrawerLayoutAndroid(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[DrawerLayoutAndroidProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[DrawerLayoutAndroidComponent.type, Unit] =
        null)(children: ReactNode*)
    : ReactElement { type Instance = DrawerLayoutAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[DrawerLayoutAndroidComponent.type](
      DrawerLayoutAndroidComponent,
      props.asInstanceOf[DrawerLayoutAndroidProps],
      children = children.toJSArray)
  }

  @inline
  def ProgressBarAndroid(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[ProgressBarAndroidProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ProgressBarAndroidComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ProgressBarAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ProgressBarAndroidComponent.type](
      ProgressBarAndroidComponent,
      props.asInstanceOf[ProgressBarAndroidProps])
  }

  @inline
  def ToolbarAndroid(
      style: U[js.Any] = NoValue,
      actions: U[js.Array[ToolbarAndroidAction]] = NoValue,
      title: U[String] = NoValue,
      titleColor: U[String] = NoValue,
      subtitle: U[String] = NoValue,
      subtitleColor: U[String] = NoValue,
      logo: U[ImageSource] = NoValue,
      navIcon: U[ImageSource] = NoValue,
      onActionSelected: U[Int => _] = NoValue,
      @rename("navIcon") navIconDynamic: U[js.Any] = NoValue,
      @rename("logo") logoDynamic: U[js.Any] = NoValue,
      @exclude extraProps: U[ToolbarAndroidProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ToolbarAndroidComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ToolbarAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ToolbarAndroidComponent.type](
      ToolbarAndroidComponent,
      props.asInstanceOf[ToolbarAndroidProps],
      children = children.toJSArray)
  }

  @inline
  def TouchableNativeFeedback(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[TouchableNativeFeedbackProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TouchableNativeFeedbackComponent.type, Unit] =
        null)(children: ReactNode*): ReactElement {
    type Instance = TouchableNativeFeedbackComponent.type
  } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TouchableNativeFeedbackComponent.type](
      TouchableNativeFeedbackComponent,
      props.asInstanceOf[TouchableNativeFeedbackProps],
      children = children.toJSArray)
  }

  @inline
  def TouchableNativeFeedback(children: ReactNode*) =
    CreateElementJS[TouchableNativeFeedbackComponent.type](
      TouchableNativeFeedbackComponent,
      js.Dynamic.literal().asInstanceOf[TouchableNativeFeedbackProps],
      children = children.toJSArray)

  @inline
  def DatePickerIOS(
      style: U[js.Any] = NoValue,
      mode: U[DatePickerIOSMode] = NoValue,
      minuteInterval: U[MinuteInterval] = NoValue,
      timeZoneOffsetInMinutes: U[Int] = NoValue,
      onDateChange: U[js.Date => _] = NoValue,
      date: js.Date,
      @exclude extraProps: U[DatePickerIOSProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[DatePickerIOSComponent.type, Unit] = null)
    : ReactElement { type Instance = DatePickerIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[DatePickerIOSComponent.type](
      DatePickerIOSComponent,
      props.asInstanceOf[DatePickerIOSProps])
  }

  @inline
  def ProgressViewIOS(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[ProgressViewIOSProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ProgressViewIOSComponent.type, Unit] = null)
    : ReactElement { type Instance = ProgressViewIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ProgressViewIOSComponent.type](
      ProgressViewIOSComponent,
      props.asInstanceOf[ProgressViewIOSProps])
  }

  @inline
  def SegmentedControlIOS(
      style: U[js.Any] = NoValue,
      tintColor: U[String] = NoValue,
      selectedIndex: U[Int] = NoValue,
      enabled: U[Boolean] = NoValue,
      momentary: U[Boolean] = NoValue,
      onChange: U[js.Dynamic => _] = NoValue,
      onValueChange: U[String => _] = NoValue,
      values: js.Array[String],
      @exclude extraProps: U[SegmentedControlIOSProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[SegmentedControlIOSComponent.type, Unit] =
        null)
    : ReactElement { type Instance = SegmentedControlIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[SegmentedControlIOSComponent.type](
      SegmentedControlIOSComponent,
      props.asInstanceOf[SegmentedControlIOSProps])
  }

  @inline
  def TabBarIOS(style: U[js.Any] = NoValue,
                @exclude extraProps: U[TabBarIOSProps] = NoValue,
                @exclude key: String | Int = null,
                @exclude ref: js.Function1[TabBarIOSComponent.type, Unit] =
                  null)(children: ReactNode*)
    : ReactElement { type Instance = TabBarIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TabBarIOSComponent.type](
      TabBarIOSComponent,
      props.asInstanceOf[TabBarIOSProps],
      children = children.toJSArray)
  }

  @inline
  def TabBarIOS(children: ReactNode*) =
    CreateElementJS[TabBarIOSComponent.type](
      TabBarIOSComponent,
      js.Dynamic.literal().asInstanceOf[TabBarIOSProps],
      children = children.toJSArray)

  @inline
  def TabBarIOSItem(
      style: U[js.Any] = NoValue,
      @exclude extraProps: U[TabBarIOSItemProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[TabBarIOSItemComponent.type, Unit] = null)(
      children: ReactNode)
    : ReactElement { type Instance = TabBarIOSItemComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TabBarIOSItemComponent.type](
      TabBarIOSItemComponent,
      props.asInstanceOf[TabBarIOSItemProps],
      children = js.Array(children))
  }

  @inline
  def ViewPagerAndroid(
      style: U[js.Any] = NoValue,
      initialPage: U[Int] = NoValue,
      onPageScrollStateChanged: U[String => _] = NoValue,
      onPageScroll: U[ReactEvent[ViewPagerAndroidEvent] => _] = NoValue,
      onPageSelected: U[ReactEvent[ViewPagerAndroidEvent] => _] = NoValue,
      @exclude extraProps: U[ViewPagerAndroidProps] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ViewPagerAndroidComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = ViewPagerAndroidComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ViewPagerAndroidComponent.type](
      ViewPagerAndroidComponent,
      props.asInstanceOf[ViewPagerAndroidProps],
      children = children.toJSArray)
  }

  @inline
  def ViewPagerAndroid(children: ReactNode*) =
    CreateElementJS[ViewPagerAndroidComponent.type](
      ViewPagerAndroidComponent,
      js.Dynamic.literal().asInstanceOf[ViewPagerAndroidProps],
      children = children.toJSArray)

}
