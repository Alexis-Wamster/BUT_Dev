import javax.swing.*;
import java.awt.*;
public class Q4Main{
    public static void main(String[] args){
	JFrame fenetre = new JFrame();
	Tuile paterne = new Tuile("tuile.jpg");
	fenetre.setSize(500, 500);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.add(paterne);
	fenetre.setVisible(true);
    }
}
