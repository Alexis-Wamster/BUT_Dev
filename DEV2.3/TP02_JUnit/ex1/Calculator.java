
/**
   Calculator est une classe offrant une seule methode qui evalue une somme, donnee sous la forme d'une chaine de caractere listant des operandes separees par des +

*/

public class Calculator {

    /**
       somme les operandes passees sous forme d'une chaine de caracteres et retourne le resultat sous forme d'entier.
       @param expression : chaine de caracteres ("nombres" separes par des + sans espaces), par exemple "42+3" ou encore "-42+42" (le moins unaire est autorise).
                           ici nombre est à comprendre au sens de  parseInt(java.lang.String)
       @throws NumberFormatException : si l'expression n'est pas dans ce format (par exemple "x+2" ou " 1 +2" -- il y a des espaces -- ou encore "9999999990").
     */    
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    /**
       Pour appeller cette super méthode depuis la ligne de commande (on ne regarde que le premier argument, les autres sont ignorés).
 
     */   
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.evaluate(args[0]));
    }
}
