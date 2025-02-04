#include <stdio.h>
#include <stdlib.h>
// stampa di puntatori

int main(){
    int a = 5;//dichiaro variabile di int
    int *pi;  //dichiaro puntatore di int

    pi = &a; //pi punta ad a
    int b = *pi; //assegno a b il valore della variabile puntata da pi, ovvero stampa il valore di a 
    printf("%d\n",b);

    *pi=9; //assegna 9 alla variabile puntata da pi, ovvero ad a
    printf("%d\n", a);

    printf("l'indirizzo di a è: %p\n",&a ); //indirizzo
    printf("il valore di pi è: %p\n", pi);     //indirizzo
    printf("il valore di &*pi è: %p\n", &*pi); //indirizzo
    
    printf("il valore di a è: %p\n", a);       //valore
    printf("il valore di a è: %d\n", *pi);     //valore
    printf("il valore di *&a è: %d\n", *&a);   //valore
    return 0;
}