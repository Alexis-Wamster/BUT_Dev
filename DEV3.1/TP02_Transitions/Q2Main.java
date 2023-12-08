import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Main{
    public static void main(String[] args) {
	
		JFrame fenetre = new JFrame("Q2 Galerie");
		fenetre.setSize(300, 200);
		fenetre.setLocation(700, 300);
		

		Q2Evenement evenementBouton = new Q2Evenement(fenetre);
	    fenetre.addMouseListener(evenementBouton);
	    fenetre.addWindowListener(new Q2ClosingEvent(fenetre));
		fenetre.setVisible(true);
	}
}