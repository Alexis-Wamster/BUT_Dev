import javax.swing.*;
import java.awt.*;
public class Q2Main{
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
	fenetre.setSize(800, 800);
	fenetre.setLocation(100, 100);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.add(texte,BorderLayout.CENTER);
	
	JLabel texte = new JLabel("Ceci est sur fond gris",JLabel.CENTER);
	texte.setOpaque(true);
	texte.setBackground(new Gris(100));
	
	fenetre.setVisible(true);
    }
}
