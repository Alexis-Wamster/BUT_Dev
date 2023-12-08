#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main(void) {
  int position;
  int tableau[10];
  int max=-50;
  srand(time(NULL));
  for (position=0;position<10;position++){
    tableau[position]=((rand()%101)-50);
    if (max<tableau[position]){
      max = tableau[position];
    }
  }
  for (position=0;position<10;position++){
    printf("%d",position);
    printf(" --> ");
    printf("%d",tableau[position]);
    if (max==tableau[position]){
      printf(" <-- élément le plus grand");
    }
    printf("\n");
  }
  return EXIT_SUCCESS;
}
