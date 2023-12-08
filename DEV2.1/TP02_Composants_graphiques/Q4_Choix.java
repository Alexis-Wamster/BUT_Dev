import javax.swing.*;
import java.awt.*;
 
public class Q4_Choix{
  public static void main(String[] args) {
  	
  	JPanel[] maison = {new JPanel(), new JPanel(), new JPanel()};
  	
  	maison[0].add(new JRadioButton());
  	maison[1].add(new JRadioButton());
  	maison[2].add(new JRadioButton());
    
    GridLayout maisonListe = new GridLayout(3,1);
  	 
  	 
  	 JPanel maisonContainer = new JPanel();
  	 maisonContainer.setLayout(maisonListe);
  	 
  	 for (JPanel element : maison){
  	 	maisonContainer.add(element);
  	 }
    
    JPanel mainContainer = new JPanel(new BorderLayout());
    
    JFrame fenetre = new JFrame("Poudlard");
    fenetre.setSize(500, 300);
    fenetre.setLocation(0, 0);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.add(mainContainer);
    fenetre.setVisible(true);
  }
}
