function(n) {
    for(int i = 1; i <= n; i++)
        for(int j = 1; j <= n ; j += i)
            printf("i: %d, j: %d\n", i, j);
}

main() {
    function(8);
}
