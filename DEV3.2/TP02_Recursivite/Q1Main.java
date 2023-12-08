public class Q1Main{
    public static void main(String[] args) {
        try{
            long n = Long.parseLong(args[0]);
            Q1Factoriel calcul = new Q1Factoriel();
            System.out.println(calcul.factoriel(n));
        }
        catch(NumberFormatException e){
            System.out.println("erreur argument");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("erreur argument");
        }
    }
}