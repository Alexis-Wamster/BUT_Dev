#include <stdio.h>
#include <stdlib.h>
#include <graph.h>
#include <time.h>
#include "chaine.h"
#include "bouton.h"
#include "jeu.h"
//#include "tableau.c"

int main(void){
  InitialiserGraphique();
  CreerFenetre(0,0,1000,1000);
  file file1, file2;
  int score;
  bouton* boutons;
  creerBouton(&boutons);
  creerFile(&file1);
  creerFile(&file2);
  srand(time(NULL));
  printf("test\n");
  for (score=1; partie(&file1,&file2,boutons)==1; score++){
    printf("\nBravo !!!\nScore=%d\n\n",score);
  }
  return 1;
}
