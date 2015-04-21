// C版の完全な移植は不可能
object one35 {
  def function(n: Int) {
    for (i <- 1 to n; j <- 1 to n by i) println(s"i: $i, j: $j")
  }

  def main(args: Array[String]) {
    function(8)
  }
}
