public class Q2Main{
    public static void main(String[] args) {
        try{
            Q2Modele calcul = new Q2Modele(args);
            calcul.printInt(0);
            System.out.println("nombre de paire = " + calcul.getPaire());
            System.out.println("plus grand = " + calcul.getMax());
            calcul.printInv(0);
        }
        catch(NumberFormatException e){
            System.out.println("erreur argument");
        }
    }
}