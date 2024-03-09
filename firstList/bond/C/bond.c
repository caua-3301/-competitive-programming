#include <stdio.h>
#include <stdlib.h>

int main() {
    int alu, moni;

    scanf("%d%d", &alu, &moni);
    printf("%c", (alu+moni) > 50 ? 'N' : 'S');

    return 0;
}