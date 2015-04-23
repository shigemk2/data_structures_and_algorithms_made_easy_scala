function (int n) {
    if(n <= 1) return;
    for(int i=1; i < n; i++)
        printf("i: %d\n", i);
    function (0.8*n);
}

main() {
    function(8);
}
