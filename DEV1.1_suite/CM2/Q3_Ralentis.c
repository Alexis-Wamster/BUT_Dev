#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
  struct timespec tempsDAttente;
  char* message="ERREUR";
  int i;
  for (i=0; i<6; i++){
    tempsDAttente.it_value = tempsDAttente.it_interval+1000000000;
    nanosleep(tempsDAttente,NULL);
    fprintf(stderr,message[i]);
  }
}
