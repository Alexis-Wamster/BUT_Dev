import javax.swing.*;
import java.awt.*;

public class Depart{
	public static void main(String[] args){
		System.out.println("Hello World !");
		//int[][] tableau = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		//DataFenetre test = new DataFenetre(4,tableau);
		//test.rendreVisible();

		GridLayout grille = new GridLayout(3,3);
		JFrame fenetre = new JFrame("SAE21_2022");
		String[] chemin = {new String("test.png")};
		JPanel[] listePanneau = new JPanel[9];
		fenetre.setLayout(grille);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(500, 300);
		fenetre.setLocation(0, 0);
		for (JPanel panneau : listePanneau){
		    panneau = new JPanel();
		    panneau.add(new Redimensioneur(chemin));
		    fenetre.add(panneau);
		}
		fenetre.add(new Redimensioneur(chemin));
		fenetre.setVisible(true);
	}
}
