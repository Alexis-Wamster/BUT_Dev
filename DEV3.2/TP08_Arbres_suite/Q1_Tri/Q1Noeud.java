public class Q1Noeud{
    private int clef;
    private Q1Noeud petit;
    private Q1Noeud grand;
    private int occurence;

    public Q1Noeud(int clef){
        this.clef = clef;
        this.petit = null;
        this.grand = null;
        this.occurence = 1;
    }

    public int getKey(){
        return this.clef;
    }

    public void add(int fils){
        if (fils < this.clef){
            if (this.petit == null){
                this.petit = new Q1Noeud(fils);
            }
            else{
                this.petit.add(fils);
            }
        }
        if (fils > this.clef){
            if (this.grand == null){
                this.grand = new Q1Noeud(fils);
            }
            else{
                this.grand.add(fils);
            }
        }
        if (fils == this.clef){
            this.occurence ++;
        }
    }

    public void add(Q1Noeud newNoeud){
        if (newNoeud.getKey() < this.clef){
            if (this.petit == null){
                this.petit = newNoeud;
            }
            else{
                this.petit.add(newNoeud);
            }
        }
        if (newNoeud.getKey() > this.clef){
            if (this.grand == null){
                this.grand = newNoeud;
            }
            else{
                this.grand.add(newNoeud);
            }
        }
        if (newNoeud.getKey() == this.clef){
            this.occurence ++;
        }
    }

    public Q1Noeud suivant(int clef){
        if (clef != this.clef){
            Q1Noeud next = null;
            if (clef < this.clef){
                if (this.petit != null){
                    next = this.petit.suivant(clef);
                }
                else{
                    System.out.print(" 1)"+this);
                    return this;
                }
            }
            if (clef > this.clef){
                if (this.grand != null){
                    next = this.grand.suivant(clef);
                }
                else{
                    System.out.print(this);
                    return this;
                }
            }
            if (next == null){
                System.out.print(" 2)"+this);
                return this;
            }
            else{
                System.out.print(" 3)"+next);
                return next;
            }
        }
        else{
            System.out.print(" 4)"+this.getGrand());
            return this.getGrand();
        }
    }

    public Q1Noeud getPetit(){
        return this.petit;
    }

    public Q1Noeud getGrand(){
        return this.grand;
    }

    @Override
    public String toString(){
        String resultat = "";
        int i;
        for (i=0; i<this.occurence; i++){
            resultat += (this.clef + " ");
        }
        return resultat;
    }
}