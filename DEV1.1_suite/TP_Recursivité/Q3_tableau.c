#include <stdio.h>
#include <stdlib.h>

void printTab(double* tab, int taille){
  if (taille<=1){
    printf("%.2lf\n",*tab);
  }
  else {
    printf("%.2lf, ",*tab);
    printTab(tab+1,taille-1);
  }
}

int main(void){
  double tab[]={8.36,666,3.141592,0,32};
  printTab(tab, 5);
  return 0;
}
