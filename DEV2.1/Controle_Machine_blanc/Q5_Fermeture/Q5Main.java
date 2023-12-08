import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q5Main{
    public static void main(String[] args){
	JFrame fenetre = new JFrame();
	ActionFenetre fenetreDynamique = new ActionFenetre(fenetre);
	JLabel message = new JLabel("Minimisez la fenêtre avant de la fermer !", JLabel.CENTER);
	fenetre.setSize(500, 500);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	fenetre.add(message, BorderLayout.CENTER);
	fenetre.addWindowListener(fenetreDynamique);
	fenetre.setVisible(true);
    }
}
