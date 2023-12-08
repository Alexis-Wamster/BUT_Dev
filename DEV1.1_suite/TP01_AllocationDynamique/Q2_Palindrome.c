#include <stdio.h>
#include <stdlib.h>
#include<string.h>

char* inverse(const char* s){
    int emplacementS;
    int emplacementNewS;
    char* newS;
    emplacementS=strlen(s);
    newS = malloc((emplacementS+1)*sizeof (char));
    emplacementS--;
    for (emplacementNewS=0; emplacementS>=0; emplacementS--, emplacementNewS++){
        newS[emplacementNewS]=s[emplacementS];
    }
    newS[emplacementNewS+1]='\0';
    return newS;
}

int main(int argc, char** argv)
{
  int numArg;
  char* p;
  for (numArg=1;numArg<argc; numArg++){
    p = (char*) inverse(argv[numArg]);
    printf("%s ", argv[numArg]);
    if (p==argv[numArg]){
      printf("est un palindrome\n");
    }
    else{
      printf("n'est pas un palindrome\n");
    }
    free(p);
  }
    return 0;
}
