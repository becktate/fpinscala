package fpinscala.gettingstarted

/**
 * Created by Tate on 3/4/2016.
 */
object Chapter2Tests {
    import PolymorphicFunctions._

    // test implementation of Chapter 2 Exercises
    def main(args: Array[String]): Unit = {
      println("Expected true")
      println("Actual: %s".format(isSorted(Array(1, 24, 34, 35, 100, 200, 300, 840), (x: Int, y: Int) => y >= x)))

      println("Expected false")
      println("Actual: %s".format(isSorted(Array(1, 24, 34, 35, 1, 200, 300, 840),(x: Int, y: Int) => y >= x)))

      println("Expected true")
      println("Actual: %s".format(isSorted(Array(5.6, 5.7, 6.9, 32.2, 100.0, 200.2, 300.6, 840.0), (x: Double, y: Double) => y >= x)))

      println("Expected true")
      println("Actual: %s".format(isSorted(Array("abc", "becky", "zoo", "zy"),(x: String, y: String) => y >= x)))
    }
}
