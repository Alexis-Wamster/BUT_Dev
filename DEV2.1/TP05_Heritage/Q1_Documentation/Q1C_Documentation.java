public class Q1C_Documentation{
    public static void main(String[] args) {
	for (String arg : args){
	    int decimal = Integer.parseInt(arg, 8);
	    String hexadecimal = Integer.toHexString(decimal);
	    System.out.print(hexadecimal + " ");
	}
	System.out.println();
    }
}
