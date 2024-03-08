#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){    	
    double numX, numY;

    scanf("%lf%lf", &numX, &numY);
    printf("%.4f", pow(numX, numY));

    return 0;
}