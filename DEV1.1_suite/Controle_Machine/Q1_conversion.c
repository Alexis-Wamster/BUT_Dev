#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv){
  double uniteDonne = strtod(argv[1],NULL);
  double uniteConvertis;
  if (argv[2][0]=='i'&&argv[2][1]=='n'&&argv[2][2]=='\0'){
    uniteConvertis=uniteDonne*2.54;
    printf("%.2lfcm\n",uniteConvertis);
    return 0;
  }
  if (argv[2][0]=='c'&&argv[2][1]=='m'&&argv[2][2]=='\0'){
    uniteConvertis=uniteDonne/2.54;
    printf("%.2lfin\n",uniteConvertis);
    return 0;
  }
}
