import javax.swing.*;
import java.awt.*;

public class Q4Main{
    public static void main(String[] args) {
	
	JFrame fenetre = new JFrame("Question");
	fenetre.setSize(300, 200);
	fenetre.setLocation(700, 300);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel[] texteListe = {
	    new JLabel("Mystral", JLabel.LEFT),
	    new JLabel("Tramontan", JLabel.CENTER),
	    new JLabel("Grec", JLabel.RIGHT),
	    new JLabel("Pontant", JLabel.LEFT),
	    new JLabel("Levant", JLabel.RIGHT),
	    new JLabel("Libeccio", JLabel.LEFT),
	    new JLabel("Martin", JLabel.CENTER),
	    new JLabel("Sirocco", JLabel.RIGHT)
	};

	JPanel haut = new JPanel(new GridLayout(1,3));
	haut.add(texteListe[0]);
	haut.add(texteListe[1]);
	haut.add(texteListe[2]);
	    
	JPanel centre = new JPanel(new GridLayout(1,3));
	centre.add(texteListe[3]);
	centre.add(texteListe[4]);
	
	JPanel bas = new JPanel(new GridLayout(1,3));
	bas.add(texteListe[5]);
	bas.add(texteListe[6]);
	bas.add(texteListe[7]);

	fenetre.add(haut, BorderLayout.NORTH);
	fenetre.add(centre, BorderLayout.CENTER);
	fenetre.add(bas, BorderLayout.SOUTH);
	fenetre.setVisible(true);
    }
}

