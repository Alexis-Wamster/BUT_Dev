#include <stdio.h>
#include <stdlib.h>

int count0(double* tableau, int taille){
  int numElement;
  int compteurDe0=0;
  for (numElement=0; numElement<taille; numElement++){
    if ((int) tableau[numElement]==0){
      compteurDe0++;
    }
  }
  return compteurDe0;
}

int main(int argc, char** argv){
  int numArg;
  int nb0;
  double* tableau= (double*) malloc((argc-1)*sizeof(double));
  for (numArg=0; numArg<argc-1; numArg++){
    tableau[numArg]=strtod(argv[numArg+1],NULL);
  }
  nb0 = count0(tableau,argc-1);
  if (nb0 > 1){
    printf("%d valeurs nulles\n",nb0);
  }
  else{
    printf("%d valeur nulle\n",nb0);
  }
  return 0;
}
