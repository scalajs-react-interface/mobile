package sri.mobile.components

import sri.core.{JSComponent, _}
import scalajsplus.macros.{FunctionObjectMacro, exclude, rename}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.mobile.WebViewEvent
import sri.universal.components._
import sri.universal.{MergeJSObjects, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("react-native", "WebView")
object WebViewComponent extends JSComponent[WebViewProps] {

  def reload(): Unit = js.native

  def updateNavigationState(event: ReactEvent[WebViewEvent]): NavigationState =
    js.native

  def getWebWiewHandle(): js.Dynamic = js.native

  def goForward(): Unit = js.native

  def goBack(): Unit = js.native

  def onLoadingStart(event: ReactEvent[WebViewEvent]): Unit = js.native

  def onLoadingError(event: ReactEvent[WebViewEvent]): Unit = js.native

  def onLoadingFinish(event: ReactEvent[WebViewEvent]): Unit = js.native
}

trait WebViewProps extends ViewProps {
  val contentInset: js.UndefOr[EdgeInsets] = js.undefined
  val javaScriptEnabled: js.UndefOr[Boolean] = js.undefined
  val injectedJavaScript: js.UndefOr[String] = js.undefined
  val scalesPageToFit: js.UndefOr[Boolean] = js.undefined
  val scrollEnabled: js.UndefOr[Boolean] = js.undefined
  val onNavigationStateChange: js.UndefOr[js.Function1[NavigationState, Unit]] =
    js.undefined
  val bounces: js.UndefOr[Boolean] = js.undefined
  val allowUniversalAccessFromFileURLs: js.UndefOr[Boolean] = js.undefined
  val domStorageEnabled: js.UndefOr[Boolean] = js.undefined
  val renderLoading: js.UndefOr[js.Function] = js.undefined
  val automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  val onError: js.UndefOr[js.Function1[js.Dynamic, Unit]] = js.undefined
  val onLoadStart: js.UndefOr[js.Function1[js.Dynamic, Unit]] = js.undefined
  val source: js.UndefOr[WebViewSource] = js.undefined
  val onLoadEnd: js.UndefOr[js.Function0[_]] = js.undefined
  val onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  val onMessage: js.UndefOr[js.Function1[ReactEvent[WebViewEvent], _]] =
    js.undefined
  val renderError: js.UndefOr[js.Function] = js.undefined
  val startInLoadingState: js.UndefOr[Boolean] = js.undefined
}

@js.native
trait NavigationState extends js.Object {

  def url: String = js.native

  def title: String = js.native

  def loading: Boolean = js.native

  def canGoBack: Boolean = js.native

  def canGoForward: Boolean = js.native

}

trait WebViewSource extends js.Object {
  var uri: String
}

object WebViewSource {
  @inline
  def apply(url: String): WebViewSource = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[WebViewSource]
  }
}

object WebView {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            automaticallyAdjustContentInsets: OP[Boolean] = NoValue,
            startInLoadingState: OP[Boolean] = NoValue,
            thirdPartyCookiesEnabled: OP[Boolean] = NoValue,
            onNavigationStateChange: OP[NavigationState => _] = NoValue,
            source: OP[WebViewSource] = NoValue,
            @exclude extraProps: OP[WebViewProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[WebViewComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = WebViewComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[WebViewComponent.type](
      WebViewComponent,
      props.asInstanceOf[WebViewProps])
  }

}
