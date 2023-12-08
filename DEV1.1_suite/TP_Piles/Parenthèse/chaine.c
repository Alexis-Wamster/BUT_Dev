#include<stdio.h>
#include<stdlib.h>

typedef struct maillon{
  char valeur;
  struct maillon* suivant;
} maillon;

typedef struct pile{
  maillon* adresse;
}pile;

void creerPile(pile* p_pile){
  p_pile->adresse=NULL;
}

int empty(pile p_pile){
  if (p_pile.adresse){
    return 1;
  }
  return 0;
}

void push(pile* p_pile, char new_valeur){
  maillon* new_maillon = (maillon*) malloc(sizeof(maillon));
  new_maillon->valeur = new_valeur;
  new_maillon->suivant = p_pile->adresse;
  p_pile->adresse = new_maillon;
}

char pop(pile* p_pile){
  char valeur= (p_pile->adresse)->valeur;
  maillon* p_suivant=(p_pile->adresse)->suivant;
  free(p_pile->adresse);
  p_pile->adresse=p_suivant;
  return valeur;
}

char top(pile p_pile){
  return (p_pile.adresse)->valeur;
}

void clear(pile* p_pile){
  maillon* p_suivant = p_pile->adresse;
  while(p_suivant!=NULL){
    p_suivant = (p_pile->adresse)->suivant;
    free(p_pile->adresse);
    p_pile->adresse = p_suivant;
  }
}

/*
int main(void){
  int choix=99;
  char caractere;
  pile p_pile;
  creerPile(&p_pile);
  printf("\n----------instruction----------\n1<char>- push\n2- pop\n3- top\n4- clear\n5- quit\n----------------------------------\n");
  while(choix!=5){
    printf("choix : ");
    scanf("%d%c",&choix,&caractere);
    if (choix==1){
      push(&p_pile,caractere);
    }
    if (choix==2){
      if (empty(p_pile)){
	printf("resultat : %c\n",pop(&p_pile));
      }
    }
    if (choix==3){
      if (empty(p_pile)){
	printf("resultat : %c\n",top(p_pile));
      }
    }
    if (choix==4){
      clear(&p_pile);
      printf("La liste à bien été vidé\n");
    }
  }
  printf("O revoir BG\n");
  return 0;
}
*/
