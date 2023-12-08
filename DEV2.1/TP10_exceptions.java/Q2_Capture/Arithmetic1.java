public class Arithmetic1{
    public Arithmetic1(){
	try{
	    int erreur = 8/0;
	}
	catch(ArithmeticException e1){
	    System.out.println("division par 0");
	}
    }
}
