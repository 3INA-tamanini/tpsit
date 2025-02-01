#include <stdio.h>
#include <string.h>
int main(){
    char str1[100];
    char str2[100];
    char *p;
    int i = 0;
    int verificato = 0;

    printf("Inserire una stringa: ");
    scanf("%s", str1);
    printf("Inserire una stringa: ");
    scanf("%s", str2);

    p = str2;											//Si fa puntare a p l'array str2

    for(i = 0; i < strlen(str2); i++){
        if(strrchr(str1, *(p+strlen(str2)-1-i)) == NULL){					//Controlla tutti i caratteri presenti in str2, partendo dal suo ultimo e spostandosi al suo primo, tramite strrchr che confronta la stringa con il carattere inserito partendo dal fondo di tale stringa
            verificato = 0;									//Se almeno una delle lettere non combacia verificato viene assegnato a 0 (false)
            i = strlen(str2);									//e i viene portato alla lunghezza di str2 per far interrompere immediatamente il ciclo for
        }else{											//altrimenti
            verificato = 1;									//assegna 1 a verificato (true)
        }
    }

    if(verificato == 1){
        printf("La seconda stringa inserita e' contenuta in fondo alla prima stringa");
    }else{
        printf("La seconda stringa NON e' contenuta in fondo alla prima stringa");
    }

    return 0;
}