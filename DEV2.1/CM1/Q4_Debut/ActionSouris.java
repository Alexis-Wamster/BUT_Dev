//Wamster Alexis

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionSouris implements MouseListener{
    private JFrame fenetre;
    private int rayon;

    public ActionSouris(JFrame fenetre, int rayon){
    	this.fenetre = fenetre;
    	this.rayon = rayon;
    }
    
    public int RecupereRayon(){
    	return this.rayon;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
    	this.rayon += 15;
    	fenetre.repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
}
