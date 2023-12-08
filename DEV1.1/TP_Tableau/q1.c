#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main(void) {
  int position;
  int tableau[10];
  srand(time(NULL));
  for (position=0;position<10;position++){
    tableau[position]=((rand()%101)-50);
    printf("%d",position);
    printf(" --> ");
    printf("%d\n",tableau[position]);
  }
  return EXIT_SUCCESS;
}
