object one24 {
  def Function(n: Int): Unit = {
    var i: Int = 0;
    var count: Int = 0;
    while (i * i < n) {
      i = i + 1;
      count = count + 1;
    }
  }

  def main(args: Array[String]) {
    Function(1000000000);
  }
}
