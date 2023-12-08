#include<stdio.h>
#include<stdlib.h>

// vérifie si le reel est déjà présent dans la liste
int verificateur(double* adresseDebut, double* adresseEmplacement){
  while (adresseDebut<adresseEmplacement){
    if (*adresseDebut==*adresseEmplacement){
      return 0;
      adresseDebut++;
    }
    return 1;
  }
}

int main (void){
  int nbReel;
  int numReel=1;
  double* adresseDebut;
  double* adresseEmplacement;
  double valeurSaisis;
  printf("Choisissez le nombre de reel que vous voulez saisir : ");
  scanf("%d",&nbReel);
  adresseDebut = (double*) calloc(nbReel, sizeof (double));
  adresseEmplacement = adresseDebut;
  //lorsqu'il y a qu'un entier
  if (nbReel==1){
    printf("Saisissez votre reel : ");
    scanf("%lf",adresseEmplacement);
    printf("%lf %d\n",*adresseEmplacement, adresseEmplacement);
  }
  else{
    // premier reels
    if (nbReel>1){
      printf("Saisissez votre 1er reel : ");
      scanf("%lf",adresseEmplacement);
      printf("%lf %d\n",*adresseEmplacement, adresseEmplacement);
      // autres reels
      for (numReel=2;numReel<nbReel;numReel++){
	//adresseEmplacement++;
	printf("Saisissez votre %deme reel : ",numReel);
	scanf("%lf",&valeurSaisis);
	if (verificateur(adresseDebut, adresseEmplacement)==1){
	  adresseEmplacement++;
	  *adresseEmplacement=valeurSaisis;
	  printf("%lf %d\n",*adresseEmplacement, adresseEmplacement);
	}
      }
      // dernier reel
      printf("Saisissez votre dernier reel : ");
      scanf("%lf",&valeurSaisis);
      if (verificateur(adresseDebut,adresseEmplacement)==1){
	adresseEmplacement++;
	*adresseEmplacement=valeurSaisis;
	printf("%lf %d\n",*adresseEmplacement, adresseEmplacement);
      }
    }
  }
  for (;adresseEmplacement>=adresseDebut; adresseEmplacement--){
    printf("%lf \n",*adresseEmplacement);
  }
  printf("\n");
}
