package sri.mobile.components.android

import sri.core.ReactClass
import sri.universal.components.{UniversalProps, UniversalPropsVal}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}



@js.native
@JSImport("react-native","ProgressBarAndroid")
object ProgressBarAndroidClass extends ReactClass

@js.native
trait ProgressBarAndroidM extends js.Object

@ScalaJSDefined
trait BaseProgressBarAndroidProps extends js.Object {
  var styleAttr: js.UndefOr[ProgressBarAndroidStyle] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var progress: js.UndefOr[Double] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait BaseProgressBarAndroidPropsVal extends js.Object {
  val styleAttr: js.UndefOr[ProgressBarAndroidStyle] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val progress: js.UndefOr[Double] = js.undefined
  val indeterminate: js.UndefOr[Boolean] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait ProgressBarAndroidProps extends BaseProgressBarAndroidProps  with UniversalProps[ProgressBarAndroidM]

@ScalaJSDefined
trait ProgressBarAndroidPropsVal extends BaseProgressBarAndroidPropsVal  with UniversalPropsVal[ProgressBarAndroidM]

@js.native
trait ProgressBarAndroidStyle extends js.Object

object ProgressBarAndroidStyle {
  val HORIZONTAL =  "Horizontal".asInstanceOf[ProgressBarAndroidStyle]
  val SMALL =  "Small".asInstanceOf[ProgressBarAndroidStyle]
  val LARGE =  "Large".asInstanceOf[ProgressBarAndroidStyle]
  val Inverse =  "Inverse".asInstanceOf[ProgressBarAndroidStyle]
  val SmallInverse =  "SmallInverse".asInstanceOf[ProgressBarAndroidStyle]
  val LargeInverse =  "LargeInverse".asInstanceOf[ProgressBarAndroidStyle]
}
