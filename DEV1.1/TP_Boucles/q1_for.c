#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int reel1;
  int reel2;
  
  printf("Saisissez un premier réel : ");
  scanf("%d", &reel1);
  printf("Saisissez un second réel : ");
  scanf("%d", &reel2);

  for (;reel1<=reel2;reel1+=1){
    printf("%d\n", reel1);
  }
  return EXIT_SUCCESS;
}
