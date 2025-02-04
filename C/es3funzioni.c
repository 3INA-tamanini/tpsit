#include <stdio.h>
#include <string.h>

int cercaCarattere(char s[], char c){
    int cont=0;
    for (int i = 0; i < strlen(s); i++)
    {
        if(s[i]==c)
        cont++;
    }

    return cont;
    
}

int main(){
    char stringa[100];
    char c;
    #include <stdio.h>

    printf("inserisci la stringa: ");
    scanf("%s", &stringa);
    scanf("%c", &c);
    
    printf("inserisci il carattere: ");
    scanf("%c", &c);

    printf("il numero di volte in cui %c si ripete nella stringa è: %d", c,cercaCarattere(stringa,c));
}

