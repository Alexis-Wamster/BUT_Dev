#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int valeur;
  printf("Saisissez un entier : ");
  scanf("%d",&valeur);
  valeur = (char)valeur;
  printf("%hhd\n", valeur);
  return EXIT_SUCCESS;
}
