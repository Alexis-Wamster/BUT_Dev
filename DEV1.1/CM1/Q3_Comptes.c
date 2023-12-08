#include<stdio.h>
#include<stdlib.h>
int main(void){
  int derniers;
  int sous;
  int livres;
  printf("Combien de derniers ? ");
  scanf("%d", &derniers);
  livres = derniers/(12*20);
  derniers=derniers%(12*20);
  sous=derniers/12;
  derniers=derniers%12;
  if (derniers>=1){
    printf("%d dernier",derniers);
    if (derniers>1){
      printf("s");
    }
    printf("\n");
  }
  if (sous>=1){
    printf("%d sou",sous);
    if (sous>1){
      printf("s");
    }
    printf("\n");
  }
  if (livres>=1){
    printf("%d livre",livres);
    if (livres>1){
      printf("s");
    }
    printf("\n");
  }
  return 0;
}
