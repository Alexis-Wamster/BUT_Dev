#ifndef BOUTON_H
#define BOUTON_H

typedef struct bouton{
  int xmin;
  int xmax;
  int ymin;
  int ymax;
}bouton;

void creerBouton(bouton** boutons);
int detectClic(bouton* boutons, int choix);
void afficheBouton(bouton* boutons, int numBouton, int etat);
#endif
