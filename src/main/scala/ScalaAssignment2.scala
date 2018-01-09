class ScalaAssignment2 {

  def stringInterpolationList(list: List[Int]): Unit = {

    for(i <- 0 to list.size - 1)
      {
        print(s"$i = ${list(i)} \n")
      }
  }


  def fibonacci(num: Int): Int = {
    if (num == 0) {
      0
    }
    else if (num == 1) {
      1
    }
    else {
      (fibonacci(num - 1) + fibonacci(num - 2))
    }
  }
}
object MainClass extends App {
  val a = 10
  val b = 20
  val c = 30
  val d = 40
  val list = List(a, b, c, d)
  val obj = new ScalaAssignment2
  obj.stringInterpolationList(list)
val n = 2
  val fibResult = obj.fibonacci(n)
  print(s"value at $n = $fibResult")
}



