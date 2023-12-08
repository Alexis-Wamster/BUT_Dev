#include <stdlib.h>
#include "stack.h"

struct s_link {
  unsigned value;
  struct s_link *next;
};

typedef struct s_link link;

struct s_stack {
  link *first;
};


/* crée une pile vide */
stack create_stack(void) {
  return (stack) calloc(1, sizeof(struct s_stack));
}

/* ajoute un élément à la pile. Renvoie 1 en cas de succès */
int push(stack the_stack, unsigned the_value) {
  link *new = (link*) malloc(sizeof(link));
  if (new == NULL) {
    return 0;
  }
  new->value = the_value;
  new->next = the_stack->first;
  the_stack->first = new;
  return 1;
}

/* renvoie 1 si la pile est vide */
int empty(stack the_stack) {
  return the_stack->first == NULL;
}

/* retire un élément de la pile. Renvoie l'élément retiré, ou -1 en cas d'échec */
long pop(stack the_stack) {
  if(the_stack->first == NULL) {
    return -1;
  }
  link l = *(the_stack->first);
  free(the_stack->first);
  the_stack->first = l.next;
  return l.value;
}

/* détruit une pile en libérant les ressources associées */
void destroy_stack(stack the_stack) {
  link *current, *saved;

  current = the_stack->first;
  while(current != NULL) {
    saved = current->next;
    free(current);
    current = saved;
  }
  free(the_stack);
}