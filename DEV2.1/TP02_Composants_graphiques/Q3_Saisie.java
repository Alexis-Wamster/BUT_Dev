import javax.swing.*;
import java.awt.*;
 
public class Q3_Saisie{
  public static void main(String[] args) {

    JFrame fenetre = new JFrame();

    fenetre.setSize(500, 300);
    fenetre.setLocation(0, 0);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Font myFont1 = new  Font("Arial", Font.BOLD, 14);

    JTextField champsTexte = new JTextField("");
    champsTexte.setBackground(new Color(206,206,206));
    champsTexte.setForeground(Color.GREEN);
    champsTexte.setFont(myFont1);
    fenetre.add(champsTexte, BorderLayout.SOUTH);

    
    JTextArea zoneTexte = new JTextArea("Saisissez votre texte");
    zoneTexte.setBackground(new Color(0,0,0));
    zoneTexte.setForeground(new Color(30,220,30));
    zoneTexte.setFont(myFont1);
    fenetre.add(zoneTexte);
    	
    
    fenetre.setVisible(true);
  }
}
