object one38 {
  def function(n: Int): Int = {
    for(i <- 1 to 3) {
      n match {
        case n if n <= 1 => 0
        case n => {
          println(s"i: $i")
          function(n - 1)
        }
      }
    }
    0
  }

  def main(args: Array[String]) {
    function(3)
  }
}
