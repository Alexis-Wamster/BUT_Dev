#include<stdio.h>
#include<stdlib.h>
int main(void){
  int nbCases;
  int numCase;
  int i;
  printf("Entrez le nombre de cases : ");
  scanf("%d", &nbCases);
  
  if (nbCases==1){
    printf("┌──┐");
  }
  else{
    for (numCase=1; numCase<=nbCases;numCase++){
      if (numCase==nbCases){
	printf("┬──┐");
      }
      else{
	if (numCase==1){
	  printf("┌──");
	}
	else{
	  printf("┬──");
	}
      }
    }
  }
  printf("\n");

  for (numCase=0;numCase<nbCases;numCase++){
    printf("│  ");
  }
  if (nbCases>0){
    printf("│");
  }
  printf("\n");

  if (nbCases==1){
    printf("└──┘");
  }
  else{
    for (numCase=1; numCase<=nbCases;numCase++){
      if (numCase==nbCases){
	printf("┴──┘");
      }
      else{
	if (numCase==1){
	  printf("└──");
	}
	else{
	  printf("┴──");
	}
      }
    }
  }
  printf("\n");
  return 0;
}
