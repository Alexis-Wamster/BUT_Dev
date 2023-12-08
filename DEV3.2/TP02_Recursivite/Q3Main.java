public class Q3Main{
    public static void main(String[] args) {
        try{
            int i = Integer.parseInt(args[0]);
            Q3Fibonacci calcul = new Q3Fibonacci();
            calcul.fibonacci(i);
        }
        catch(NumberFormatException e){
            System.out.println("erreur argument");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("erreur argument");
        }
    }
}