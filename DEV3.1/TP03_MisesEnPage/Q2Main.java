import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Main{
    public static void main(String[] args) {
	
		JFrame fenetre = new JFrame("Question 2");
		fenetre.setSize(300, 200);
		fenetre.setLocation(700, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		String[] resultat = Q2GetBD.getBD();
		System.out.println();
	}
}