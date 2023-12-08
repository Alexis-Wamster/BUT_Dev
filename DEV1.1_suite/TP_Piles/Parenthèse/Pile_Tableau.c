#include<stdio.h>
#include<stdlib.h>

typedef struct pile{
  char* adresse;
  int taille;
  int capacite;
} pile;

void creerPile(pile** p_pile){
  printf("1\n");
  (*p_pile)->capacite = 512;
  printf("2\n");
  (*p_pile)->taille = 0;
  printf("3\n");
  (*p_pile)->adresse = (char*) malloc((*p_pile)->capacite*sizeof(char));
  printf("4\n");
}

int empty(pile* p_pile){
  if (p_pile->taille>0){
    return 1;
  }
  return 0;
}

void push(pile** p_pile, char newValeur){
  if ((*p_pile)->taille == (*p_pile)->capacite){
    (*p_pile)->capacite *= 2;
    (*p_pile)->adresse = realloc((*p_pile)->adresse,(*p_pile)->capacite*sizeof(char));
  }
  (*p_pile)->adresse[(*p_pile)->taille] = newValeur;
  (*p_pile)->taille ++;
}

char pop(pile** p_pile){
  (*p_pile)->taille --;
  return (*p_pile)->adresse[(*p_pile)->taille];
}

char top(pile* p_pile){
  return p_pile->adresse[p_pile->taille-1];
}

void clear(pile** p_pile){
  (*p_pile)->taille=0;
}


int main(void){
  int choix=99;
  char caractere;
  pile* p_pile;
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
  free(p_pile->adresse);
  printf("O revoir BG\n");
  return 0;
}

