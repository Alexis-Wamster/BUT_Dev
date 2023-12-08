#include <stdio.h>
#include <stdlib.h>

typedef enum wedge{PITCHING,GAP,SAND,LOB,FLIP}wedge;
typedef enum putter{REGULAR,BELLY,LONG}putter;

typedef struct categorie{
  int bois;
  int fer;
  wedge wedge;
  putter putter;
}categorie;

afficheCategorie(categorie categorie){
  printf("\nbois : %d\n",categorie.bois);
  printf("fer : %d\n",categorie.fer);
  printf("wedge : %d\n",categorie.wedge);
  printf("putter : %d\n\n",categorie.putter);
}

int main(void){
  return 0;
}
