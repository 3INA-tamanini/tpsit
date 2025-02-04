#include <stdio.h>
#include <stdlib.h>

int main(){
    int a = 10, b = 20, temp;
    int *pa, *pb;

    printf("valore di a: %d\n",a);
    printf("valore di b: %d\n", b);
    pa = &a;
    pb = &b;
    temp = *pa;
    *pa = *pb;
    *pb = temp;
    printf("valore di a: %d\n",a);
    printf("valore di b: %d\n", b);
    return 0;
}