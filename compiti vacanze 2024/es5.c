#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    int i = 0;
    int controllo = 0;

    printf("Inserire una parola: ");
    scanf("%s", str);

    for(i = 0; i < 10; i++){
        if(str[i] == 'a'){							//Se è presente la lettera a all'interno di almeno uno dei primi 10 caratteri di str assegna il valore 1 a controllo
            i = 10;
            controllo = 1;
        }
    }

    if(controllo == 1){								//Se controllo è uguale a 1 (true) restituisce
        printf("La lettera A e' contenuta almeno una volta nella stringa");	//questa stringa
    }else{									//altrimenti restituisce
        printf("La lettera A NON e' contenuta nella stringa");			//questa stringa
    }

    return 0;
}