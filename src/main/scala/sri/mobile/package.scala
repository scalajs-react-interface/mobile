package sri

import sri.mobile.apis.Dimensions
import sri.universal.UniversalAll

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{global => g, literal => json}

package object mobile {

  trait MobileAll extends UniversalAll {

    def windowDimensions = Dimensions.get("window")

  }

  object all extends MobileAll

  private[mobile] type U[T] = js.UndefOr[T]
  private[mobile] val undefined = js.undefined

}
