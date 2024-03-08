#include <stdio.h>
#include <stdlib.h>

int main(){
	double notaA, notaB;
	scanf("%lf%lf",&notaA, &notaB);

    if ((notaA+notaB)/2 >= 7) 
        printf("Aprovado");
    else if ((notaA+notaB)/2 < 7 && (notaA+notaB)/2 >=4)
        printf("Recuperacao");
    else
        printf("Reprovado");

    return 0;
}