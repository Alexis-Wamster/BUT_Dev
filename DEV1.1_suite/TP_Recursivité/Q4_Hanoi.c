#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void affichePyramide(int* pyramides, int nbPlateau){
  int numEtage, numPyramide, espace, numChar;
  for (numEtage=0; numEtage<nbPlateau; numEtage++){
    for (numPyramide=0; numPyramide<3; numPyramide++){
      espace = nbPlateau*2-1-pyramides[numPyramide*3 +numEtage];
      if (pyramides[numPyramide*3 +numEtage]==0){
	printf(" ");
      }
      for (numChar=0; numChar<espace; numChar++){
	printf(" ");
      }
      for (numChar=0; numChar<pyramides[numPyramide*3+numEtage]*2-1; numChar++){
	printf("*");
      }
      for (numChar=0; numChar<espace; numChar++){
	printf(" ");
      }
      printf("     ");
    }
    printf("\n");
  }
}

int* initialisation(int nbPlateau){
  int* pyramides = (int*) malloc(3*nbPlateau*sizeof(int));
  int numPlateau;
  for (numPlateau=nbPlateau-1; numPlateau>=0; numPlateau--){
    pyramides[numPlateau] = numPlateau*2-1;
  }
  for (numPlateau=nbPlateau*3-1; numPlateau>=nbPlateau; numPlateau--){
    pyramides[numPlateau] = 0;
  }
  return pyramides;
}

int main(int argc, char** argv){
  int nbPlateau;
  int* pyramides=NULL;
  int* test=NULL;
  if (argc<2){
    printf("Saisissez un nombres de plateau (entre 1 et 15)\n");
  }
  else{
    nbPlateau = (int) strtod(argv[1],NULL);
    if (nbPlateau<1){
      nbPlateau=1;
    }
    if (nbPlateau>15){
      nbPlateau=15;
    }
    printf("%d\n",nbPlateau);
    pyramides = initialisation(nbPlateau);
    test=pyramides;
    while (*test){
      printf("%d ",*test);
      test+=1;
    }
    printf("\n");
    affichePyramide(pyramides, nbPlateau);
  }
  
  return 0;
}
