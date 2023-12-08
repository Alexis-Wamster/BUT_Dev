import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Playlist{
    public static void main(String args[]){
	
	JFrame fenetre = new JFrame();
	fenetre.setSize(800, 800);
	fenetre.setLocation(100, 100);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel[] listeMusique = {
	    new JLabel("Speak To Me / Breathe",JLabel.CENTER),
	    new JLabel("On The Run",JLabel.CENTER),
	    new JLabel("Time",JLabel.CENTER),
	    new JLabel("The Great Gig In The Sky",JLabel.CENTER),
	    new JLabel("Money",JLabel.CENTER),
	    new JLabel("Us And Them",JLabel.CENTER),
	    new JLabel("Any Colour You Like",JLabel.CENTER),
	    new JLabel("Brain Damage",JLabel.CENTER),
	    new JLabel("Eclipse",JLabel.CENTER)
	};
	
	ActionGroupe musiqueObserveur = new ActionGroupe(listeMusique);
	GridLayout playlistGrid = new GridLayout(listeMusique.length, 1);
	fenetre.setLayout(playlistGrid);
	for (JLabel musique : listeMusique){
	    fenetre.add(musique);
	    musique.addMouseListener(musiqueObserveur);
	    
	}
	fenetre.setVisible(true);
    }
}

