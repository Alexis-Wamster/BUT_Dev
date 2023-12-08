import java.util.*;

public class ListeParallelogramme{

    public List<Parallelogramme> liste;

    public ListeParallelogramme(){
        liste = new ArrayList<>();
    }

    public void add(){
        int taille = this.liste.size();
        if (taille == 0){
            this.liste.add(new Parallelogramme());
        }
        else{
            Parallelogramme dernier = this.liste.get(this.liste.size()-1);
            this.liste.add(new Parallelogramme(dernier));
        }
    }

    public void delete(Parallelogramme parallelogramme){
        Parallelogramme suppr = parallelogramme;
        while((parallelogramme = this.next(parallelogramme)) != null){
            parallelogramme.translationGauche();
        }
        this.liste.remove(suppr);
    }

    public int size(){
        return this.liste.size();
    }

    public Parallelogramme get(int indice){
        if (indice >= 0 && indice < this.liste.size()){
            return this.liste.get(indice);
        }
        return null;
    }

    public Parallelogramme next(Parallelogramme parallelogramme){
        int indice = this.liste.indexOf(parallelogramme);
        if (indice+1 < this.liste.size()){
            return this.liste.get(indice+1);
        }
        return null;
    }
}