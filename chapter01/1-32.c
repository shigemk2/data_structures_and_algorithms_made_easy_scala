void Read(int n) {
    int k = 1;
    while(k < n) {
        printf("k: %d\n", k);
        k = 3*k;
    }
}

main() {
    Read(90);
}
