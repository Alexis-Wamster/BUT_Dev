#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <graph.h>
#include "chaine.h"
#include "bouton.h"

void nouvellePartie(file* file1){
  int newValeur = rand()%4;
  enqueue(file1,newValeur);
}

void afficheCombinaison(file* file1, file* file2,bouton* boutons){
  int numBouton;
  long int instant=Microsecondes();
  while (empty(*file1)){
    numBouton = dequeue(file1);
    enqueue(file2, numBouton);
    while (Microsecondes()<instant){}
    afficheBouton(boutons,numBouton,1);
    instant = Microsecondes() + 500000;
    while (Microsecondes()<instant){}
    afficheBouton(boutons,numBouton,0);
    instant = Microsecondes() + 500000;
    //printf("%d ",numBouton);
  }
  //printf("\n");
}

int verificateur(file* file1, file* file2, int choix){
  if (empty(*file2)){
    if (first(*file2)==choix){
      dequeue(file2);
      enqueue(file1,choix);
      return 1;
    }
    printf("PERDU !\n");
    return 0;
  }
  fprintf(stderr,"Erreur: Le joueur à réussi à jouer alors que le file de donnée était vide\n");
  return 0;
}

int partie(file* file1, file* file2,bouton* boutons){
  int choix;
  long int instant;
  printf("partie\n");
  nouvellePartie(file1);
  afficheCombinaison(file1,file2,boutons);
  while (empty(*file2)){
    //printf("choix : ");
    choix=detectClic(boutons,choix);
    afficheBouton(boutons,choix,1);
    //scanf("%d",&choix);
    if (verificateur(file1, file2, choix)==0){
      return 0;
    }
  }
  instant = Microsecondes() + 500000;
  while (Microsecondes()<instant){}
  afficheBouton(boutons,choix,0);
  return 1;
}
