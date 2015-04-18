object one32 {
  def function(n: Int) {
    for(k <- Iterator.iterate(1)(_ * 2) takeWhile (_ <= n)) printf("k: %d\n", k);
  }

  def main(args: Array[String]) {
    function(90);
  }
}
