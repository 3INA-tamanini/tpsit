#include <stdio.h>
int main(){
    int vendite, m, i, max, tot, gMax;
    double media;

    printf("Inserire il mese di cui si vogliono conoscere le informazioni: ");
    scanf("%d", &m);

    switch(m){
        case 2: //febbraio
            for(i = 1; i <= 28; i++){
                printf("Inserire il numero di vendite del %d giorno: ", i);
                scanf("%d", &vendite);
                if(vendite > max){
                    max = vendite;
                    gMax = i;
                }else{
                    max = max;
                }
                media = media + vendite;
            }

            media = media / 28;
            break;

        case 4:
        case 6:
        case 9:
        case 11:   //mesi da 30 giorni
            for(i = 1; i <= 30; i++){
                printf("Inserire il numero di vendite del %d giorno: ", i);
                scanf("%d", &vendite);
                if(vendite > max){
                    max = vendite;
                    gMax = i;
                }else{
                    max = max;
                }
                media = media + vendite;
            }

            media = media / 30;
            break;

        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12: //mesi da 31 giorni
            for(i = 1; i <= 31; i++){
                printf("Inserire il numero di vendite del %d giorno: ", i);
                scanf("%d", &vendite);
                if(vendite > max){
                    max = vendite;
                    gMax = i;
                }else{
                    max = max;
                }
                media = media + vendite;
            }

            media = media / 31;
            break;

        case 0: //test da 3
            for(i = 1; i <= 3; i++){
                printf("Inserire il numero di vendite del %d giorno: ", i);
                scanf("%d", &vendite);
                if(vendite > max){
                    max = vendite;
                    gMax = i;
                }else{
                    max = max;
                }
                media = media + vendite;
            }

            media = media / 3;
            break;

        default:
            printf("Il mese inserito non è valido ");
    }

    printf("La media di copie vendute giornalmente e' di %.2f copie \n", media);
    printf("La vendita massima di copie (%d) e' stata ottenuta nel %d giorno", max, gMax);

    return 0;
}
