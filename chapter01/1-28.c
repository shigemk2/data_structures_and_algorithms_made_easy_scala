function(int n) {
  if(n == 1) return;
  for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= n; j++) {
        printf("i: %d, j: %d\n", i, j);
      }
      function(n-3);
  }
}

main() {
    function(5);
}
