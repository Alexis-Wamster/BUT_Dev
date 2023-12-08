#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct m{
  unsigned short valeur;
  struct m* suivant;
} maillon;

void ajoutDebut(maillon** p_liste, unsigned short new_valeur){
  maillon* new_maillon = (maillon*) malloc(sizeof(maillon));
  new_maillon->valeur = new_valeur;
  new_maillon->suivant = *p_liste;
  *p_liste = new_maillon;
}

maillon* creerListe(int taille){
  int i;
  int valeur;
  maillon* liste = NULL;
  for (i=0; i<taille; i++){
    valeur = (rand()%889)+111;
    ajoutDebut(&liste, valeur);
  }
  return liste;
}
void supprListe(maillon* p_liste){
  maillon* p_suivant=p_liste;
  while (p_suivant!=NULL){
    p_suivant = p_liste->suivant;
    free(p_liste);
    p_liste=p_suivant;
  }
}
void affichage(maillon* liste){
  maillon* addresse=liste;
  int i;
  for (i=0;i<10;i++){
    printf("%hu\n",addresse->valeur);
    addresse=addresse->suivant;
  }
}
void plusGrand(maillon* liste){
  int plusGrand=0;
  maillon* element = liste;
  while (element->suivant!=NULL){
    element = element->suivant;
    if (element->valeur > plusGrand){
      plusGrand = element->valeur;
    }
  }
  printf("plus grand : %d\n",plusGrand);
}

int main(void){
  maillon* liste = NULL;
  srand(time(NULL));
  liste = creerListe(10);
  affichage(liste);
  plusGrand(liste);
  supprListe(liste);
  return 0;
}
