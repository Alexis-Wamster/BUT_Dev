#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <graph.h>

typedef struct bouton{
  int xmin;
  int xmax;
  int ymin;
  int ymax;
}bouton;


void creerBouton(bouton** boutons){
  int numBouton, x, y;
  *boutons= (bouton*) malloc(4*sizeof(bouton));
  for (numBouton=0, y=100; y<300; y+=150){
    for (x=100; x<300; x+=150, numBouton++){
      (*boutons)[numBouton].xmin=x;
      (*boutons)[numBouton].xmax=x+100;
      (*boutons)[numBouton].ymin=y;
      (*boutons)[numBouton].ymax=y+100;
      //afficheBouton(boutons[numBouton],0,0);
    }
  }
}

void afficheBouton(bouton* boutons, int numBouton, int etat){
  char chemin[21]="images/bouton?-?.png";
  chemin[13]= (char) (numBouton+48);
  chemin[15]= (char) (etat+48);
  ChargerImage(chemin,boutons[numBouton].xmin,boutons[numBouton].ymin,0,0,100,100);
}

int detectClic(bouton* boutons, int choix){
  int numBouton;
  while(SourisCliquee());
  while(1){
    while (SourisCliquee()==0){}
    for (numBouton=0;numBouton<4; numBouton++){
      if (_X<boutons[numBouton].xmax && _X>boutons[numBouton].xmin && _Y<boutons[numBouton].ymax && _Y>boutons[numBouton].ymin){
	afficheBouton(boutons,choix,0);
	return numBouton;
      }
    }
  }
}
