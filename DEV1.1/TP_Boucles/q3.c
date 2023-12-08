#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int table;
  int i;
  printf("Saisissez un chiffre : ");
  scanf("%d", &table);
  for (i=0;i<=10;i+=1){
    printf("%d",i);
    printf(" x ");
    printf("%d",table);
    printf(" = ");
    printf("%d\n",i*table);
  }
  return EXIT_SUCCESS;
}
