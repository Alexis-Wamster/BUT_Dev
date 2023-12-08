#include <stdlib.h>
#include <stdio.h>
 
int main(void) {
  long long int n1 = 4614256656552045848LL;
  double* p1 = (double*) &n1;
  double n2 = *p1;
  n2 = n2*2;
  long long int* p2 = (long long int*) &n2;
  long long int n3 = *p2;
  double* p3 = (double*) &n3;
  printf("π = %f\n", *p3);
  return EXIT_SUCCESS;
}
//4614256656552045848LL
