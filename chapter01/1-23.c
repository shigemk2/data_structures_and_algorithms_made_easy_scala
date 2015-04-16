void Function(int n) {
    int i = 1, s = 1;
    while(s <= n) {
        i++;
        s = s+i;
        printf("i: %d, s: %d\n", i, s);
        printf("*\n");
    }
}

main() {
    Function(30);
}
