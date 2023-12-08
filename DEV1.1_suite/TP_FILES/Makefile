# 1 : BUT FINAL

but : exe

# 2 : VARIABLES

OFILES = chaine.o \
	 bouton.o \
	 jeu.o \
	 main.o

CC = gcc

CFLAGS = -Wall -g -lgraph

# 3 : DEPENDANCES (REGLES IMPLICITES)

bouton.o : chaine.h
jeu.o : chaine.h bouton.h
main.o : main.c chaine.h bouton.h jeu.h

#4 : DEPENDANCES AVEC COMMANDES

exe : $(OFILES)
	$(CC) $(CFLAGS) -o exe $(OFILES)

#5 : NETTOYAGE DES FICHIERS GENERES

clean :
	-rm -f $(OFILES) exe

#6 : BUTS FACTICES

.PHONY : but clean
