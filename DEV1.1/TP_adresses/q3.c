#include <stdlib.h>
#include <stdio.h>
#include <time.h>
 
int main(void) {
  int* p;
 
  if(time(NULL)%2) {
    int x = 59;
    p = &x;
    printf("x=%d\n", x);
  } else {
    int y = 31;
    p = &y;
    printf("y=%d\n", y);
  }
  printf("%d\n", *p);
  return EXIT_SUCCESS;
}
