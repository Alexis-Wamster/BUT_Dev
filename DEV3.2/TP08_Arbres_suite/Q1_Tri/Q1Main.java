public class Q1Main{

    public static void main(String[] args){
        try{
            Q1Arbre arbre = new Q1Arbre();
            for (String arg : args){
                int n = Integer.parseInt(arg);
                arbre.add(n);
            }
            arbre.affichage();
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException : Veuillez saisir des nombres en arguments");
        }
    }
}