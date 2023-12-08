public class Q5_Grille{
    public static void main(String[] args) {
	int dimensionX = 0;
	int dimensionY = 0;
	if (args.length > 1){
	    dimensionX = Integer.parseInt(args[0]);
	    dimensionY = Integer.parseInt(args[1]);
	}
	for (int y=0 ; y<dimensionY ; y++){
	    for (int x=0 ; x<dimensionX ; x++){
		System.out.print("+-");
	    }
	    System.out.println("+");
	    for (int x=0 ; x<dimensionX ; x++){
		System.out.print("| ");
	    }
	    System.out.println("|");
	}
	for (int x=0; x<dimensionX ; x++){
	    System.out.print("+-");
	}
	System.out.println("+");
  }
}
