#include <stdlib.h>
#include <stdio.h>

int main(void) {
  float decimal;
  double decimalPrecisise;
  long double grandDecimal;
  char caracter;
  short int petitEntier;
  int entier;
  long long unsigned int megaNaturel;
  printf("%p\n",&decimal);
  printf("%p\n",&decimalPrecisise);
  printf("%p\n",&grandDecimal);
  printf("%p\n",&caracter);
  printf("%p\n",&petitEntier);
  printf("%p\n",&entier);
  printf("%p\n",&megaNaturel);
  return EXIT_SUCCESS;
}
