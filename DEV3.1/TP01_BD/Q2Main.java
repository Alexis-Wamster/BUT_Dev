import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Main{
    public static void main(String[] args) {
	
		JFrame fenetre = new JFrame("Question 2");
		fenetre.setSize(300, 200);
		fenetre.setLocation(700, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel labelPays = new JLabel("", JLabel.CENTER);
	    JLabel labelScore = new JLabel("", JLabel.CENTER);

	    JButton bouton = new JButton("o");
	    JPanel bas = new JPanel(new BorderLayout());
	    bas.add(bouton,BorderLayout.EAST);

	    String[] bestPays = Q2BestPays.bestPays();
	    if (bestPays != null){
	    	labelPays.setText(bestPays[0]);
    		labelScore.setText(bestPays[1]);
	    }

		fenetre.add(labelPays, BorderLayout.NORTH);
		fenetre.add(labelScore, BorderLayout.CENTER);
		fenetre.add(bas, BorderLayout.SOUTH);

		Q2Evenement evenementBouton = new Q2Evenement(labelPays, labelScore);
	    bouton.addActionListener(evenementBouton);

		fenetre.setVisible(true);
	}
}