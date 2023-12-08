import java.util.Arrays;
public class Q3_Somme{
    public static void main(String[] args) {
	int somme = 0;
	int entier;
	int index=0;
	int[] listeEntier = new int [args.length];
	
	for (String argument : args){
	    entier = Integer.parseInt(argument);
	    listeEntier[index] = entier;
	    somme += entier;
	    index++;
	}
	
	Arrays.sort(listeEntier);
	System.out.print("Tri :");
	for (int element : listeEntier){
		System.out.print(" " + element);
	}
	
	System.out.println("");
	System.out.println("Somme : " + somme);
  }
}
