public class Q2Maillon <T>{

    T valeur;
    Q2Maillon <T> ancien;


    public Q2Maillon(Q2Maillon <T> ancien, T valeur){
        this.ancien = ancien;
        this.valeur = valeur;
    }
}