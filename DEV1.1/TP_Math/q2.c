#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void) {
  double abs1;
  double ord1;
  double abs2;
  double ord2;
  double distance;
  printf("abscisse du premier point : ");
  scanf("%lf",&abs1);
  printf("ordonnée du deuxième point : ");
  scanf("%lf",&ord1);
  printf("abscisse du premier point : ");
  scanf("%lf",&abs2);
  printf("ordonnée du deuxième point : ");
  scanf("%lf",&ord2);
  printf("Distance entre les deux points %lf\n",sqrt(pow((abs1-abs2),2)+pow((ord1-ord2),2)));
  return EXIT_SUCCESS;
}
