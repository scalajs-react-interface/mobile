package sri.mobile.apis

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@js.native
trait Dimensions extends js.Object{

  def get(in : String) : WindowDimensions = js.native

  def set(dims : js.Dictionary[js.Any]) : Boolean = js.native
}

@js.native
@JSImport("react-native","Dimensions")
object Dimensions extends Dimensions

@ScalaJSDefined
trait WindowDimensions extends js.Object {

  val width : Double

  val height : Double

}
