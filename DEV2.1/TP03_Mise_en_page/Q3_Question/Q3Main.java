import javax.swing.*;
import java.awt.*;

public class Q3Main{
    public static void main(String[] args) {
	
	JFrame fenetre = new JFrame("Question");
	fenetre.setSize(300, 200);
	fenetre.setLocation(700, 300);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JButton reponseOui = new JButton("Oui");
	JButton reponseNon = new JButton("Non");
	JButton reponseNSPP = new JButton("NSPP");

	JLabel texteQuestion = new JLabel("Aimez-vous les chiens ?", JLabel.CENTER);
	texteQuestion.setPreferredSize(new Dimension(10000,30));

	FlowLayout grilleQuestion = new FlowLayout(FlowLayout.CENTER);
        JPanel panneauQuestion = new JPanel();
	panneauQuestion.setLayout(grilleQuestion);
	panneauQuestion.add(texteQuestion);
        panneauQuestion.add(reponseOui);
	panneauQuestion.add(reponseNon);
	panneauQuestion.add(reponseNSPP);

	JPanel vide = new JPanel();
	vide.setPreferredSize(new Dimension(10000,50));
	
	fenetre.add(vide, BorderLayout.NORTH);
	fenetre.add(panneauQuestion, BorderLayout.CENTER);
	fenetre.setVisible(true);
    }
}
