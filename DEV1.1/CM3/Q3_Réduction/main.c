#include <stdio.h>
#include <stdlib.h>
#include "stack.h"

void suppr0(stack pile){
  stack pileSans0 = create_stack();
  unsigned entierTeste;
  while (empty(pile)!=1){
    entierTeste = pop(pile);
    if (entierTeste!=0){
      push(pileSans0, entierTeste);
    }
  }
  while (empty(pileSans0)!=1){
    entierTeste = pop(pileSans0);
    push(pile, entierTeste);
  }
}

void print_stack(stack pile){
  stack pileBis = create_stack();
  unsigned entierTeste;
  while (empty(pile)!=1){
    entierTeste = pop(pile);
    printf("%u ",entierTeste);
    push(pileBis, entierTeste);
  }
  while (empty(pileBis)!=1){
    entierTeste = pop(pileBis);
    push(pile, entierTeste);
  }
  printf("\n");
}

int main(void){
  stack pile = create_stack();
  push(pile,0);
  push(pile,1);
  push(pile,0);
  push(pile,3);
  push(pile,7);
  push(pile,0);
  push(pile,0);
  print_stack(pile);
  suppr0(pile);
  print_stack(pile);
  return EXIT_SUCCESS;
}
