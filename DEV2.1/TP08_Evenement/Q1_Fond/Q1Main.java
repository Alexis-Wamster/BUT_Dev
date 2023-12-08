import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1Main{
    public static void main(String[] args) {
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton boutonCyan = new JButton("Cyan");
	JButton boutonMagenta = new JButton("Magenta");
	JButton boutonJaune = new JButton("Jaune");
	
	JPanel contenu = new JPanel();
	contenu.add(boutonCyan);
	contenu.add(boutonMagenta);
	contenu.add(boutonJaune);
	
	FondEvent evenementBouton = new FondEvent(contenu);

	boutonCyan.addActionListener(evenementBouton);
	boutonMagenta.addActionListener(evenementBouton);
	boutonJaune.addActionListener(evenementBouton);

	fenetre.add(contenu);
	fenetre.setVisible(true);
    }
}
