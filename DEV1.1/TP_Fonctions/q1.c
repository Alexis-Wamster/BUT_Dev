#include<stdio.h>
#include<stdlib.h>
void triangle(void){
  int hauteur;
  int ligne;
  printf("Hauteur ? ");
  scanf("%d",&hauteur);
  printf("\n");
  for (ligne=1;ligne<=hauteur;ligne+=1){
    int caractere;
    for (caractere=1;caractere<=ligne;caractere++){
      printf("*");
    }
    printf("\n");
  }
}

void carre(void){
  int hauteur;
  int ligne;
  printf("Hauteur ? ");
  scanf("%d",&hauteur);
  printf("\n");
  for (ligne=1;ligne<=hauteur;ligne+=1){
    int colonne;
    for (colonne=1;colonne<=hauteur;colonne++){
      if ((colonne==1)||(ligne==1)||(colonne==hauteur)||(ligne==hauteur)){
	printf("*");
      } else{
	printf(" ");
      }
    }
    printf("\n");
  }
}

int main(void){
  char choix='\xa';
  while (choix!='q'){
    while (choix!='\xa'){
      choix = getchar();
    }
    printf("t) Triangle\n");
    printf("c) Carré\n");
    printf("q) Quitter\n");
    printf("Votre choix ? ");
    choix = getchar();
    printf("\n");
    if (choix=='t'){
      triangle();
    }
    if (choix=='c'){
      carre();
    }
    printf("______________\n");
  }
  printf("Au revoir...\n");
  return EXIT_SUCCESS;
}
//Reda.H#4564
