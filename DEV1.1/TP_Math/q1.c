#include <stdio.h>
#include <stdlib.h>
#include<math.h>
int main(void) {
  printf("%lf\n",sqrt(fabs(log(0.5))));
  printf("%lf\n",sin(M_PI/6));
  printf("%lf\n",atan(pow(13,2)));
  printf("%lf\n",pow(exp(-1),4));
  printf("%lf\n",log(-3));
  printf("%lf\n",sqrt(pow(2,2)));
  return EXIT_SUCCESS;
}
