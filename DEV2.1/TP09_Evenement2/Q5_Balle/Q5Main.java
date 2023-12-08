import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q5Main{
    public static void main(String[] args) {

	Icon balle = new Icon("terre.jpg","balle.png");
	
	JFrame fenetre = new JFrame();
	fenetre.setSize(404, 624);
	fenetre.setLocation(100, 100);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.add(balle);
	balle.addMouseListener(balle);
	balle.addMouseMotionListener(balle);
	fenetre.setVisible(true);
    }
}
