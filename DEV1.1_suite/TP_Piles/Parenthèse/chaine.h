#ifndef CHAINE_H
#define CHAINE_H

typedef struct maillon{
  char valeur;
  struct maillon* suivant;
} maillon;

typedef struct pile{
  maillon* adresse;
}pile;

void creerPile(pile* p_pile);
int empty(pile p_liste);
void push(pile* p_pile, char new_valeur);
char pop(pile* p_pile);
char top(pile p_pile);
void clear(pile* p_pile);

#endif
