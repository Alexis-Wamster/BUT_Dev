public class Q1Arbre{
    private Q1Noeud racine;

    public Q1Arbre(){
        this.racine = null;
    }

    public Q1Arbre(int clef){
        this.racine = new Q1Noeud(clef);
    }

    public void add(int clef){
        if (this.racine == null){
            this.racine = new Q1Noeud(clef);
        }
        else{
            this.racine.add(clef);
        }
    }

    private void parcoursProfondeur(Q1Noeud noeud){
        if (noeud != null){
            if (noeud.getPetit() != null){
                parcoursProfondeur(noeud.getPetit());
            }
            System.out.print(noeud + " ");
            if (noeud.getGrand() != null){
                parcoursProfondeur(noeud.getGrand());
            }
        }
    }

    public void affichage(){
        this.parcoursProfondeur(this.racine);
        System.out.println();
    }
}