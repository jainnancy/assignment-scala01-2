class FibonacciClass {
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
