#include <stdio.h>
int area(int l, int h){
    return (l*h);
}

int main(){
    int l, h;

    printf("inserisci il lato %d :", l);
    scanf("%d", &l);
    printf("inserisci l'altezza %d :", h);
    scanf("%d", &h);
    int AreaRettangolo = area(l,h);

    printf("l'area del rettangolo e': %d", AreaRettangolo);
}