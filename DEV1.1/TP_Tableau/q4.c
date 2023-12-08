#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main(void) {
  int position;
  int tableau[10];
  int tableauInv[10];
  srand(time(NULL));
  for (position=0;position<10;position++){
    tableau[position]=((rand()%101)-50);
    printf("%d",position);
    printf(" --> ");
    printf("%d\n",tableau[position]);
  }
  printf("\n");
  for (position=0;position<10;position++){
    tableauInv[position]=tableau[9-position];
    printf("%d",position);
    printf(" --> ");
    printf("%d\n",tableauInv[position]);
  }
  return EXIT_SUCCESS;
}
