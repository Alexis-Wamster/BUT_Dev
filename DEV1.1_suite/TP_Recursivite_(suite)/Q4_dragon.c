#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <graph.h>

typdef struct  coo{
  int x;
  int y;
} coo;LM./§

void calculNewPts(int* points, int max){
  int i;
  for (i=max; i>=0;i--){
    points[i*2].x = points[i].x;
    points[i*2].y = points[i].y;
    //points[i*2-1].x
    //points[i*2-1].y
    if (i==max){
      
    }
  }
}

//  0 1
// -1 0

void dragon(int nb, int* points){
  if (nb!=0){
    calculNewPts;
    dragon(nb-1, points);
  }

}

int main (int argc, char** argv){
  int nb, ecran=1, forme=900, fenetre=1000;
  coo* points= (coo*) malloc((pow(2,nb)+2)*sizeof(coo));
  points[0].x = 0;
  points[0].y = 0;
  points[1].x = 1;
  points[1].y = 0;
  if (argc>=2){
      nb = (int) strtod(argv[1],NULL);
      InitialiserGraphique();
      CreerFenetre(0,0,fenetre,fenetre);
      dragon(nb, points);
      while(ecran){
	if (Touche()){
	  ecran=0;
	}
      }
  }
  else{
    printf("donnez moi un entier naturel !!!\n");
  }
  return 0;
}
