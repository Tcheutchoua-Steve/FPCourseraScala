package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(union(singletonSet(3), singletonSet(4)))
  println(contains(union(singletonSet(3), singletonSet(4)),45))

  println(forall(union(singletonSet(1), singletonSet(2)), (i: Int) => {
    println(i)
    true
  }))
}
