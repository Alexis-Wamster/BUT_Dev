#include<stdio.h>
#include<stdlib.h>

typedef struct maillon{
  int valeur;
  struct maillon* suivant;
} maillon;

typedef struct file{
  maillon* debut;
  maillon* fin;
}file;

int empty(file p_file){
  if (p_file.debut){
    return 1;
  }
  return 0;
}

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

int dequeue(file* p_file){
  maillon* p_suivant=(p_file->debut)->suivant;
  int valeur = (p_file->debut)->valeur;
  free(p_file->debut);
  p_file->debut = p_suivant;
  return valeur;
}

int first(file p_file){
  return (p_file.debut)->valeur;
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

/*
int main(void){
  int choix=99;
  int caractere;
  file p_file;
  creerFile(&p_file);
  printf("\n----------instruction----------\n1<char>- enqueue\n2- dequeue\n3- old\n4- clear\n5- quit\n----------------------------------\n");
  while(choix!=5){
    printf("choix : ");
    scanf(" %d",&choix);
    if (choix==1){
      printf("nombre : ");
      scanf(" %d",&caractere);
      enqueue(&p_file,caractere);
    }
    if (choix==2){
      if (empty(p_file)){
	printf("resultat : %d\n",dequeue(&p_file));
      }
    }
    if (choix==3){
      if (empty(p_file)){
	printf("resultat : %d\n",first(p_file));
      }
    }
    if (choix==4){
      clear(&p_file);
      printf("La liste à bien été vidé\n");
    }
  }
  clear(&p_file);
  printf("O revoir BG\n");
  return 0;
}
*/
