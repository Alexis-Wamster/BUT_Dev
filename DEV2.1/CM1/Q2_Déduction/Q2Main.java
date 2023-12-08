//Wamster Alexis

public class Q2Main{
    public static void main(String[] args){
	Carte firstCarte = new Carte(666);
	for (int i=0; i<15; i++){
	    firstCarte.crediter();
	    System.out.println(firstCarte);
	}
	firstCarte.vider();
	firstCarte.vider();
	firstCarte.vider();
	firstCarte.vider();
	for (int i=0; i<15; i++){
	    firstCarte.crediter();
	    System.out.println(firstCarte);
	}

	YesCard secondeCarte = new YesCard(666);
	for (int i=0; i<15; i++){
	    secondeCarte.crediter();
	    System.out.println(secondeCarte);
	}
	secondeCarte.vider();
	secondeCarte.vider();
	secondeCarte.vider();
	secondeCarte.vider();
	for (int i=0; i<15; i++){
	    secondeCarte.crediter();
	    System.out.println(secondeCarte);
	}
    }
}
