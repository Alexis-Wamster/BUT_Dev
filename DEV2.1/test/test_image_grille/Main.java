import javax.swing.*;
import java.awt.*;

public class Main{
	public static void main(String[] args){
		System.out.println("Hello World !");

		GridLayout grille = new GridLayout(3,3);
		JFrame fenetre = new JFrame("SAE21_2022");
		String chemin = new String("test.png");
		fenetre.setLayout(grille);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(500, 300);
		fenetre.setLocation(0, 0);
	        for (int i = 0; i < 9; i++) {
		    fenetre.add(new testImage(chemin));
		}
		fenetre.setVisible(true);
	}
}
