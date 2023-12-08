#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int chiffreSaisis;
  int diviseur;
  printf("Saisissez un entier : ");
  scanf("%d", &chiffreSaisis);
    for(diviseur=chiffreSaisis-1;diviseur>1;diviseur-=1){
      if (chiffreSaisis%diviseur==0){
	printf("Ce nombre n'est pas premier\n");
	return EXIT_SUCCESS;
      }
    }
  if (chiffreSaisis==1){
    printf("Ce nombre n'est pas premier\n");
    return EXIT_SUCCESS;
  }
  printf("Ce nombre est premier\n");
  return EXIT_SUCCESS;
}
