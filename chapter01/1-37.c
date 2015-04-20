function(int n) {
    if(n <= 1) return;
    for (int i = 1 ; i <= 3; i++) {
        printf("i: %d\n", i);
        function(3/n);
    }
}

main() {
    function(2);
}
