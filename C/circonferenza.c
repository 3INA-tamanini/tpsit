#include <stdio.h>
#define PI 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679
int main (){
  float raggio;
  printf ("inserisci il raggio: ");
  scanf ("%f", &raggio);
  float circonferenza = (raggio*raggio)*PI;
  printf("la circonferenza vale: %f", circonferenza);
  return 0;
}
