object one35 {
  def function(n: Int) {
    for (i <- 1 to n; j <- 1 to n by i) println(s"i: $i, j: $j")
  }

  def main(args: Array[String]) {
    function(8)
  }
}
