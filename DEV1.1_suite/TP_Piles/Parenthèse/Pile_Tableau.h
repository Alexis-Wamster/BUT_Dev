#ifndef PILE_CHAINEES_H
#define PILE_CHAINEES_H

typedef struct pile{
  char* adresse;
  int taille;
  int capacite;
} pile;

void creerPile(pile** p_pile);
int empty(pile* p_pile);
void push(pile** p_pile, char newValeur);
char pop(pile** p_pile);
char top(pile* p_pile);
void clear(pile** p_pile);

#endif
