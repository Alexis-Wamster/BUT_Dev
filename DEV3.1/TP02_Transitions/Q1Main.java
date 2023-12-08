import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1Main{
    public static void main(String[] args) {
	
		JFrame fenetre = new JFrame("Q1 Galerie");
		fenetre.setSize(300, 200);
		fenetre.setLocation(700, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		Q1Evenement evenementBouton = new Q1Evenement(fenetre, "Images/0000000.png");
	    fenetre.addMouseListener(evenementBouton);

		fenetre.setVisible(true);
	}
}