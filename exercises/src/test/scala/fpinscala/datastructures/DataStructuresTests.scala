package fpinscala.datastructures

import org.scalatest.FlatSpec
import List._

/**
 * Created by Tate on 3/18/2016.
 */
class DataStructuresTests extends FlatSpec {
  "Exercise 1: Pattern Matching Example" should "return 3" in {
    val x = List(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + 14
      case _ => 101
    }
   assert(x == 3)
  }

  "Exercise 2: Nil case: tail(Nil)" should "return NIL" in {
    assert(tail(List(Nil)) === Nil)
  }
  "Exercise 2: 2 element case: tail(List(1,2))" should "return List(2)" in {
    assert(tail(List(1, 2)) === List(2))
  }
  "Exercise 2: > 2 element case: tail(List(1,2,3))" should "return List(2, 3)" in {
    assert(tail(List(1, 2, 3)) === List(2, 3))
  }

  "Exercise 3: Nil case: setHead(Nil, 1)" should "return List(1)" in {
    assert(setHead(List(Nil), 1) === List(1))
  }

  "Exercise 3: 2 element case: setHead(List(1,2), 3)" should "return List(3, 2)" in {
    assert(setHead(List(1, 2), 3) === List(3, 2))
  }

  "Exercise 3: > 2 element case: setHead(List(1,2,3), 4)" should "return List(4, 2, 3)" in {
    assert(setHead(List(1, 2, 3), 4) === List(4, 2, 3))
  }

  "Exercise 4: Nil case: drop(Nil, 1)" should "return Nil" in {
    assert(drop(List(Nil), 1) === Nil)
  }

  "Exercise 4: Whole list drop: drop(List(1, 2, 3), 3)" should "return Nil" in {
    assert(drop(List(1, 2, 3), 3) === Nil)
  }

  "Exercise 4: Partial List drop: drop(List(1,2,3), 2)" should "return List(3)" in {
    assert(drop(List(1, 2, 3), 2) === List(3))
  }

  "Exercise 5: Nil case: dropWhile((NIL, (x: Int) => x == 1))" should "return Nil" in {
    assert(dropWhile(Nil, (x: Int) => x == 1) === Nil)
  }

  "Exercise 5: Single Item Drop: dropWhile(List(1, 2, 3), (x:Int) => x == 1)" should "return List(2, 3)" in {
    assert(dropWhile(List(1, 2, 3), (x:Int) => x == 1) === List(2, 3))
  }

  "Exercise 5: Multi Item Drop: dropWhile(List(1, 1, 2, 3), (x:Int) => x == 1)" should "return List(2, 3)" in {
    assert(dropWhile(List(1, 1, 2, 3), (x:Int) => x == 1) === List(2, 3))
  }

  "Exercise 5: No Item Drop: dropWhile(List(1, 2, 3), (x:Int) => x == 3)" should "return List(1, 2, 3)" in {
    assert(dropWhile(List(1, 2, 3), (x:Int) => x == 3) === List(1, 2, 3))
  }

  "Exercise 6: Nil case: init(NIL)" should "return Nil" in {
    assert(init(Nil) === Nil)
  }

  "Exercise 6: One Item case: init(List(1))" should "return Nil" in {
    assert(init(List(1)) === Nil)
  }

  "Exercise 6: Multi Item Case: init(List(1, 2, 3))" should "return List(1, 2)" in {
    assert(init(List(1, 2, 3)) === List(1, 2))
  }

  "Exercise 8: Call foldRight with Nils and Cons)" should "return exact same list" in {
    assert(foldRight(List(1,2,3), Nil:List[Int])(Cons(_ , _)) === List(1, 2, 3))
  }

  "Exercise 9: Nil case: length(Nil)" should "return 0" in {
    assert(length(Nil:List[Int]) === 0)
  }

  "Exercise 9: One Item case: length(List(1))" should "return 1" in {
    assert(length(List(1)) === 1)
  }

  "Exercise 10: FoldLeft Sum" should "return 10" in {
    val sum = foldLeft(List(1,2,3,4), 0)((x:Int,y:Int) => x + y)
    assert( sum === 10)
  }

  "Exercise 10: FoldLeft Product" should "return 24" in {
    val product = foldLeft(List(1.0,2.0,3.0,4.0), 1.0)((x:Double, y:Double) => x * y)
    assert(product === 24.0)
  }
}
