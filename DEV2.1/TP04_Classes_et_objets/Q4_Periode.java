public class Periode extends Date{
    protected int interval;
    protected int anneeFin;
    protected int moisFin;
    protected int jourFin;
    
    public Periode(int anneeDebut, int moisDebut, int jourDebut, int anneeFin, int moisFin, int jourFin){
	super(anneeDebut, moisDebut, jourDebut);
	this.anneeFin = anneeFin;
	this.moisFin = moisFin;
	this.jourFin = jourFin;
	this.interval = compteurJour();
    }

    public int compteurJour(){
	int compteur = 0;
	compteur += this.anneeFin*365;
	for (i=0 ; i<this.moisFin ; i++){
	    compteur += this.jourDuMois[i];
	}
	compteur += this.jourFin;

	compteur -= this.anneeDebut*365;
	for (i=0 ; i<this.moisDebut ; i++){
	    compteur -= this.jourDuMois[i];
	}
	compteur -= this.jourDebut;
	
	return compteur;
    }

    public void(){
	this.lendemain
    }
}
