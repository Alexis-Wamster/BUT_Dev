#include<stdio.h>
#include<stdlib.h>
#include"tableau.h"
//#include"chaine.h"

char parenthese(char symbole){
  if (symbole==')'){
    return '(';
  }
  if (symbole=='}'){
    return '{';
  }
  if (symbole==']'){
    return '[';
  }
  return '0';
}

int main(int argc, char** argv){
  int numFichier;
  FILE* fichier;
  char caractere[2];
  pile p_pile;
  creerPile(&p_pile);
  
  if (argc==1){
    fprintf(stderr,"Utilisation : \n%s <fichier>\n",argv[0]);
    return 1;
  }
  for (numFichier=1; numFichier<argc; numFichier++){
    fichier = fopen(argv[numFichier],"r");
    if (fichier==NULL){
      fprintf(stderr,"Erreur : Impossible d'ouvrir le fichier \"%s\" en écriture\n",argv[numFichier]);
      return 1;
    }
    while (fread(caractere,sizeof(char),1,fichier)){
      if (caractere[0]=='(' || caractere[0]=='{' || caractere[0]=='['){
	push(&p_pile,caractere[0]);
      }
      if (caractere[0]==')' || caractere[0]=='}' || caractere[0]==']'){
	if (empty(p_pile)){
	  if (top(p_pile)==parenthese(caractere[0])){
	    pop(&p_pile);
	  }
	  else{
	    push(&p_pile,caractere[0]);
	  }
	}
	else{
	  push(&p_pile,caractere[0]);
	}
      }
    }
    if (empty(p_pile)){
      printf("%s incorrect\n", argv[numFichier]);
      clear(&p_pile);
    }
    else{
      printf("%s correct\n", argv[numFichier]);
    }
  }
}
