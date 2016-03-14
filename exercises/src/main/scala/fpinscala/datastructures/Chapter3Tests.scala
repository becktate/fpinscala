package fpinscala.datastructures

/**
 * Created by Tate on 3/9/2016.
 */
object Chapter3Tests {
import List._;
  // test implementation of Chapter 2 Exercises
  def main(args: Array[String]): Unit = {
    val x = List(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + 14
      case _ => 101
    }

    println("Exercise 1: x == 3?? " + (x == 3))

    println("Exercise 2: tail(NIL) == NIL?  " + tail(List(Nil)))
    println("Exercise 2: tail(List(1, 2)) == List(2)?  " + tail(List(1, 2)))
    println("Exercise 2: tail(List(1, 2, 3)) == List(2, 3)?  " + tail(List(1, 2, 3)))
    println()

    println("Exercise 3: setHead(NIL, 1) == Cons(1,NIL)?  " + setHead(List(Nil), 1))
    println("Exercise 3: setHead(List(1, 2), 3) == List(3, 2)?  " + setHead(List(1, 2), 3))
    println("Exercise 3: setHead(List(1, 2, 3), 4) == List(4, 2, 3)?  " + setHead(List(1, 2, 3), 4))
    println()

    println("Exercise 4: drop(NIL, 1) == Nil?  " + drop(List(Nil), 1))
    println("Exercise 4: drop(List(1, 2, 3), 3) == Nil?  " + drop(List(1, 2, 3), 3))
    println("Exercise 4: drop(List(1, 2, 3), 2) == Cons(3, Nil)?  " + drop(List(1, 2, 3), 2))
    println()


    println("Exercise 5: dropWhile(NIL, (x: Int) => x == 1) == Nil?  " + dropWhile(Nil, (x: Int) => x == 1))
    println("Exercise 5: dropWhile(List(1, 1, 2, 3), (x:Int) => x == 1) == List(2, 3)?  " + dropWhile(List(1, 1, 2, 3), (x: Int) => x == 1))
    println("Exercise 5: dropWhile(List(1, 2, 3), (x:Int) => x == 3) == List(1, 2, 3)?  " + dropWhile(List(1, 2, 3), (x: Int) => x == 3))
    println()

    println("Exercise 6: init(NIL) == Nil?  " + init(Nil))
    println("Exercise 6: init(List(1, 2, 3)) == List(1, 2)?  " + init(List(1, 2, 3)))
    println("Exercise 6: init(List(1, 2, 3, 2) == List(1, 2, 3)?  " + init(List(1, 2, 3, 2)))
    println()

    println("Exercise 7: Nope, evaluates arguments first so it traverses the entire list")

    println("Exercise 8: Expect just the same list to get returned...")
    println("Exercise 8: what happens if you call foldright with Nils and Cons?  " + foldRight(List(1,2,3), Nil:List[Int])(Cons(_ , _)))
    println()

    println("Exercise 9: ")
  }
}

