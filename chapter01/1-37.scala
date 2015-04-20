object one37 {
  def function(n: Int): Int = {
    for(1 to 3) {
      n match {
        case n if n <= 1 => 0
        case n => {
          function(3/n)
          // printf("i: %d\n", i)
        }
      }
    }
  }

  def main(args: Array[String]) {
    function(3)
  }
}
