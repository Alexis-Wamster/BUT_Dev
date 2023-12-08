//Wamster Alexis

public class Carte{
    private int numCarte;
    private int creditTotal;
    private int creditActuel;
    

    public Carte(int numCarte){
	this.creditTotal = 0;
	this.creditActuel = 0;
	this.numCarte = numCarte;
    }

    public int voir(){
	return this.creditActuel;
    }

    public void crediter(){
    	this.creditTotal++;
	if (this.creditActuel < 10){
	    this.creditActuel++;
	}
    }

    public void vider(){
	this.creditActuel = 0;
    }

    @Override
    public String toString(){
	String carte = new String("");
	carte += "Numéro de carte : ";
	carte += this.numCarte;
	carte += "\nCrédit actuel  : ";
	carte += this.creditActuel;
	carte += "\nCrédit total   : ";
	carte += this.creditTotal;
	return carte;
    }
    
}
