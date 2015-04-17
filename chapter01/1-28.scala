object one28 {
  def function(n: Int) {
    if (n == 1) return
    for (i <- 1 to n) {
      for (j <- 1 to n) {
        printf("i: %d, j: %d\n", i, j);
      }
      function(n-3)
    }
  }

  def main(args: Array[String]) {
    function(5);
  }
}
