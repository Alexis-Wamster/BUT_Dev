#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main(int argc, char** argv){
  FILE* fichier = NULL;
  char caractere[2];
  int ligne=1;
  if (argc > 1){
    fichier = fopen(argv[1],"r");
    if (fichier!=NULL){
      while (fread(caractere,sizeof(char),1,fichier)!=0){
	printf("%s",caractere);
	if (caractere[0]=='\n'){
	  printf("%d) ",ligne);
	  ligne++;
	}
      }
      printf("\n");
    }
    else{
      fprintf(stderr,"impossible d'ouvrir le fichier %s\n",argv[1]);
      return 0;
    }
  }
  else{
    fprintf(stderr,"Usage : %s <file>\n",argv[0]);
    return 0;
  }
  return 1;
}
