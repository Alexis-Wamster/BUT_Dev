import javax.swing.*;
import java.awt.*;

public class DataFenetre{
	private JFrame fenetre;
	private GridLayout grille;
	private JPanel[][] listeCase;
	private static final Color[] couleur = {Color.BLACK, Color.WHITE};

	public DataFenetre(int taille, int[][] listeCaseInt){
		this.grille = new GridLayout(taille, taille);

		this.fenetre = new JFrame("SAE21_2022");
		this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.fenetre.setLayout(this.grille);
    	this.fenetre.setSize(500, 300);
    	this.fenetre.setLocation(0, 0);

    	this.listeCase = new JPanel[taille][taille];
    	for (int y=0; y<taille; y++){
    		for (int x=0; x<taille; x++){
    			this.listeCase[x][y] = new JPanel();
    			this.listeCase[x][y].setBackground(couleur[listeCaseInt[x][y]]);
    			this.listeCase[x][y].setOpaque(true);
    			this.listeCase[x][y].add(new Redimensioneur(new String[]{"test.png"}));
    			fenetre.add(this.listeCase[x][y]);
    		}
    	}

	}

	public void rendreVisible(){
		this.fenetre.setVisible(true);
		this.fenetre.repaint();
	}
}
