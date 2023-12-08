#include <stdio.h>
#include <stdlib.h>

int main(void) {
  char semaine[]={lundi,mardi,mercredi,vendredi,samedi,dimanche};
  int jour;
  int visiteurDuJour;
  int visiteur=0;
  for (jour=0;jour<7;jour++){
    printf("Nombre de visiteur ");
    printf("%hhd",semaine[jour]);
    printf(" : ");
    scanf("%d",&visiteurDuJour);
    visiteur+=visiteurDuJour;
  }
  printf("Moyenne = ");
  printf("%d", visiteur/7);
  return EXIT_SUCCESS;
}
