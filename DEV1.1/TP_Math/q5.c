#include <stdio.h>
#include <stdlib.h>
#include<math.h>
int main(void) {
  double vAvion;
  double vVent;
  double distance;
  double duree;
  printf("vitesse de l'avion : ");
  scanf("%lf",&vAvion);
  printf("vitesse du vent : ");
  scanf("%lf",&vVent);
  printf("distance du trajet : ");
  scanf("%lf",&distance);
  duree = distance / vAvion;
  printf("durée du vol : ");
  printf("%lf\n", duree);
  return EXIT_SUCCESS;
}
