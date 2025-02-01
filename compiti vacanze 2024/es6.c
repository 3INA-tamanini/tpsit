#include <stdio.h>
#include <string.h>
int main(){
    char str1[100];
    char str2[100];
    char *p, *k;
    int i = 0;

    printf("Inserire una stringa: ");
    scanf("%s", str1);
    printf("Inserire una stringa: ");
    scanf("%s", str2);

    p = str1;								//Si fa puntare a p il primo valore di str1
    k = str2;								//Si fa puntare a k il primo valore di str2

    for(i = 0; i < strlen(str2); i++){					
        *(p+strlen(str1)) = *(k+i);					//Assegna ogni carattere di str2 a partire dal primo valore vuoto di str1
    }

    printf("Le due parole messe in sequenza sono: %s", str1);

    return 0;
}