void function(int n) {
    int i, j, k , count = 0;
    for(i = n/2; i <= n; i++)
        for(j = 1; j + n/2 <= n; j = j + 1)
            for(k = 1; k <= n; k = k * 2)
                count++;
}

main() {
    function(100000);
}
