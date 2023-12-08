import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1Main{
    public static void main(String[] args) {
	
		JFrame fenetre = new JFrame("Q1 Galerie");
		fenetre.setSize(300, 200);
		fenetre.setLocation(700, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLayout(new GridBagLayout());
		
		GridBagConstraints contrainte = new GridBagConstraints();
		
		// Bouton 1
		
		JButton bouton1 = new JButton("1");
		contrainte.gridx = 0;
		contrainte.gridy = 0;
		contrainte.gridwidth = 2;
		contrainte.gridheight = 1;
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.anchor = GridBagConstraints.CENTER;
		contrainte.weightx = 1.0;
		contrainte.weighty = 1.0;
		contrainte.insets = new Insets(0, 0, 0, 0);
		fenetre.add(bouton1, contrainte);
		
		// Bouton 2
		
		JButton bouton2 = new JButton("2");
		contrainte.gridx = 2;
		contrainte.gridy = 0;
		contrainte.gridwidth = 1;
		contrainte.gridheight = 2;
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.anchor = GridBagConstraints.CENTER;
		contrainte.weightx = 1.0;
		contrainte.weighty = 1.0;
		contrainte.insets = new Insets(0, 0, 0, 0);
		fenetre.add(bouton2, contrainte);
		
		// Bouton 3
		
		JButton bouton3 = new JButton("3");
		contrainte.gridx = 1;
		contrainte.gridy = 2;
		contrainte.gridwidth = 2;
		contrainte.gridheight = 1;
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.anchor = GridBagConstraints.CENTER;
		contrainte.weightx = 1.0;
		contrainte.weighty = 1.0;
		contrainte.insets = new Insets(0, 0, 0, 0);
		fenetre.add(bouton3, contrainte);
		
		// Bouton 4
		
		JButton bouton4 = new JButton("4");
		contrainte.gridx = 0;
		contrainte.gridy = 1;
		contrainte.gridwidth = 1;
		contrainte.gridheight = 2;
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.anchor = GridBagConstraints.CENTER;
		contrainte.weightx = 1.0;
		contrainte.weighty = 1.0;
		contrainte.insets = new Insets(0, 0, 0, 0);
		fenetre.add(bouton4, contrainte);
		
		// Bouton 5
		
		JButton bouton5 = new JButton("5");
		bouton5.setPreferredSize(new Dimension(50,50));
		contrainte.gridx = 1;
		contrainte.gridy = 1;
		contrainte.gridwidth = 1;
		contrainte.gridheight = 1;
		contrainte.fill = GridBagConstraints.BOTH;
		contrainte.anchor = GridBagConstraints.CENTER;
		contrainte.weightx = 0.0;
		contrainte.weighty = 0.0;
		contrainte.insets = new Insets(0, 0, 0, 0);
		fenetre.add(bouton5, contrainte);
		
		Q1ClosingEvent fermetureEvent = new Q1ClosingEvent(fenetre);
	    fenetre.addWindowListener(fermetureEvent);

		fenetre.setVisible(true);
	}
}