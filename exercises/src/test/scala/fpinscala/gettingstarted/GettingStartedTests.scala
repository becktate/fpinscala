package fpinscala.gettingstarted

import fpinscala.gettingstarted.PolymorphicFunctions._
import org.scalatest.{FlatSpec, ShouldMatchers}

/**
 * Created by Tate on 3/18/2016.
 */
class GettingStartedTests extends FlatSpec with ShouldMatchers {
  "IsSorted" should "return true when an Array of Ints is sorted according to the sort function" in {
      val arrayToTest = Array(1, 24, 34, 35, 100, 200, 300, 840)
      assert(isSorted(arrayToTest, (x: Int, y:Int) => y >= x))
    }

  "IsSorted" should "return false when an Array of Ints is NOT sorted according to the sort function" in {
    val arrayToTest = Array(1, 24, 34, 35, 1, 200, 300, 840)
    assert(isSorted(arrayToTest, (x: Int, y:Int) => y >= x) === false)
  }

  "IsSorted" should "return true when an Array of Doubles is sorted according to the sort function" in {
    val arrayToTest = Array(100.2, 24.3, 3.4, 1.0, 0.200)
    assert(isSorted(arrayToTest, (x: Double, y:Double) => y <= x))
  }

  "IsSorted" should "return true when an Array of strings is sorted according to the sort function" in {
    val arrayToTest = Array("abc", "becky", "zoo", "zy")
    assert(isSorted(arrayToTest, (x: String, y: String) => y >= x))
  }
}
