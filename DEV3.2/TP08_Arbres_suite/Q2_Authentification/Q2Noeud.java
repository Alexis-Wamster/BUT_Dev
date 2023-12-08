public class Q2Noeud{
    private int clef;
    private Q2Noeud petit;
    private Q2Noeud grand;
    private String identifiant;
    private String motDePasse;

    public Q2Noeud(int clef, String identifiant, String motDePasse){
        this.clef = clef;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
        this.petit = null;
        this.grand = null;
    }

    public int getKey(){
        return this.clef;
    }

    public String getIdentifiant(){
        return this.identifiant;
    }

    public String getMotDePasse(){
        return this.motDePasse;
    }

    public void add(int fils, String identifiant, String motDePasse){
        if (fils < this.clef){
            if (this.petit == null){
                this.petit = new Q2Noeud(fils, identifiant, motDePasse);
            }
            else{
                this.petit.add(fils, identifiant, motDePasse);
            }
        }
        if (fils > this.clef){
            if (this.grand == null){
                this.grand = new Q2Noeud(fils, identifiant, motDePasse);
            }
            else{
                this.grand.add(fils, identifiant, motDePasse);
            }
        }
        if (fils == this.clef){
            this.motDePasse = motDePasse;
            this.identifiant = identifiant;
        }
    }

    public Q2Noeud get(int clef){
        if (clef < this.clef){
            if (this.getPetit() != null){
                return this.getPetit().get(clef);
            }
            return null;
        }
        if (clef > this.clef){
            if (this.getGrand() != null){
                return this.getGrand().get(clef);
            }
            return null;
        }
        if (clef == this.clef){
            return this;
        }
        return null;
    }

    public Q2Noeud getPere(int clef){
        if (clef < this.clef){
            if (this.getPetit() != null){
                if (this.getPetit().getKey() == clef){
                    return this;
                }
                return this.getPetit().getPere(clef);
            }
        }
        if (clef > this.clef){
            if (this.getGrand() != null){
                if (this.getGrand().getKey() == clef){
                    return this;
                }
                return this.getGrand().getPere(clef);
            }
        }
        return null;
    }

    public Q2Noeud getPetit(){
        return this.petit;
    }

    public Q2Noeud getGrand(){
        return this.grand;
    }

    public Q2Noeud getFils(Boolean isSmaller){
        if (isSmaller == true){
            return this.petit;
        }
        if (isSmaller == false){
            return this.grand;
        }
        return null;
    }

    public Q2Noeud getSuivant(){
        if (this.getGrand() != null){
            return this.getGrand().getAvant();
        }
        return this;
    }

    public Q2Noeud getAvant(){
        if (this.getPetit() != null){
            return this.getPetit().getAvant();
        }
        return this;
    }

    public boolean setFils(boolean isSmaller, Q2Noeud fils){
        if (isSmaller == true){
            this.petit = fils;
            return true;
        }
        if (isSmaller == false){
            this.grand = fils;
            return true;
        }
        return false;
    }

    public Boolean filsIsSmaller(int clef){
        if (this.petit.getKey() == clef){
            return true;
        }
        if (this.grand.getKey() == clef){
            return false;
        }
        return null;
    }

    public int getNbFils(){
        int nbFils = 0;
        if (this.petit != null){
            nbFils ++;
        }
        if (this.grand != null){
            nbFils ++;
        }
        return nbFils;
    }

    public boolean updateAttribut(Q2Noeud nouveau){
        if (nouveau.getKey() > this.petit.getKey() && nouveau.getKey() < this.grand.getKey()){
            this.clef = nouveau.getKey();
            this.identifiant = nouveau.identifiant;
            this.motDePasse = nouveau.motDePasse;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return this.clef + " " + this.identifiant + " " + this.motDePasse;
    }
}