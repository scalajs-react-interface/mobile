package sri.mobile.components.android

import sri.core.JSComponent

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.{UndefOr => U}



@js.native
@JSImport("react-native","ProgressBarAndroid")
object ProgressBarAndroidComponent extends JSComponent[ProgressBarAndroidProps]

@ScalaJSDefined
trait ProgressBarAndroidProps extends js.Object {
  val styleAttr: js.UndefOr[ProgressBarAndroidStyle] = js.undefined
  val color: js.UndefOr[String] = js.undefined
  val progress: js.UndefOr[Double] = js.undefined
  val indeterminate: js.UndefOr[Boolean] = js.undefined
  val testID: js.UndefOr[String] = js.undefined
}



@js.native
trait ProgressBarAndroidStyle extends js.Object


object ProgressBarAndroidStyle {
  @inline def HORIZONTAL =  "Horizontal".asInstanceOf[ProgressBarAndroidStyle]
  @inline def SMALL =  "Small".asInstanceOf[ProgressBarAndroidStyle]
  @inline def LARGE =  "Large".asInstanceOf[ProgressBarAndroidStyle]
  @inline def Inverse =  "Inverse".asInstanceOf[ProgressBarAndroidStyle]
  @inline def SmallInverse =  "SmallInverse".asInstanceOf[ProgressBarAndroidStyle]
  @inline def LargeInverse =  "LargeInverse".asInstanceOf[ProgressBarAndroidStyle]
}