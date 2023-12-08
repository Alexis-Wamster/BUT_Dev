import javax.swing.*;
import java.awt.*;
public class Q2Main{
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Sautoir");
	fenetre.setLocation(100, 100);
	fenetre.setSize(288,215);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	GridLayout grille = new GridLayout(Sablier.nbLigne, Sablier.nbColone);
        fenetre.setLayout(grille);

	Sablier[][] listeSablier = new Sablier[Sablier.nbLigne][Sablier.nbColone];
	for (int y=0; y<Sablier.nbLigne; y++){
	    for (int x=0; x<Sablier.nbColone; x++){
		listeSablier[y][x] = new Sablier();
		fenetre.add(listeSablier[y][x]);
	    }
	}
	
	fenetre.setVisible(true);
    }
}
