#include <stdio.h>
int main(){
    char str[100];
    int i = 0;
    int caratteri = 0;

    printf("Inserire una stringa: ");//chiedo in input una stringa
    scanf("%s", str);

    while(str[i] != NULL){      //Il ciclo while incrementa caratteri ed i fintanto che il carattere presente nella posizione i è diverso da NULL
        caratteri++;
        i++;
    }

    printf("La stringa inserita e' composta da %d caratteri", caratteri);

    return 0;
}