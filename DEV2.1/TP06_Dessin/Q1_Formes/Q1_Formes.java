import javax.swing.*;
import java.awt.*;

public class Q1_Formes{
    public static void main(String[] args){
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dessin lesDessins = new Dessin();
	fenetre.add(lesDessins);

	fenetre.setVisible(true);
    }
}
