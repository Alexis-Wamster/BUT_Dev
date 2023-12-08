#include <stdio.h>
#include <stdlib.h>

int verification(int* tableau, int valeur, int taille){
  int resultat;
  if (taille == 1){
    if (tableau[taille-1]==valeur){
      return taille-1;
    }
    else{
      return -1;
    }
  }
  else{
    resultat = verification(tableau, valeur, taille-1);
    if (resultat == -1){
      if (tableau[taille-1]==valeur){
	return taille-1;
      }
    }
    return resultat;
  }
}

int main(void){
  int tableau[]={3,5,17,7,9,17,11,13,15,17};
  int valeur=17;
  printf("%d\n",verification(tableau,valeur,8));
  return EXIT_SUCCESS;
}
