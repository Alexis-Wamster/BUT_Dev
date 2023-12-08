#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int f(int n) { 
  if (n>100)
    return n-10;
  else
    return f(f(n+11));
}

int main (int argc, char** argv){
  int nb, i;
  if (argc>=2){
    for (i=1; i<argc; i++){
      nb = (int) strtod(argv[i],NULL);
      printf("%d --> %d\n",nb, f(nb));
    }
  }
  else{
    printf("je veux plus de nombre en arguments !!!\n");
  }
  return 0;
}
