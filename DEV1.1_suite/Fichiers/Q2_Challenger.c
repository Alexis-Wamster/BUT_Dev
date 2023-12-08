#include<stdlib.h>
#include<stdio.h>
#include<string.h>

void inversionInt(int* var1, int* var2){
  int valeurTransitoire = *var1;
  *var1 = *var2;
  *var2 = valeurTransitoire;
}

void inversionMot3(char* var1, char* var2){
  char valeurTransitoire;
  int pos;
  for (pos=0; pos<4; pos++, var1++, var2++){
    valeurTransitoire = *var1;
    *var1 = *var2;
    *var2 = valeurTransitoire;
  }
}

void printTop10(int* score, char* challenger){
  int place;
  for (place=0; place<10; place++, score++, challenger+=4){
    printf("%09d",*score);
    printf("%4s\n",challenger);
  }
  printf("\n");
}

int main(int argc, char** argv){
  int place;
  int score[10];
  int newScore=NULL;
  char challenger[10][4];
  char newChallenger[4];
  if (argc > 2){
    newScore = (int) strtol(argv[1], NULL, 10);
    for (place=0;place<4;place++){
      newChallenger[place] = argv[2][place];
    }
    newChallenger[3] = '\0';
  }
  FILE* hallOfFame = fopen("top10","r");
  if (hallOfFame){
    for (place=0;place<10;place++){
      fread(&score[place],sizeof(int),1,hallOfFame);
      fread(&challenger[place],sizeof(char),3,hallOfFame);
      challenger[place][3]='\0';
    }
    fclose(hallOfFame);
    printTop10(&score, &challenger);
    for (place=0;place<10;place++){
      if (newScore>score[place]){
	inversionInt(&newScore, &score[place]);
	inversionMot3(&newChallenger, &challenger[place]);
      }
    }
  }
  else{
    printf("Le fichier n'as pas réussi à s'ouvrir pour la lecture\n");
  }
  
  hallOfFame = fopen("top10","w");
  if (hallOfFame){
    for (place=0;place<10;place++){
      fwrite(&score[place],sizeof(int),1,hallOfFame);
      fwrite(&challenger[place],sizeof(char),3,hallOfFame);
    }
    fclose(hallOfFame);
    printTop10(&score, &challenger);
    for (place=0;place<10;place++){
      if (newScore>score[place]){
	inversionInt(&newScore, &score[place]);
	inversionMot3(&newChallenger, &challenger[place]);
      }
    }
    fclose(hallOfFame);
  }
  else{
    printf("Le fichier n'as pas réussi à s'ouvrir lors de sa réécriture\n");
  }
  return 0;
}
