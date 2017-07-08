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
import scala.scalajs.js.annotation.{JSImport, JSName}
import scala.scalajs.js.{|, UndefOr => U}

@js.native
@JSImport("react-native", "ProgressViewIOS")
object ProgressViewIOSComponent extends JSComponent[ProgressViewIOSProps]

trait ProgressViewIOSProps extends js.Object {
  val progress: js.UndefOr[Double] = js.undefined
  val progressImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("progressImage") val progressImageDynamic: js.UndefOr[js.Dynamic] =
    js.undefined
  val trackImage: js.UndefOr[ImageSource] = js.undefined
  @JSName("trackImage") val trackImageDynamic: js.UndefOr[js.Dynamic] =
    js.undefined
  val progressTintColor: js.UndefOr[String] = js.undefined
  val trackTintColor: js.UndefOr[String] = js.undefined
  val progressViewStyle: js.UndefOr[ProgressViewStyle] = js.undefined
}

@js.native
trait ProgressViewStyle extends js.Object

object ProgressViewStyle {
  @inline def BAR = "bar".asInstanceOf[ProgressViewStyle]
  @inline def DEFAULT = "default".asInstanceOf[ProgressViewStyle]
}

object ProgressViewIOS {

  @inline
  def apply(style: OP[js.Any] = NoValue,
            @exclude extraProps: OP[ProgressViewIOSProps] = NoValue,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ProgressViewIOSComponent.type, Unit] =
              null)
    : ReactElement { type Instance = ProgressViewIOSComponent.type } = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => {
      MergeJSObjects(props, v)
    })
    CreateElementJSNoInline[ProgressViewIOSComponent.type](
      ProgressViewIOSComponent,
      props.asInstanceOf[ProgressViewIOSProps])
  }

}
