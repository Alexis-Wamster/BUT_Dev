#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <graph.h>

void fractale(int nb, int x1, int y1, int x2, int y2, int x3, int y3){
  DessinerSegment((x1+x2)/2, (y1+y2)/2, (x3+x2)/2, (y3+y2)/2);
  DessinerSegment((x3+x2)/2, (y3+y2)/2, (x3+x1)/2, (y3+y1)/2);
  DessinerSegment((x3+x1)/2, (y3+y1)/2, (x1+x2)/2, (y2+y1)/2);
  if (nb!=0){
    fractale(nb-1, x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2);
    fractale(nb-1, (x1+x2)/2, (y1+y2)/2, x2 ,y2, (x2+x3)/2, (y2+y3)/2);
    fractale(nb-1, (x1+x3)/2, (y1+y3)/2, (x2+x3)/2, (y2+y3)/2, x3, y3);
  }
}

void triangle(int nb, int x1, int y1, int x2, int y2, int x3, int y3){
  DessinerSegment(x1, y1, x2, y2);
  DessinerSegment(x2, y2, x3, y3);
  DessinerSegment(x3, y3, x1, y1);
  fractale(nb, x1, y1, x2, y2, x3, y3);
}

int main (int argc, char** argv){
  int nb, ecran=1, forme=1080, fenetre=1080;
  if (argc>=2){
      nb = (int) strtod(argv[1],NULL);
      InitialiserGraphique();
      CreerFenetre(0,0,fenetre,fenetre);
      triangle(nb,
	       fenetre/2,
	       (fenetre-(sqrt(3*forme*forme/4)))/2,
	       (fenetre-forme)/2,
	       ((sqrt(3*forme*forme/4))+fenetre)/2,
	       (fenetre+forme)/2,
	       ((sqrt(3*forme*forme/4))+fenetre)/2);
      while(ecran){
	if (Touche()){
	  ecran=0;
	}
      }
  }
  else{
    printf("je veux plus de nombre en arguments !!!\n");
  }
  return 0;
}
