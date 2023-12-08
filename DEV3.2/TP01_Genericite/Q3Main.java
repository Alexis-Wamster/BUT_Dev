public class Q3Main{
    public static void main(String[] args)  {
		Integer[] tableau1 = {7,5,3,6,9,5,5,4,6,5,5,9,5,4,7,54,5,5,4,7,5,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String[] tableau2 = {"a","b","e","r","r","r","e","a","z","z"};
		System.out.println(Q3Frequence.getSouvent(tableau1).toString());
		System.out.println(Q3Frequence.getSouvent(tableau2).toString());
    }
}
