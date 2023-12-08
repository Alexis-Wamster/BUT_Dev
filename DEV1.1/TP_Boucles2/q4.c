#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int i;
  int n0=0;
  int n1=1;
  int n;
  printf("Saisissez un entier : ");
  scanf("%d", &n);
  for(i=0;i<n;i+=1){
    if (i%2==0){
      n0=n0+n1;
    } else{
      n1=n0+n1;
    }
  }
  if (n%2==0) {
    printf("%d\n",n0);
  }  else{
    printf("%d\n",n1);
      }
 
  
  return EXIT_SUCCESS;
}
