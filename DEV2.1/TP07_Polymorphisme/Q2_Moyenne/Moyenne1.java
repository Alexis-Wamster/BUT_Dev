public class Moyenne1{
    double total;
    int nbValeur;
    public Moyenne1(){
	this.nbValeur = 0;
	this.total = 0;
    }
    public void add(byte valeur){
	this.nbValeur ++;
        this.total = this.total + valeur;
    }
    public void add(short valeur){
	this.nbValeur ++;
        this.total = this.total + valeur;
    }
    public void add(int valeur){
	this.nbValeur ++;
        this.total = this.total + valeur;
    }
    public void add(long valeur){
	this.nbValeur ++;
        this.total = this.total + valeur;
    }
    public void add(float valeur){
	this.nbValeur ++;
        this.total = this.total + valeur;
    }
    public void add(double valeur){
	this.nbValeur ++;
        this.total = this.total + valeur;
    }
    public double getAverage(){
	return this.total/this.nbValeur;
    }
}
