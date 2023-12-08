#include <stdio.h>
#include <stdlib.h>
#include <graph.h>

typedef struct m{
  int x;
  int y;
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

int main (int argc, char** argv){
  int nb, ecran=1, forme=900, fenetre=1000;
  maillon* points = NULL;
   if (argc>=2){
    points=creerListe(forme, fenetre);
    nb = (int) strtod(argv[1],NULL);
    InitialiserGraphique();
    CreerFenetre(0,0,fenetre,fenetre);
    while(ecran){
      if (Touche()){
        ecran=0;
      }
    }
  }
  else{
    printf("donnez moi un entier naturel !!!\n");
  }
  return 0;