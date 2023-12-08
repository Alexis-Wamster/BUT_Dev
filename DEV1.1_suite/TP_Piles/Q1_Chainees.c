#include<stdio.h>
#include<stdlib.h>

typedef struct m{
  char valeur;
  struct m* suivant;
} maillon;

int empty(maillon* p_liste){
  if (p_liste){
    return 1;
  }
  return 0;
}

void push(maillon** p_pile, char new_valeur){
  maillon* new_maillon = (maillon*) malloc(sizeof(maillon));
  new_maillon->valeur = new_valeur;
  new_maillon->suivant = *p_pile;
  *p_pile = new_maillon;
}

char pop(maillon** p_pile){
  char valeur= (*p_pile)->valeur;
  maillon* p_suivant=(*p_pile)->suivant;
  free(*p_pile);
  *p_pile=p_suivant;
  return valeur;
}

int main(void){
  int choix=99;
  char caractere;
  maillon* p_pile=NULL;
  while(choix!=3){
    printf("1- nouvelle valeur     2- récupérer      3-quitter\n");
    printf("choix : ");
    scanf("%d",&choix);
    //printf("%d\n",choix);
    if (choix==1){
      printf("valeur : ");
      scanf(" %c",&caractere);
      push(&p_pile,caractere);
    }
    if (choix==2){
      if (empty(p_pile)){
	caractere = pop(&p_pile);
	printf("resultat : %c\n",caractere);
      }
    }
  }
  printf("O revoir BG\n");
  return 0;
}
