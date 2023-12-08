#include<stdio.h>
#include<stdlib.h>

int premier(int nb){
    int diviseur;
    if (nb<2){
        return 0;
    }
    if (nb==2){
        return 1;
    }
    if (nb>2){
        for (diviseur=2; diviseur<nb;diviseur++){
            if (nb%diviseur==0){
                return 0;
            }
        }
        return 1;
    }
}

int main(void){
    int nbSaisis;
    int* p= (int*) malloc(sizeof(int));
    int taille=0;
    int numPremier;
    p[0]=2;
    printf("Bonjour, dans ce programme, vous allez saisir des entier n positifs.\nVous aurez en réponse, le nième nombre premier.\nSaisissez 0 pour quitter.\n");
    printf("Saisissez votre premier entier positif : ");
    scanf("%d\n", &nbSaisis);
    while (nbSaisis!=0) {
      if (nbSaisis>taille){
	p = (int*) realloc(p, nbSaisis*sizeof (int));
        for (numPremier=taille;numPremier<nbSaisis;numPremier++){
          int valPremier;
          for (valPremier=p[numPremier-1]+1;premier(valPremier)!=1;valPremier++){}
	  p[numPremier]=valPremier;
        }
        taille=nbSaisis;
      }
      printf("%d\n",p[nbSaisis-1]);
      printf("Saisissez un autre entier :  ");
      scanf("%d", &nbSaisis);
    }
    printf("Au revoir...");
}
