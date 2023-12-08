#include <stdio.h>
#include <stdlib.h>

typedef struct maillon{
  int valeur;
  struct maillon* suivant;
} maillon;

typedef struct file{
  maillon* debut;
  maillon* fin;
}file;

void creerFile(file* p_file){
  p_file->debut=NULL;
  p_file->fin=NULL;
}

void enqueue(file* p_file, int new_valeur){
  maillon* new_maillon = (maillon*) malloc(sizeof(maillon));
  new_maillon->valeur = new_valeur;
  new_maillon->suivant = NULL;
  if (p_file->debut==NULL){
    p_file->debut = new_maillon;
  }
  else{
    (p_file->fin)->suivant = new_maillon;
  }
  p_file->fin = new_maillon;
}

void clear(file* p_file){
  maillon* p_suivant = (*p_file).debut;
  while(p_suivant!=NULL){
    p_suivant = ((*p_file).debut)->suivant;
    free((*p_file).debut);
    p_file->debut = p_suivant;
  }
  p_file->fin = NULL;
}

int verification(file p_file, int choix){
  maillon* maillonTest;
  int valeurTest;
  for(maillonTest=p_file.debut ; maillonTest!=NULL ; maillonTest=maillonTest->suivant){
    valeurTest = maillonTest->valeur;
    if (choix%valeurTest==0){
      return 0;
    }    
  }
  return 1;
}

int main(void){
  int reussite=1;
  int choix;
  file p_file;
  creerFile(&p_file);
  while (reussite){
    printf("Entrez un entier : ");
    scanf("%d",&choix);
    if (verification(p_file, choix)){
      enqueue(&p_file, choix);
    }
    else{
      clear(&p_file);
      reussite=0;
    }
  }
  printf("Perdu !\n");
  return EXIT_SUCCESS;
}
