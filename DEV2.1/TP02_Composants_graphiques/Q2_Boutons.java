import javax.swing.*;
import java.awt.*;
 
public class Q2_Boutons {
  public static void main(String[] args) {

    JFrame fenetre = new JFrame();

    fenetre.setSize(500, 300);
    fenetre.setLocation(0, 0);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	JButton boutton1 = new JButton("bouton1");
    	fenetre.add(boutton1, BorderLayout.NORTH);
    	
    	JButton boutton2 = new JButton("bouton2");
    	fenetre.add(boutton2, BorderLayout.WEST);
    	
    	JButton boutton3 = new JButton("bouton3");
    	fenetre.add(boutton3, BorderLayout.CENTER);
    	
    	JButton boutton4 = new JButton("bouton4");
    	fenetre.add(boutton4, BorderLayout.EAST);
    	
    	JButton boutton5 = new JButton("bouton5");
    	fenetre.add(boutton5, BorderLayout.SOUTH);
    
    // et on montre le resultat
    fenetre.setVisible(true);
  }
}
