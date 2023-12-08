public class Date{
    protected int annee;
    protected int mois;
    protected int jour;
    protected static int[] jourDuMois = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int annee, int mois, int jour){
	this.annee = annee;
	this.mois = mois;
	this.jour = jour;
    }
    
    public String toString(){
	String stringAnnee = add0(this.annee, 4);
	String stringMois = add0(this.mois, 2);
	String stringJour = add0(this.jour, 2);
	return stringAnnee + "-" + stringMois + "-" + stringJour;
    }
    
    public void lendemain(){
    	this.jour ++;
    	if (this.jour > Date.jourDuMois[this.mois-1]){
    		this.jour = 1;
    		this.mois ++;
    		if (this.mois > 12){
    			this.mois = 1;
    			this.annee ++;
    		}
    	}
    }
    
    public boolean compare(Date date){
    	if (this.annee == date.annee && this.mois == date.mois && this.jour == date.jour){
    		return true;
    	}
    	return false;
    }

    private static String add0(int nombre, int taille){
	int puissance10 = 1;
	String resultat = Integer.toString(nombre);
	for (int i=1; i<taille ; i++){
	    puissance10 *= 10;
	}
	while (nombre<puissance10){
	    resultat = "0" + resultat;
	    nombre *= 10;
	}
	return resultat;
    }
}
