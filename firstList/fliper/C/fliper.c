#include <stdio.h>
#include <stdlib.h>

int mian() {
    int numP, numR;

    scanf("%d%d", &numP, &numR);

    if (numP) {
        printf("%c", numR ? 'A' : 'B');
    } else {
        printf("C");
    }

    return 0;
}