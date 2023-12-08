#include <stdio.h>
#include <stdlib.h>

int main (void){
  FILE* fichier = fopen("/dev/random", "r");
  unsigned short int resultat;
  if (fichier!=NULL){
    fread(&resultat,sizeof(unsigned short int),1,fichier);
    printf("%hu\n",resultat%6+1);
    fclose(fichier);
  }else{
    fprintf(stderr,"le fichier /dev/random n'a pas réussi à s'ouvrir");
  }
}
