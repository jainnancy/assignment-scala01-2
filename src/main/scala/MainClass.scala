object MainClass extends App {
  val a = 0
  val b = 200
  val c = 30
  val d = 40
  val list = List(a, b, c, d)
  //Question 1
  val interList = new InterpolationListClass
  print("Output of string Interpolation \n")
  interList.stringInterpolationList(list,0)

  //Question 2
  val max = new FindMaximumClass
  if(list.isEmpty)
  {
    print("List is empty \n")
  }
  else {
    val maxResult = max.findMaximum(list, 0, 1)
    print(s"maximum value in list is $maxResult \n")
  }

  //Question 3
  val value = 3
  val fibonacci = new FibonacciClass
  val fibResult = fibonacci.fibonacci(value)
  print(s"value at $value in Fibonacci series is $fibResult \n")

  //Question 4
  val number = 5
  val factorialSum = new FactorialDigitSum
  val factorialResult = factorialSum.factorial(number)
  val sumResult = factorialSum.digitSum(factorialResult)
  print(s"Sum of digits of $number! = $sumResult \n")

}
