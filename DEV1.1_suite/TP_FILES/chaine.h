#ifndef CHAINE_H
#define CHAINE_H

typedef struct maillon{
  int valeur;
  struct maillon* suivant;
} maillon;

typedef struct file{
  maillon* debut;
  maillon* fin;
}file;

void creerFile(file* p_file);
int empty(file p_file);
void enqueue(file* p_file, int new_valeur);
int dequeue(file* p_file);
int first(file p_file);
void clear(file* p_file);

#endif
