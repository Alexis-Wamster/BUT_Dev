#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<math.h>

int strint(char chaine[10]){
  int digit=strlen(chaine)-1;
  int longueur=digit;
  int resultat=0;
  int chiffre;
  for (;digit>=0;digit--){
    chiffre = chaine[digit]-48;
    if ((chiffre<0)||(chiffre>9)){
      return 0;
    }
    resultat += (chiffre)*pow(10,(-digit+longueur));
  }
  return(resultat);
}

int main(int argc, char** argv) {
  if (argc > 2) {
    int resultat;
    resultat = strint(argv[1])*strint(argv[2]);
    printf("%d\n",resultat);
  } else {
    puts("Saisissez au moins 2 premiers arguments entiers !");
  }
  return EXIT_SUCCESS;
}
