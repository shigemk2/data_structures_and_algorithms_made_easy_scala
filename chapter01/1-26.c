void function(int n) {
    int i, j, k , count = 0;
    for(i = n/2; i <= n; i++) {
        for(j = 1; j <= n; j = 2 * j) {
            for(k = 1; k <= n; k = k * 2) {
                count++;
                printf("i: %d, j: %d, k: %d, count: %d\n", i, j, k, count);
            }
        }
    }
}

main() {
    function(8);
}
