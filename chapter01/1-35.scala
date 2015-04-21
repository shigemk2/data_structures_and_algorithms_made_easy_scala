// C版の完全な移植は不可能
object one35 {
  def function(n: Int) {
    for {
      i <- 1 to n
      j <- 1 to n by i
    } printf("i: %d, j: %d\n", i, j)
    // for(i <- 1 to n; j <- 1 to n if j + i <= n) printf("i: %d, j: %d\n", i, j)
  }

  def main(args: Array[String]) {
    function(8)
  }
}
