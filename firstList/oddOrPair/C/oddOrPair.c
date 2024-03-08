#include <stdio.h>
#include <stdlib.h>

int main(){
	int numB, numC;

    scanf("%d%d", &numB, &numC);
    printf("%s", (numB+numC) % 2 == 0 ? "Bino" : "Cino");

    return 0;
}