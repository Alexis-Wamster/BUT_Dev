//2 4 8 16 32 64 128 256 512 1024
#include <stdio.h>
#include <stdlib.h>

struct soldat{
  unsigned short int durabilite: 10;
  unsigned short int deplacement: 4;
  unsigned short int defense: 7;
  unsigned short int degat: 7;
  unsigned short int distance: 4;
  
};

union soldat{
  unsigned short int durabilite;
  unsigned short int deplacement;
  unsigned short int defense;
  unsigned short int degat;
  unsigned short int distance;
};

void createSoldat(soldat* soldat){
  soldat->durabilite = 7;
  soldat->deplacement = 7;
  soldat->defense = 7;
  soldat->degat = 7;
  soldat->distance = 7;
}

int main(void){
  return 0;
}
