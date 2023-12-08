//Wamster Alexis
import javax.swing.*;
import java.awt.*;

public class Q3Main{
    public static void main(String[] args) {
	
	JFrame fenetre = new JFrame("Directions");
	fenetre.setSize(300, 200);
	fenetre.setLocation(700, 300);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton[] boutonListe = {
	    new JButton("◤"),
	    new JButton("◥"),
	    new JButton("◣"),
	    new JButton("◢")
	};

	JPanel haut = new JPanel(new BorderLayout());
	haut.add(boutonListe[0],BorderLayout.WEST);
	haut.add(boutonListe[1],BorderLayout.EAST);
	
	JPanel bas = new JPanel(new BorderLayout());
	bas.add(boutonListe[2],BorderLayout.WEST);
	bas.add(boutonListe[3],BorderLayout.EAST);

	fenetre.add(haut, BorderLayout.NORTH);
	fenetre.add(bas, BorderLayout.SOUTH);
	fenetre.setVisible(true);
    }
}
