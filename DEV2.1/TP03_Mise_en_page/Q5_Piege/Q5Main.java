import javax.swing.*;
import java.awt.*;

public class Q5Main{
    public static void main(String[] args) {
	
	JFrame fenetre = new JFrame("Question");
	fenetre.setSize(510, 535);
	fenetre.setLocation(700, 300);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setLayout(null);

        JButton un = new JButton("1");
	un.setSize(400,60);
	un.setLocation(0,0);
	fenetre.add(un);
	
	JButton deux = new JButton("2");
	deux.setSize(100,440);
	deux.setLocation(400,0);
	fenetre.add(deux);
	
	JButton trois = new JButton("3");
	trois.setSize(400,60);
	trois.setLocation(100,440);
	fenetre.add(trois);
	
	JButton quatre = new JButton("4");
	quatre.setSize(100,440);
	quatre.setLocation(0,60);
	fenetre.add(quatre);

	JButton cinq = new JButton("5");
	cinq.setSize(300,380);
	cinq.setLocation(100,60);
	fenetre.add(cinq);
	
	fenetre.setVisible(true);
    }
}
