import java.util.*;

public class Arbre<E>{
    private Noeud<E> racine;
    private String strArbre;

    public Arbre(){
    }

    public Arbre(E racine){
        this.racine = new Noeud<E>(racine);
    }

    public Arbre(Noeud<E> racine){
        this.racine = racine;
    }

    public void setRacine(E racine){
        this.racine = new Noeud<E>(racine);
    }

    public Noeud<E> getRacine(){
        return this.racine;
    }

    public void afficheArbre(){
        this.strArbre = "";
        this.updateStrArbre(this.racine, 0);
        System.out.println(this.strArbre);
    }

    public void afficheArbreQ2(){
        this.strArbre = "";
        this.updateStrArbreQ2(this.racine);
        System.out.println(this.strArbre);
    }

    public void afficheArbreQ3(){
        this.strArbre = "";
        this.updateStrArbreQ3(this.racine);
        System.out.println(this.strArbre);
    }

    private void updateStrArbreQ3(Noeud<E> noeud){
        try{
            String valeur = noeud.getValue().toString();
            if (valeur.equals("x") || valeur.equals("/") || valeur.equals("+") || valeur.equals("-")){
                this.strArbre += "(";
            }
            else{
                this.strArbre += valeur;
            }
            List<Noeud<E>> fils = noeud.getFils();
            for (int i=0; i<fils.size(); i++){
                this.updateStrArbreQ3(fils.get(i));
                if (i == 0){
                    this.strArbre += valeur;
                }
                if (i == 1){
                    this.strArbre += ")";
                }
            }
        }
        catch (NullPointerException e){
            this.strArbre += "null";
        }
    }

    private void updateStrArbreQ2(Noeud<E> noeud){
        try{
            this.strArbre += noeud.getValue().toString() + " ";
            List<Noeud<E>> fils = noeud.getFils();
            for (int i=0; i<fils.size(); i++){
                this.updateStrArbreQ2(fils.get(i));
            }
        }
        catch (NullPointerException e){
            this.strArbre += "null";
        }
    }

    private void updateStrArbre(Noeud<E> noeud, int profondeur){
        int i;
        this.strArbre += "\n";
        for (i=0; i<profondeur; i++){
            this.strArbre += "        ";
        }
        try{
            this.strArbre += noeud.getValue().toString();
            List<Noeud<E>> fils = noeud.getFils();
            for (i=0; i<fils.size(); i++){
                this.updateStrArbre(fils.get(i), profondeur+1);
            }
        }
        catch (NullPointerException e){
            this.strArbre += "null";
        }
    }
}