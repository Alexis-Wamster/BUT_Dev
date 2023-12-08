#include <stdio.h>
#include <stdlib.h>
#include <time.h>
 
int main(void) {
  int position;
  int tableau[10];
  int valeur;
  srand(time(NULL));
  for (position=0;position<10;position++){
    tableau[position]=((rand()%101)-50);
    printf("%d",position);
    printf(" --> ");
    printf("%d\n",tableau[position]);
  }
  printf("choisissez une valeur : ");
  scanf("%d",&valeur);
  printf("position dans le tableau : ");
  for (position=0;position<10;position++){
    if (valeur==tableau[position]){
      printf("%d\n",position);
      return EXIT_SUCCESS;
    }
  }
  printf("-1\n");
  return EXIT_SUCCESS;
}
