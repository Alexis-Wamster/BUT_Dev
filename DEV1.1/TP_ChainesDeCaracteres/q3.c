#include<stdlib.h>
#include<stdio.h>
#include<string.h>
char premiereLettre(char chaine[10]){
	int emplacement=0;
	int tailleArg;
	char caractere=chaine[emplacement];
	tailleArg=strlen(chaine);
	for (;((caractere<65)||((caractere>90)&&(caractere<97))||(caractere>122))&&(emplacement<=tailleArg); emplacement++){
		if (emplacement==tailleArg){
			return '\0';
		}
		caractere=chaine[emplacement];
	}
  	return caractere;
  }

int main(int argc, char** argv) {
	int argument;
	char lettre;
	for (argument=1;argument<=argc;argument++){
		lettre = premiereLettre("hhvghfg");
		printf("%c",lettre);
	}
	printf("/n");
  return EXIT_SUCCESS;
}

