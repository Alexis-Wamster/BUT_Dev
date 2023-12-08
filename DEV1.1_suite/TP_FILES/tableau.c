#include<stdio.h>
#include<stdlib.h>

typedef struct file{
  int* adresse;
  int debut;
  int fin;
  int capacite;
}file;

int empty(file p_file){
  if (p_file.debut!=p_file.fin){
    return 1;
  }
  return 0;
}

void creerFile(file* p_file){
  p_file->debut = 0;
  p_file->fin = 0;
  p_file->capacite = 4;
  p_file->adresse = (int*) malloc(p_file->capacite*sizeof(int));
}

void decalage(file* p_file){
  int element;
  for (element=p_file->debut; element<=p_file->fin; element++){
    p_file->adresse[element-p_file->debut] = p_file->adresse[element];
  }
  p_file->fin -= p_file->debut;
  p_file->debut = 0;
}

void enqueue(file* p_file, int newValeur){
  if (p_file->fin==p_file->capacite){
    if (p_file->debut==0){
      p_file->capacite *= 2;
      p_file->adresse = realloc(p_file->adresse, p_file->capacite*sizeof(int));
    }
    else{
      decalage(p_file);
    }
  }
  p_file->adresse[p_file->fin] = newValeur;
  p_file->fin ++;
}

int dequeue(file* p_file){
  p_file->debut ++;
  return p_file->adresse[p_file->debut-1];
}

int first(file p_file){
  return p_file.adresse[p_file.debut];
}

void clear(file* p_file){
  p_file->debut = 0;
  p_file->fin = 0;
}

/*
int main(void){
  int choix=99;
  int caractere;
  file p_file;
  creerFile(&p_file);
  printf("\n----------instruction----------\n1 <char>- enqueue\n2- dequeue\n3- first\n4- clear\n5- quit\n----------------------------------\n");
  while(choix!=5){
    printf("choix : ");
    scanf("%d",&choix);
    if (choix==1){
      printf("caractere : ");
      scanf(" %d",&caractere);
      enqueue(&p_file,caractere);
    }
    if (choix==2){
      if (empty(p_file)){
	printf("resultat : %d\n",dequeue(&p_file));
      }
    }
    if (choix==3){
      if (empty(p_file)){
	printf("resultat : %d\n",first(p_file));
      }
    }
    if (choix==4){
      clear(&p_file);
      printf("La liste à bien été vidé\n");
    }
  }
  clear(&p_file);
  printf("O revoir BG\n");
  return 0;
}
*/
