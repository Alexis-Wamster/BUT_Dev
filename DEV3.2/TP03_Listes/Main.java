import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
	JFrame fenetre = new JFrame();
	fenetre.setSize(700, 300);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ListeParallelogramme listeParallelogramme = new ListeParallelogramme();
	for (int i=0; i<10; i++){
		listeParallelogramme.add();
	}

    Dessin lesDessins = new Dessin(listeParallelogramme);
	fenetre.add(lesDessins);

	fenetre.setVisible(true);

	JPanel origine = new JPanel();
    fenetre.add(origine);

	Action action = new Action(listeParallelogramme, origine, fenetre);
	fenetre.addMouseListener(action);
    }
}
