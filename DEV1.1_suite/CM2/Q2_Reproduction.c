#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv){
  FILE* fichier1;
  FILE* fichier2;
  char contenu1[2];
  char contenu2[2];
  size_t resultat1=1;
  size_t resultat2=1;
  if (argc<=2){
    printf("Error: Merci de fournir 2 nom de fichier\n");
    return 1;
  }
  else{
    fichier1 = fopen(argv[1], "r");
    if (fichier1==NULL){
      fprintf(stderr,"Error: impossible d'ouvrir le fichier %s\n",argv[1]);
      return 1;
    }
    else{
      fichier2 = fopen(argv[2], "r");
      if (fichier2==NULL){
	fprintf(stderr,"Error: impossible d'ouvrir le fichier %s\n",argv[2]);
	return 1;
      }
      else{
	while (resultat1==1 && resultat2==1){
	  resultat1 = fread(contenu1, sizeof(char), 1, fichier1);
	  resultat2 = fread(contenu2, sizeof(char), 1, fichier2);
	  if (contenu1[0]!=contenu2[0]){
	    resultat1 = -1;
	  }
	}
	if (resultat1 == resultat2){
	  printf("Fichiers identiques !\n");
	}
	else{
	  printf("Fichiers différents !\n");
	}
	fclose(fichier1);
	fclose(fichier2);
	return 0;
      }
    }
  }
}
