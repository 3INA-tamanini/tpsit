#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    char copia[100];
    int i = 0;
    int j = 0;

    printf("Inserire una parola palindroma: "); //chiedo in input una stringa
    scanf("%s", str);

    j = strlen(str)-1;				//Assegna a j l'ultima posizione di str

    for(i = 0; i < strlen(str); i++){
        copia[i] = str[j];			//Copia la parola presente in str al contrario all'interno di copia
        j--;
    }

    if(strcmp(str,copia) == 0){			//Confronta le due stringhe
        printf("La stringa inserita e' palindroma");
    }else{
        printf("La stringa inserita NON e' palindroma");
    }

    return 0;
}