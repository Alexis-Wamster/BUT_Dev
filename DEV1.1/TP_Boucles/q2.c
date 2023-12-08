#include <stdio.h>
#include <stdlib.h>

int main(void) {
  double noteBac;
  do {
    printf("Saisissez une note de bac comprise entre 0 et 10 : ");
    scanf("%d", &noteBac);
    printf("Vous avez saisis : ");
    printf("%d\n",noteBac);
      } while(noteBac>=10);
  return EXIT_SUCCESS;
}
