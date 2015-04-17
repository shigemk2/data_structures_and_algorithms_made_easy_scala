object one25 {
  def Function(n: Int): Unit = {
    var count: Int = 0
    for(i <- n/2 to n; j <- 1 to n if j + n/2 <= n; k <- Iterator.iterate(1)(_ * 2) takeWhile (_ <= n)) {
      count = count + 1
      printf("i: %d, j: %d, k: %d, count: %d\n", i, j, k, count)
    }
  }

  def main(args: Array[String]) {
    Function(8);
  }
}
