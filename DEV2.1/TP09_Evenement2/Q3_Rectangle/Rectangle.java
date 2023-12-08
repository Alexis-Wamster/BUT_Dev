import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rectangle extends JComponent implements MouseMotionListener,MouseListener{
    int xOrigine;
    int yOrigine;
    int yFinal;
    int xFinal;
    int longueurFenetre;
    int hauteurFenetre;
    
    public Rectangle(){
	this.xOrigine = -1;
	this.yOrigine = -1;
	this.xFinal = -1;
	this.yFinal = -1;
	this.longueurFenetre = this.getWidth();
	this.hauteurFenetre = this.getHeight();
    }
	
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	secondPinceau.setColor(new Color(0,0,0));
	secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	secondPinceau.setColor(new Color(0,255,100));	
	
        if (this.xOrigine >= 0 && this.yOrigine >= 0){
	    int newXOrigine;
	    int newYOrigine;
	    int newLongueur;
	    int newHauteur;
	    if (xFinal >= xOrigine){
		newXOrigine = this.getWidth()*this.xOrigine/this.longueurFenetre;
		newLongueur = this.getWidth()*(this.xFinal-this.xOrigine)/this.longueurFenetre;
	    }
	    else{
		newXOrigine = this.getWidth()*this.xFinal/this.longueurFenetre;
		newLongueur = this.getWidth()*(this.xOrigine-this.xFinal)/this.longueurFenetre;
	    }
	    if (yFinal >= yOrigine){
		newYOrigine = this.getHeight()*this.yOrigine/this.hauteurFenetre;
		newHauteur = this.getHeight()*(this.yFinal-this.yOrigine)/this.hauteurFenetre;
	    }
	    else{
		newYOrigine = this.getHeight()*this.yFinal/this.hauteurFenetre;
		newHauteur = this.getHeight()*(this.yOrigine-this.yFinal)/this.hauteurFenetre;
	    }
	    secondPinceau.fillRect(newXOrigine,newYOrigine,newLongueur,newHauteur);
	}
    }

    @Override
    public void mouseDragged(MouseEvent e){
	this.xFinal = e.getX();
	this.yFinal = e.getY();
	repaint();
    }
    @Override
    public void mousePressed(MouseEvent e){
	this.longueurFenetre = this.getWidth();
	this.hauteurFenetre = this.getHeight();
        this.xOrigine = e.getX();
	this.yOrigine = e.getY();
    }
    @Override
    public void mouseMoved(MouseEvent e){
    }
    @Override
    public void mouseClicked(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
}
