import java.util.*;

public class Q1Main{
    public static void main(String[] args) {
		ArrayList <Integer> listeInt = new ArrayList <Integer>();
		ArrayList <Float> listeFloat = new ArrayList <Float>();
		ArrayList <Number> listeNb = new ArrayList <Number> ();
		Integer nbInt = 6;
		Float nbFloat = 6f;
		Long nLong = 6l;
		
		listeInt.add(nbInt);
		listeFloat.add(nbFloat);
		listeNb.add(nLong);
		
		listeInt.add(nbInt);
		listeFloat.add(nbFloat);
		listeNb.add(nLong);
		
		listeInt.add(nbInt);
		listeFloat.add(nbFloat);
		listeNb.add(nLong);
		
		System.out.println(listeInt);
		System.out.println(listeFloat);
		System.out.println(listeNb);
		System.out.println();
		
		// petit b
		
		//listeInt.addAll(listeFloat); Ne fonctionne pas
		//listeInt.addAll(listeNb); Ne fonctionne pas
		
		//listeFloat.addAll(listeInt); Ne fonctionne pas
		//listeFloat.addAll(listeNb); Ne fonctionne pas
		
		listeNb.addAll(listeInt);
		listeNb.addAll(listeFloat);
		
		System.out.println(listeInt);
		System.out.println(listeFloat);
		System.out.println(listeNb);
    }
}
