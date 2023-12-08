#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  signed char var1=77;
  unsigned char var2=77;
  unsigned short int var3=77;
  short int var4=77;
  int var5=77;
  unsigned int var6=77;
  long int var7=77;
  unsigned long int var8=77;
  long long int var9=77;
  unsigned long long int var10=77;
  float var11=77;
  double var12=77;
  long double var13=77;
  printf("%hhd\n",var1);
  printf("%hhu\n",var2);
  printf("%hd\n",var3);
  printf("%hu\n",var4);
  printf("%d\n",var5);
  printf("%u\n",var6);
  printf("%ld\n",var7);
  printf("%lu\n",var8);
  printf("%lld\n",var9);
  printf("%llu\n",var10);
  printf("%f\n",var11);
  printf("%lf\n",var12);
  printf("%Lf\n",var13);
  return EXIT_SUCCESS;
}
