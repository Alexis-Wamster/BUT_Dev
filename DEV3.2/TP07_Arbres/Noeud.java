import java.util.*;

public class Noeud<E>{
    private E valeur;
    private List<Noeud<E>> fils;

    public Noeud(E valeur){
        this.valeur = valeur;
        this.fils = new ArrayList<Noeud<E>>();
    }

    public E getValue(){
        return this.valeur;
    }

    public List<Noeud<E>> getFils(){
        return this.fils;
    }

    public void add(Noeud<E> fils){
        this.fils.add(fils);
    }
}