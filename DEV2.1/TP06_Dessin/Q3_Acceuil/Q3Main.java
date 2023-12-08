import javax.swing.*;
import java.awt.*;
public class Q3Main{
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Acceuil");
	fenetre.setLocation(100, 100);
	fenetre.setSize(288,223);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setLayout(null);

        AfficheImage fond = new AfficheImage("login.jpg");
	fond.setSize(278,183);
	fond.setLocation(0,5);

	JTextField identifiant = new JTextField();
	identifiant.setSize(150,29);
	identifiant.setLocation(110,95);
	
	JTextField motDePasse = new JTextField();
	motDePasse.setSize(150,29);
	motDePasse.setLocation(110,135);
	
	fenetre.add(fond);
	fenetre.add(identifiant);
	fenetre.add(motDePasse);
	fenetre.setVisible(true);
    }
}
