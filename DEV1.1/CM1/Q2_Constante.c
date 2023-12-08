#include<stdio.h>
#include<stdlib.h>
int main(void){
  char caractere='9';
  long int longEntier=9L;
  float decimal = 9.0L;
  int hexa= 0x9;
  printf("%c %ld %1.0f %d\n",caractere, longEntier, decimal, hexa);
  return 0;
}
