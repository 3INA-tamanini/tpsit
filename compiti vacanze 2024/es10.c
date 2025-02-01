#include <stdio.h>
#include <string.h>
int main(){
    char str1[100];
    char str2[100];
    char *mag,*min;
    int i, j;
    int occorrenze = 0;
    int temp = 0;

    printf("Inserire una stringa: ");   
    scanf("%s", str1);
    printf("Inserire una stringa: ");
    scanf("%s", str2);

    if(strlen(str1) >= strlen(str2)){
       mag = str1;
       min = str2; 
    }else{                              //si utilizzano i puntatori per puntare la stringa più grande e la stringa più piccola
        mag = str2;
        min = str1;
    }

    for(i = 0; i < strlen(mag); i++){
        if(*(mag+i) == *min){                   //Se la lettera della parola più lunga coincide con la prima lettera della parola più corta
            for(j = 0; j < strlen(min); j++){
                if(*(mag+i+j) != *(min+j)){     //controlla se tutte le lettere della parola corta combaciano con quelle della parola lunga
                    j = strlen(min);
                }else{
                    temp++;             //se combaciano incrementa temp
                }
            }

            if(temp == strlen(min)){    //se temp equivale alla lunghezza della stringa più corta inrementa occorrenze di 1
                occorrenze++;
            }
            temp = 0;           //Dopo il controllo da il valore 0 a temp
        }
    }

    printf("La parola piu' corta e' contenuta %d volte nella parola piu' lunga ", occorrenze);

    return 0;
}