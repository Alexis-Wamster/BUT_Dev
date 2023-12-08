#include <stdlib.h>
#include <stdio.h>
int main(void) {
  int a = 1, b = 2, c = 3;
  int *p, *q;
  printf("    a b c*p*q\n");
  printf("1)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  p=&a;
  printf("2)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  q=&c;
  printf("3)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  *p=(*q)++;
  printf("4)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  p=q;
  printf("5)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  q=&b;
  printf("6)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  *p-=*q;
  printf("7)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  ++*q;
  printf("8)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  *p*=*q;
  printf("9)  %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  a=++*q**p;
  printf("10) %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  p=&a;
  printf("11) %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  *q=*p/(*q);
  printf("12) %d,%d,%d,%d,%d\n",a,b,c,*p,*p);
  return EXIT_SUCCESS;
}
