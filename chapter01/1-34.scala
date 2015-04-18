object one34 {
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case n => fib(n - 1) + fib(n - 2)
  }

  def main(args: Array[String]) {
    println(fib(3))
    println(fib(10))
  }
}
