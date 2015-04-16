void Function(int n) {
    int i, count = 0;
    for(i=1; i*i<=n; i++)
        count++;
}

main() {
    Function(1000000000);
    Function(999999999);
}
