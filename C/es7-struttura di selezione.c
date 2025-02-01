#include <stdio.h>
#include <math.h>

int main() {
    
    float a,b,c,x1,x2;
    printf("inserisci a: ");
    scanf("%f", &a);
    printf("inserisci b: ");
    scanf("%f", &b);
    printf("inserisci c: ");
    scanf("%f", &c);
    
    float DELTA = ((b*b)-4*a*c);
    
    
    //ax^2 + bx + c = 0
    
    
    if(DELTA>0){
        x1=(-b + sqrt(DELTA))/(2*a);
        x2=(-b - sqrt(DELTA))/(2*a);
        printf("X1 = %.2f \n", x1);
        printf("X2 = %.2f", x2);
    }else if(DELTA==0){
        x1=-b/(2*a);
        printf("X = %.2f", x1);
    }else{
        printf("l'equazione non ha soluzioni");
    }
    return 0;
}
