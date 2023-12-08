#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main(void) {
  int position;
  int tableau[10];
  int tableauPositif[10];
  int position2=0;
  srand(time(NULL));
  for (position=0;position<10;position++){
    tableau[position]=((rand()%101)-50);
    printf("%d",position);
    printf(" --> ");
    printf("%d\n",tableau[position]);
  }
  printf("\n");
  for (position=0;position<10;position++){
    if (tableau[position]>=0){
      tableauPositif[position2]=tableau[position];
      printf("%d",position2);
      printf(" --> ");
      printf("%d\n",tableauPositif[position2]);
      position2++;
    }
  }
  return EXIT_SUCCESS;
}
