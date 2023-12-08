//Wamster Alexis
import javax.swing.*;
import java.awt.*;

public class Q4Main{
    public static void main(String[] args) {
	
	JFrame fenetre = new JFrame("Directions");
	fenetre.setSize(300, 200);
	fenetre.setLocation(700, 300);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setBackground(new Color(115,194,251));

	ActionSouris detectClic = new ActionSouris(fenetre, 60);
	fenetre.addMouseListener(detectClic);

	Soleil dessinSoleil = new Soleil(detectClic);
	fenetre.add(dessinSoleil);
	
	fenetre.setVisible(true);
    }
}
