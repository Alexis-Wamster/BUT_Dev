import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Main{
    public static void main(String[] args) {
	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Evenement forme = new Evenement();
	fenetre.add(forme);
	fenetre.addWindowListener(forme);
	    
	fenetre.setVisible(true);
    }
}
