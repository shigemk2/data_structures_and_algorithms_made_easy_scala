object one37 {
  def function(n: Int): Int = {
    for(i <- 1 to 3) {
      n match {
        case n if n <= 1 => 0
        case n => {
          function(3/n)
          println(s"i: $i")
        }
      }
    }
    0
  }

  def main(args: Array[String]) {
    function(3)
  }
}
