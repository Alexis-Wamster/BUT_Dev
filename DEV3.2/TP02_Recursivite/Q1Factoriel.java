import java.lang.*;

public class Q1Factoriel{
    int tour;
    public Q1Factoriel(){
        tour = -1;
    }
    public long factoriel(long n) {
        this.tour ++;
        this.espace(n);
        if (n < 0){
            return -1;
        }
        if (n < 2){
            //Thread.dumpStack();
            this.espace(1);
            this.tour --;
            return 1;
        }
        long resultat = n*factoriel(n-1);
        this.espace(resultat);
        this.tour --;
        return resultat;
    }

    public void espace(long txt){
        for (int i=0; i<this.tour; i++){
            System.out.print("    ");
        }
        System.out.println(txt);
    }
}