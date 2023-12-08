import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Barre{
    public static void main(String[] args) {

	Rectangle test = new Rectangle();
	
	JFrame fenetre = new JFrame();
	fenetre.setSize(800, 800);
	fenetre.setLocation(100, 100);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.add(test);
	test.addMouseListener(test);
	test.addMouseMotionListener(test);
	fenetre.setVisible(true);
    }
}
