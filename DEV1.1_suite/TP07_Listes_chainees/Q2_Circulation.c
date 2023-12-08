#include <stdio.h>
#include <stdlib.h>
#include <time.h>

typedef struct m{
  int valeur;
  struct m* suivant;
} maillon;

void ajoutDebut(maillon** p_liste, int new_valeur){
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
  while (addresse->suivant!=NULL){
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
void supprDer(maillon* liste){
  if (liste!=NULL){
    if (liste->suivant==NULL){
      free(liste);
      liste=NULL;
    }
    else{
       maillon* p_element = liste;
       while ((p_element->suivant)->suivant!=NULL){
	        p_element = p_element->suivant;
       }
       p_element->suivant=NULL;
       free(p_element->suivant);
    }
  }
}

int main(void){
  maillon* liste = NULL;
  srand(time(NULL));
  liste = creerListe(10);
  affichage(liste);
  plusGrand(liste);
  supprDer(liste);
  affichage(liste);
  supprListe(liste);
  return 0;
}
