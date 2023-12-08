import javax.swing.*;
import java.awt.*;

public class Q3Main{
    public static void main(String[] args){
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ProducteurDePoints producteur = new LigneAleatoire();
	//ProducteurDePoints producteur = new Etoile();
        Graphe dessin = new Graphe(producteur);
	fenetre.add(dessin);

	fenetre.setVisible(true);
    }
}
