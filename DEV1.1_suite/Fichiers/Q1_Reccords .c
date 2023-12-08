#include<stdlib.h>
#include<stdio.h>
int main(void){
  int place;
  char nom[10][4];
  int score[10];
  FILE* hallOfFame = fopen("top10","r");
  if (hallOfFame){
    for (place=0;place<10;place++){
      fread(&score[place],sizeof(int),1,hallOfFame);
      printf("%09d ",score[place]);
      fread(&nom[place],sizeof(char),3,hallOfFame);
      nom[place][3]='\0';
      printf("%s\n",nom[place]);
    }
    fclose(hallOfFame);
  }
  else{
    printf("c'est toi qui est null\n");
  }
  return 0;
}
