import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4Main{
    public static void main(String[] args) {
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel contenu = new JPanel();
	
	FondEvent evenementBouton = new FondEvent(contenu);

	evenementBouton.boutonCyan.addActionListener(evenementBouton);
	evenementBouton.boutonMagenta.addActionListener(evenementBouton);
	evenementBouton.boutonJaune.addActionListener(evenementBouton);

	fenetre.add(contenu);
	fenetre.setVisible(true);
    }
}
