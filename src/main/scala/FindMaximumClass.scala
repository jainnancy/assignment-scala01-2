class FindMaximumClass {

  def findMaximum(list: List[Int], i: Int, j: Int): Int ={

    if(i < 0 || i >= list.length)
      {
        -1
      }
    else if(j < 0 || j >= list.length)
      {
        list(i)
      }
    else {
        if(list(i) >= list (j))
          {
            findMaximum(list, i, j + 1)
          }
        else
          {
            findMaximum(list, i + 1, j)
          }
      }
  }
}
