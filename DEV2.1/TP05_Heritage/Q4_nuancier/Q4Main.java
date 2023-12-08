import javax.swing.*;
import javax.swing.*;
import java.awt.*;
public class Q4Main{
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Nuancier");
	fenetre.setLocation(100, 100);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	FlowLayout grille = new FlowLayout(FlowLayout.CENTER);
	fenetre.setLayout(grille);
	
	AffichageCouleur[] nuanceTab = new AffichageCouleur[args.length];
	for (int i=0; i<args.length; i++){
	    nuanceTab[i] = new AffichageCouleur(args[i]);
	    fenetre.add(nuanceTab[i].ensemble);
	}
	
	fenetre.pack();
	fenetre.setVisible(true);
    }
}
