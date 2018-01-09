class FactorialDigitSum {
  def factorial(n: Int): Int =
  {
    if(n == 0)
    {
      1
    }
    else
    {
      n * factorial(n - 1)
    }
  }

  def digitSum(n: Int): Int =
  {
    if(n == 0)
    {
      0
    }
    else
    {
      (n % 10 + digitSum(n / 10))
    }
  }
}
