#include <stdio.h>
#include <stdlib.h>
#include<math.h>
int main(void) {
  double reel;
  int unite;
  int dixieme;
  printf("Saisissez un réel : ");
  scanf("%lf",&reel);
  while (reel>=10){
    reel-=10;
  }
  printf("%lf\n",reel);
  unite=trunc(reel);
  printf("%lf\n",unite);
  dixieme = trunc((reel-unite)*10);
  printf("chiffre des unités : ");
  printf("%d\n",reel);
  printf("chiffre des dixièmes : ");
  printf("%d\n",dixieme);
  return EXIT_SUCCESS;
}
