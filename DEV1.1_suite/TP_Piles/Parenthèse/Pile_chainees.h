#ifndef PILE_CHAINEES_H
#define PILE_CHAINEES_H

typedef struct pile{
  char valeur;
  struct pile* suivant;
} pile;

void creerPile(pile** p_pile);
int empty(pile* p_liste);
void push(pile** p_pile, char new_valeur);
char pop(pile** p_pile);
char top(pile* p_pile);
void clear(pile** p_pile);

#endif
