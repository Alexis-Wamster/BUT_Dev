import javax.swing.*;
import java.awt.*;

public class Q4Main{
    public static void main(String[] args){
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	GridLayout grille = new GridLayout(5,5);
	fenetre.setLayout(grille);
	
        Cercle[][] tabCercle = new Cercle[5][5];
	int vert = 0;
        for (Cercle[] ligne : tabCercle){
	    int bleu = 25;
	    vert += 50;
	    for (Cercle cercle : ligne){
		cercle = new Cercle(0,vert,bleu);
		fenetre.add(cercle);
		bleu += 50;
	    }
	}

	fenetre.setVisible(true);
    }
}
