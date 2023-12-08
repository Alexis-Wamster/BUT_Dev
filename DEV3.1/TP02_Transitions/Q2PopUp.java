import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2PopUp{
    public static JDialog createPopup(JFrame fenetre) {
    	JDialog popup = new JDialog(fenetre);
		popup.setTitle("^_^");
		popup.setSize(500, 300);
		popup.setLocation((int)(100+(Math.random()*800)), (int)(100+(Math.random()*500)));

		JLabel message = new JLabel("Veux tu vraiment fermer la meilleur appli de tout l'univers ?",JLabel.CENTER);
		JButton oui = new JButton("Oui (stp clic pas)");
		JButton non = new JButton("SURTOUT PAS !!!");
		
		Q2Bouton nePasFermer = new Q2Bouton(popup, null);
		Q2Bouton fermer = new Q2Bouton(popup, fenetre);
		
		oui.addActionListener(fermer);
		non.addActionListener(nePasFermer);

		JPanel question = new JPanel(new FlowLayout(FlowLayout.CENTER));

		message.setPreferredSize(new Dimension(10000,30));
		non.setPreferredSize(new Dimension(400,100));

		question.add(message);
		question.add(oui);
		question.add(non);

		popup.add(question, BorderLayout.CENTER);
	    popup.setVisible(true);
    	return popup;
	}
}