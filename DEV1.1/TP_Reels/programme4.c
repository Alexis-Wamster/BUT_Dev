#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int reel;
  double reelTransforme;
  char caractere;
  printf("Saisissez un réel : ");
  reel = scanf("%lf", &reelTransforme);
  printf("Abracadabra ! Voici sa notation en écriture scientifique : " "%e\n", reelTransforme);
  printf("Saisissez maintenant un caractère : ");
  caractere = getchar();
  caractere = getchar();
  printf("Et hop ! Le je vous le rends en 5 exemplaire : " "%c\n", caractere + caractere);
  return EXIT_SUCCESS;
}
