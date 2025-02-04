#include <stdio.h>
int main (){
  int a;
  printf ("inserisci un numero: ");
  scanf ("%d", &a);
  if(a%3==0){
      printf("%d è divisibile per 3", a);
  }else{
      printf("%d non è divisibile per 3", a);
  }
  return 0;
}
