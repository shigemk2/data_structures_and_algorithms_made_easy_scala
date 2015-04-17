object one27 {
  def function(n: Int) {
    if (n == 1) return
    for (i <- 1 to n; j <- 1 to n if j <= 1) printf("i: %d, j: %d\n", i, j);
  }

  def main(args: Array[String]) {
    function(8);
  }
}
