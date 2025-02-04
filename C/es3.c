#include <stdio.h>
#include <math.h>
int main(){
    double lon1, lon2, lat1, lat2, p1, p2, p3, ptot, r, pi, distanza, arccos;
    const double pi = 4.0 * atan(1.0);
    const double r = 6372.795;

    printf("Inserire la longitudine iniziale in gradi: ");
    scanf("%lf", &lon1);
    printf("Inserire la latitudine iniziale in gradi: ");
    scanf("%lf", &lat1);
    printf("Inserire la longitudine finale in gradi: ");
    scanf("%lf", &lon2);
    printf("Inserire la latitudine finale in gradi: ");
    scanf("%lf", &lat2);

    lon1 = pi * lon1 / 180;
    lat1 = pi * lat1 / 180;
    lon2 = pi * lon2 / 180;
    lat2 = pi * lat2 / 180;

    p1 = cos(lat1) * cos(lon1) * cos(lat2) * cos(lon2);
    p2 = cos(lat1) * sin(lon1) * cos(lat2) * sin(lon2);
    p3 = sin(lat1) * sin(lat2);

    ptot = p1 + p2 + p3;
    arccos = atan(-ptot / (sqrt((1-pow(ptot, 2)))) + (pi / 2));
    distanza = arccos * r;

    printf("La distanza tra i due punti selezionati è %.2f km", distanza); 

    return 0;
}
