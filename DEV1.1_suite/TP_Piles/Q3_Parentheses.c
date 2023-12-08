#include<stdio.h>
#include<stdlib.h>
#include"Pile_chainees.h"

char parenthese(char symbole){
  if (symbole==')'){
    return '('
  }
  if (symbole=='}'){
    return '{'
  }
  if (symbole==']'){
    return '['
  }
  return '0';
}

int main(int argc, char** argv){
  int numFichier;
  FILE* fichier;
  char caractere[2];
  maillon* p_pile=NULL;
  
  if (argc==1){
    fprintf(stderr,"Utilisation : \n%s <fichier>",argv[0]);
    return 1;
  }
  for (numFichier=1; numFichier<argc; numFichier++){
    fichier = fopen(argv[numFichier],"r");
    if (fichier==NULL){
      fprintf(stderr,"Erreur : Impossible d'ouvrir le fichier \"%s\" en écriture",argv[numFichier]);
      return 1;
    }
    while (fread(caractere,sizeof(char),1,fichier)){
      if (caractere[0]=='(' || caractere[0]=='{' caractere[0]=='['){
	push(p_pile,caractere[0]);
      }
      if (caractere[0]==')' || caractere[0]=='}' caractere[0]==']'){
	if (top(p_pile)==parenthese(caractere[0])){
	  pop(&p_pile);
	}
	else{
	  push(p_pile,caractere[0]);
	}
      }
    }
    if (p_pile==NULL){
      printf("%s correct\n");
    }
    else{
      printf("%s incorrect");
    }
  }
}
