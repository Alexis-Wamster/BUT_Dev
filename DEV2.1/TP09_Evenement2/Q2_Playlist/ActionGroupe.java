import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionGroupe implements MouseListener{
    public JLabel[] listeMusique;
    public int selection;

    public ActionGroupe(JLabel[] listeMusique){
	this.listeMusique = listeMusique;
	this.selection = -1;
	for (JLabel musique : this.listeMusique){
	    musique.setOpaque(true);
	    musique.setBackground(new Color(255,255,255));
	}
    }
    @Override
    public void mouseClicked(MouseEvent e){
	JLabel musiqueSelection = (JLabel) e.getComponent();
	for (int i=0 ; i<this.listeMusique.length; i++){
	    if (musiqueSelection == this.listeMusique[i]){
		musiqueSelection.setBackground(new Color(100,255,0));
		this.selection = i;
	    }
	    else{
		this.listeMusique[i].setBackground(new Color(255,255,255));
	    }
	}
    }
    @Override
    public void mouseEntered(MouseEvent e){
	JLabel musiqueSelection = (JLabel) e.getComponent();
	if (this.selection==-1 || this.listeMusique[this.selection] != musiqueSelection){
	    musiqueSelection.setBackground(new Color(100,100,100));
	}
    }
    @Override
    public void mouseExited(MouseEvent e){
	JLabel musiqueSelection = (JLabel) e.getComponent();
	if (this.selection==-1 || this.listeMusique[this.selection] != musiqueSelection){
	    musiqueSelection.setBackground(new Color(255,255,255));
	}
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
}
