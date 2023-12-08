#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int trianglePascal[16][16];
  int ligne=0;
  int colone =0;
  for(ligne=0;ligne<16;ligne++){
    for (colone=0;colone<16;colone++){
      trianglePascal[ligne][colone]=0;
    }
  }
  printf("\n");
  trianglePascal[0][0]=1;
  printf("%5d",trianglePascal[0][0]);
  for (ligne=1;ligne<15;ligne++){
    printf("\n");
    trianglePascal[ligne][0]=1;
    printf("%5d",trianglePascal[ligne][0]);
    colone=1;
    while(trianglePascal[ligne-1][colone-1] + trianglePascal[ligne-1][colone]!=0){
      trianglePascal[ligne][colone]= trianglePascal[ligne-1][colone-1] + trianglePascal[ligne-1][colone];
      printf("%5d",trianglePascal[ligne][colone]);
      colone++;
    }
  }
  printf("\n");
  return EXIT_SUCCESS;
}
