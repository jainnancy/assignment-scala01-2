class InterpolationListClass {
  def stringInterpolationList(list: List[Int],i: Int): Unit = {
    if(i < list.size) {
      val value = list(i)
      print(s"$i = $value \n")
      stringInterpolationList(list, i + 1)
    }
  }
}