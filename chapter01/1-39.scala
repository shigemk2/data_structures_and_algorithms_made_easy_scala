object one39 {
  def function(n: Int): Int = {
    if (n <= 1) return 0
    for(i <- 1 to n) {
      println(s"i: $i")
    }
    function(0.8*n toInt)
    0
  }

  def main(args: Array[String]) {
    function(8)
  }
}
