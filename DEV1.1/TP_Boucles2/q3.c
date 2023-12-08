#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int taille;
  int x;
  printf("Saisissez la taille de la table de multiplication que vous souhaitez : ");
  scanf("%d", &taille);
  for (x=-2; x<=taille; x+=1){
    int y;
    printf("\n");
    for (y=-2; y<=taille; y+=1){
      if (x==-2){
	if (y==-2){
	  printf(" X ");}
	if (y==-1){
	  printf(" | ");}
	if (y>=0){
	  printf("%3d", y);}
	  }
      if (x==-1){
	if (y==-2){
	  printf("---");}
	if (y==-1){
	  printf("-+-");}
	if (y>=0){
	  printf("---");}
	  }
      if (x >= 0){
	if (y==-2){
	  printf("%3d",x);}
	if (y==-1){
	  printf(" | ");}
	if (y>=0){
	  printf("%3d",x*y);}
      }
    }
  } 
  return EXIT_SUCCESS;
}
