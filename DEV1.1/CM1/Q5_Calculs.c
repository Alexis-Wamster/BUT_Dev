#include<stdio.h>
#include<stdlib.h>
#include <math.h>
int main(void){
  int nombre =5;
  double cible = 51.7;
  double tableau[5];
  int positionTableau;
  int caseGagnante;
  for (positionTableau=0;positionTableau<nombre;positionTableau++){
    printf("case n°%d : ", positionTableau);
    scanf("%lf",&tableau[positionTableau]);
    if (positionTableau==0){
      caseGagnante = positionTableau;
    }
    else{
      if (fabs(tableau[positionTableau]-cible) < fabs(tableau[caseGagnante]-cible)){
	caseGagnante = positionTableau;
      }
    }
  }
  printf("La valeur la plus proche est dans la case n°%d.\n",caseGagnante);
  return 0;
}
