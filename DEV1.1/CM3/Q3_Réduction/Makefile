but : exe

OFILES = stack.o \
         main.o

CC = gcc

CFLAGS = -Wall -ansi -pedantic -g

main.o : stack.h

exe : $(OFILES)
	$(CC) $(CFLAGS) -o exe $(OFILES)

clean :
	-rm -f $(OFILES) exe

.PHONY : but clean
