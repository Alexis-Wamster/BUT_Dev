#include <stdio.h>
#include <stdlib.h>
#include<math.h>
int main(void) {
  int distance;
  int angle;
  double abs;
  double ord;
  printf("distance du point à l'origine : ");
  scanf("%d",&distance);
  printf("angle du point à l'origine : ");
  scanf("%d",&angle);
  printf("%d\n",distance);
  printf("%d\n",angle);
  abs = distance*cos(angle);
  ord = distance*sin(angle);
  printf("coordonée du point : (");
  printf("%lf",abs);
  printf(",");
  printf("%lf",ord);
  printf(")\n");
  return EXIT_SUCCESS;
}
