#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  int nombreMystere;
  int chiffreSaisis;
  int i;
  srand(time(NULL));
  nombreMystere =(rand()%100)+1;
  for (i=0;i<5;i+=1){
    printf("Deviner mon nombre : ");
    scanf("%d", &chiffreSaisis);
    if (chiffreSaisis > nombreMystere){
      printf("C'est moins !\n");
    }
    if (chiffreSaisis < nombreMystere){
      printf("C'est plus !\n");
    }
    if (chiffreSaisis == nombreMystere){
      printf("Bravo !!! c'était bien ");
	printf("%d", nombreMystere);
      return EXIT_SUCCESS;
    }
  }
  printf("Perdu ! vos 5 tentatives n'ont pas suffit à trouver que j'avais choisis ");
  printf("%d\n", nombreMystere);
  return EXIT_SUCCESS;
}
