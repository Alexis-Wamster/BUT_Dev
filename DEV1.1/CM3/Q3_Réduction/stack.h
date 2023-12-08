#ifndef STACK_H
#define STACK_H

/* le type stack représente une pile */
typedef struct s_stack *stack;

/* crée une pile vide. Renvoie NULL en cas d'échec */
stack create_stack(void);

/* ajoute un élément à la pile. Renvoie 0 en cas d'échec */
int push(stack, unsigned);

/* renvoie 1 si la pile est vide */
int empty(stack);

/* retire un élément de la pile. Renvoie l'élément retiré, ou -1 en cas d'échec */
long pop(stack);

/* détruit une pile en libérant les ressources associées */
void destroy_stack(stack);

#endif /* STACK_H */