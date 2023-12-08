#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int nb=5;
  int resultat=0;
  while(nb > 0) {
    printf("%d", nb);
    nb -= 1;
    printf("Donnez moi un chiffre : ");
    resultat = resultat + scanf("%lf\n", &resultat);
    printf("%d", resultat);
  }
  printf("%d", resultat);
}
