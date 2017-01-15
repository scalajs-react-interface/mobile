package sri.mobile.components

import sri.core.ReactClass
import sri.mobile.WebViewEvent
import sri.universal.ReactEvent
import sri.universal.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
@JSImport("react-native","WebView")
object WebViewClass extends ReactClass


@ScalaJSDefined
trait BaseWebViewProps extends js.Object {
  var contentInset: js.UndefOr[EdgeInsets] = js.undefined
  var javaScriptEnabled: js.UndefOr[Boolean] = js.undefined
  var injectedJavaScript: js.UndefOr[String] = js.undefined
  var scalesPageToFit: js.UndefOr[Boolean] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var onNavigationStateChange: js.UndefOr[js.Function1[NavigationState,Unit]] = js.undefined
  var bounces: js.UndefOr[Boolean] = js.undefined
  var allowUniversalAccessFromFileURLs: js.UndefOr[Boolean] = js.undefined
  var domStorageEnabled: js.UndefOr[Boolean] = js.undefined
  var renderLoading: js.UndefOr[js.Function] = js.undefined
  var automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[js.Dynamic,Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function1[js.Dynamic,Unit]] = js.undefined
  var source: js.UndefOr[WebViewSource] = js.undefined
  var onLoadEnd: js.UndefOr[js.Function0[_]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[ReactEvent[WebViewEvent],_]] = js.undefined
  var renderError: js.UndefOr[js.Function] = js.undefined
  var startInLoadingState: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait BaseWebViewPropsVal extends js.Object {
  val contentInset: js.UndefOr[EdgeInsets] = js.undefined
  val javaScriptEnabled: js.UndefOr[Boolean] = js.undefined
  val injectedJavaScript: js.UndefOr[String] = js.undefined
  val scalesPageToFit: js.UndefOr[Boolean] = js.undefined
  val scrollEnabled: js.UndefOr[Boolean] = js.undefined
  val onNavigationStateChange: js.UndefOr[js.Function1[NavigationState,Unit]] = js.undefined
  val bounces: js.UndefOr[Boolean] = js.undefined
  val allowUniversalAccessFromFileURLs: js.UndefOr[Boolean] = js.undefined
  val domStorageEnabled: js.UndefOr[Boolean] = js.undefined
  val renderLoading: js.UndefOr[js.Function] = js.undefined
  val automaticallyAdjustContentInsets: js.UndefOr[Boolean] = js.undefined
  val onError: js.UndefOr[js.Function1[js.Dynamic,Unit]] = js.undefined
  val onLoadStart: js.UndefOr[js.Function1[js.Dynamic,Unit]] = js.undefined
  val source: js.UndefOr[WebViewSource] = js.undefined
  val onLoadEnd: js.UndefOr[js.Function0[_]] = js.undefined
  val onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  val onMessage: js.UndefOr[js.Function1[ReactEvent[WebViewEvent],_]] = js.undefined
  val renderError: js.UndefOr[js.Function] = js.undefined
  val startInLoadingState: js.UndefOr[Boolean] = js.undefined
}

@ScalaJSDefined
trait WebViewProps extends BaseWebViewProps with BaseViewProps with UniversalProps[WebViewM]

@ScalaJSDefined
trait WebViewPropsVal extends BaseWebViewPropsVal with BaseViewPropsVal with UniversalPropsVal[WebViewM]




@js.native
trait NavigationState extends js.Object {

  def url: String = js.native

  def title: String = js.native

  def loading: Boolean = js.native

  def canGoBack: Boolean = js.native

  def canGoForward: Boolean = js.native

}

@js.native
trait WebViewM extends js.Object {

  def reload(): Unit = js.native

  def updateNavigationState(event: ReactEvent[WebViewEvent]): NavigationState = js.native

  def getWebWiewHandle(): js.Dynamic = js.native

  def goForward(): Unit = js.native

  def goBack(): Unit = js.native

  def onLoadingStart(event: ReactEvent[WebViewEvent]): Unit = js.native

  def onLoadingError(event: ReactEvent[WebViewEvent]): Unit = js.native

  def onLoadingFinish(event: ReactEvent[WebViewEvent]): Unit = js.native

}

@ScalaJSDefined
trait  WebViewSource extends js.Object {
  var uri: String
}
