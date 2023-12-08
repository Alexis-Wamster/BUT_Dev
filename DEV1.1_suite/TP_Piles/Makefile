# 1 : BUT FINAL

but : exe

# 2 : VARIABLES

OFILES = Pile_chainees.o \
	 main.o

CC = gcc

CFLAGS = -Wall -g

# 3 : DEPENDANCES (REGLES IMPLICITES)

main.o : main.c Pile_chainees.h

#4 : DEPENDANCES AVEC COMMANDES

exe : $(OFILES)
	$(CC) $(CFLAGS) -o exe $(OFILES)

#5 : NETTOYAGE DES FICHIERS GENERES

clean :
	-rm -f $(OFILES) exe

#6 : BUTS FACTICES

.PHONY : but clean
