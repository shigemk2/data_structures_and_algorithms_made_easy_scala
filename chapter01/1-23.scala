def Function(n: Int): Unit = {
  var i = 1;
  var s = 1;
  while(s <= n) {
    i = i + 1
    s = s + i
    printf("*")
  }
}
Function(5)
