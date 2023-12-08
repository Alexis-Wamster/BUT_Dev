import java.lang.*;

public class Q3Fibonacci{
    int tour;
    public Q3Fibonacci(){
        tour = -1;
    }
    public int fibonacci(int n) {
        this.tour ++;
        this.espace(n);
        if (n < 0){
            return -1;
        }
        if (n == 0){
            this.espace(0);
            this.tour --;
            return 0;
        }
        if (n == 1){
            this.espace(1);
            this.tour --;
            return 1;
        }
        int resultat = fibonacci(n-2) + fibonacci(n-1);
        this.espace(resultat);
        this.tour --;
        return resultat;
    }

    private void espace(int txt){
        for (int i=0; i<this.tour; i++){
            System.out.print("    ");
        }
        System.out.println(txt);
    }
}