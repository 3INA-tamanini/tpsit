#include <stdio.h>
int main (){
  float a, x, b;
  printf ("inserisci a: ");
  scanf ("%f", &a);
  printf ("inserisci b: ");
  scanf ("%f", &b);
  x = (-b / a);
  printf ("X = %.2f", x);
  return 0;
}
