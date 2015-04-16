object one23 {
  def Function(n: Int): Unit = {
    var i = 1;
    var s = 1;
    while(s <= n) {
      i = i + 1
      s = s + i
      printf("*")
    }
  }
  def main(args: Array[String]) {
    Function(5)
  }
}
