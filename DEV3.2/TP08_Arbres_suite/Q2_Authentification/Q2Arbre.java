public class Q2Arbre{
    private Q2Noeud racine;

    public Q2Arbre(){
        this.racine = null;
    }

    public Q2Arbre(int clef, String identifiant, String motDePasse){
        this.racine = new Q2Noeud(clef, identifiant, motDePasse);
    }

    public void add(int clef, String identifiant, String motDePasse){
        if (this.racine == null){
            this.racine = new Q2Noeud(clef, identifiant, motDePasse);
        }
        else{
            this.racine.add(clef, identifiant, motDePasse);
        }
    }

    public Q2Noeud get(int clef){
        if (this.racine != null){
            return this.racine.get(clef);
        }
        return null;
    }

    public boolean remove(int clef){    
        if (this.racine != null){
            System.out.println("remove");
            Q2Noeud pereDeNoeudASuppr = this.racine.getPere(clef);
            Boolean fils = pereDeNoeudASuppr.filsIsSmaller(clef);
            Q2Noeud noeudASuppr = pereDeNoeudASuppr.getFils(fils);
            if (noeudASuppr != null){          
                if (noeudASuppr.getPetit() == null){
                    System.out.println("petit");
                    pereDeNoeudASuppr.setFils(fils, noeudASuppr.getGrand());
                    return true;
                }
                else if (noeudASuppr.getGrand() == null){
                    pereDeNoeudASuppr.setFils(fils, noeudASuppr.getPetit());
                    return true;
                }
                else{
                    Q2Noeud noeudRemplacant = noeudASuppr.getSuivant();
                    if (noeudRemplacant.getKey() != noeudASuppr.getKey()){
                        return noeudASuppr.updateAttribut(noeudRemplacant);
                    }
                }
            }
        }
        System.out.println("null2");
        return false;
    }

    private void parcoursProfondeur(Q2Noeud noeud){
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