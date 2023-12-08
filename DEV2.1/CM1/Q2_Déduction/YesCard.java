//Wamster Alexis

public class YesCard{
    private int numCarte;
    private int creditTotal;
    private int creditActuel;
    

    public YesCard(int numCarte){
	this.creditTotal = 0;
	this.creditActuel = 0;
	this.numCarte = numCarte;
    }

    public int voir(){
		return 10;
    }

    public void crediter(){
	if (this.creditActuel < 10){
	    this.creditTotal++;
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
	carte += this.voir();
	carte += "\nCrédit total   : ";
	carte += this.creditTotal;
	return carte;
    }
    
}
