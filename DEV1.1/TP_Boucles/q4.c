#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int numerateur;
  int denominateur;
  int quotient=0;
  printf("Saisissez un entier : ");
   scanf("%d", &numerateur);
  printf("Saisissez un entier strictement positif : ");
  scanf("%d", &denominateur);
  while(numerateur>=denominateur){
    numerateur -= denominateur;
      quotient +=  1;
  }
  printf("%d", quotient*denominateur+numerateur);
  printf(" = ");
  printf("%d", quotient);
  printf(" x ");
  printf("%d", denominateur);
  printf(" + ");
  printf("%d", numerateur);
  return EXIT_SUCCESS;
}
