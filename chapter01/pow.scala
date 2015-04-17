for(i <- Iterator.iterate(1)(_ * 2) takeWhile (_ <= 8)) {
  println(i)
}
