import javax.swing.*;
import java.awt.*;
 
public class Q5_Contingences{
  public static void main(String[] args) {

    JFrame fenetre = new JFrame();

    fenetre.setSize(500, 300);
    fenetre.setLocation(0, 0);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField champsTexte = new JTextField("yttretyrt");
    champsTexte.setBackground(new Color(206,206,206));
    champsTexte.setForeground(Color.GREEN);
    fenetre.add(champsTexte, BorderLayout.SOUTH);

    
    JTextArea zoneTexte = new JTextArea("Saisissez votre texte");

    JScrollPane ascensseur = new JScrollPane();
    ascensseur.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    zoneTexte.setBackground(new Color(0,0,0));
    zoneTexte.setForeground(Color.GREEN);
    fenetre.add(zoneTexte, BorderLayout.NORTH);
    	
    
    fenetre.setVisible(true);
  }
}
