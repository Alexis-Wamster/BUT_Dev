public class Grille{
    int[][] grille;
    
    public Grille(){
	this.grille = new int[7][6];
	for (int[] colone : this.grille){
	    for (int emplacement : colone){
		emplacement = 0;
	    }
	}
    }
    public void jouer(int numColone, int couleur){
	boolean flag=false;
	int nbLigne = this.grille[0].length;
	int nbColone = this.grille.length;
	for (int i=0; i<nbLigne && flag==false; i++){
	    if ((i+1)>=nbLigne || (numColone<nbColone && this.grille[numColone][i+1]!=0 && this.grille[numColone][i]==0)){
		this.grille[numColone][i] = couleur;
		flag=true;
	    }
	}
    }
    @Override
    public String toString(){
	String affichage = new String("");
	for (int ligne=0; ligne<this.grille[0].length; ligne++){
	    affichage += "│";
	    for (int colone=0; colone<this.grille.length; colone++){
		if (this.grille[colone][ligne]==1){
		    affichage += "○";
		    affichage += "│";
		}
		if (this.grille[colone][ligne]==2){
		    affichage += "●";
		    affichage += "│";
		}
		if (this.grille[colone][ligne]<1 || this.grille[colone][ligne]>2){
		    affichage += " ";
		    affichage += "│";
		}
	    }
	    affichage += "\n";
	}
	affichage += "┴";
	for (int colone=0; colone<this.grille.length; colone++){
	    affichage += "─┴";
	}
	return affichage;
    }
}
