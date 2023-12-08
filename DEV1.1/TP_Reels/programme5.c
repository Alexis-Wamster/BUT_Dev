#include <stdio.h>
#include <stdlib.h>

int main(void) {
  double  argent;
  int anneeInitial=2022;
  int temps=10;
  int annee=anneeInitial;
  printf("Combien Voulez vous me donner : ");
  scanf("%lf", &argent);
  while(annee < (anneeInitial+temps)) {
    printf("%d",annee);
    printf("%c" " --> ");
    printf("%.2f\n",argent);
    annee = annee + 1;
    argent = argent*1.04;
  }
  return EXIT_SUCCESS;
}
