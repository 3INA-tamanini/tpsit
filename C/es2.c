#include <stdio.h>
#include <math.h>
int main(){
    double v,y,lung,massa;
    const double c = 2.99793E8;  
	printf("Inserire la lunghezza dell'oggetto: ");
    scanf("%lf", &lung);
    printf("Inserire la massa dell'oggetto: ");
    scanf("%lf", &massa);
    printf("Inserire una velocità: ");
    scanf("%lf", &v);
	v*=1000.;
    y = sqrt(1-pow(v/c,2));
    //printf("%f", y);

    massa = massa/y-massa;
    lung = lung - lung * y;
    
    printf("%lf", massa);
    printf("%lf", lung);
    

    return 0;
}