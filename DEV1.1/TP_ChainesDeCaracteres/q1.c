#include <stdlib.h>
#include <stdio.h>
int main(void) {
  char mdp[28];
  char caractere;
  int position;
  printf("Saisissez votre mot de passe : ");
  caractere=getchar();
  for (position=0;((caractere=!'\xa')&&(position<=26));position++){
    mdp[position]=caractere;
    caractere=getchar();
  }
  mdp[position]='\0';
  printf("salut");
  printf("%s\n",mdp);
  return EXIT_SUCCESS;
}
