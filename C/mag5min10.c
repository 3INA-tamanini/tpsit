#include <stdio.h>
int main (){
  int a, b;
  printf ("inserisci un numero: ");
  scanf ("%d", &a);
  printf ("inserisci un numero: ");
  scanf ("%d", &b);
  if ((a >= 5 && a <= 10) || (b >= 5 && b <= 10))
	{
	  printf ("%d è compreso tra 5 e 10 \n", a);
	}
  
  return 0;

