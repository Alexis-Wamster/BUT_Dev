public class Moyenne2{
    private double total;
    private int nbValeur;
    public Moyenne2(){
	this.nbValeur = 0;
	this.total = 0;
    }
    public void add(Number valeur){
	this.nbValeur ++;
        this.total += valeur.doubleValue();
    }
    public double getAverage(){
	return this.total/this.nbValeur;
    }
}
