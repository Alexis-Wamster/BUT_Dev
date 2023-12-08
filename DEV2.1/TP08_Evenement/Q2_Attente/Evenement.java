import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Evenement extends JComponent implements WindowListener{
    public int etat;
    
    public Evenement(){
	this.etat = 1;
    }
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
	int longueur = this.getWidth();
	int hauteur = this.getHeight();
        secondPinceau.setColor(Color.GREEN);
        secondPinceau.fillRect(0, 0, longueur, hauteur);
	secondPinceau.setColor(Color.MAGENTA);
	if (this.etat==1){
	    secondPinceau.fillOval(0,0,longueur,hauteur);
	}
	if (this.etat==2){
	    int[] triangleXHaut = {0, longueur, longueur/2};
	    int[] triangleYHaut = {0, 0, hauteur/2};
	    int[] triangleXBas = {0, longueur, longueur/2};
	    int[] triangleYBas = {hauteur, hauteur, hauteur/2};
	    secondPinceau.fillPolygon(triangleXHaut, triangleYHaut, 3);
	    secondPinceau.fillPolygon(triangleXBas, triangleYBas, 3);
	}
    }
    
    public void windowActivated(WindowEvent evenement){
	this.etat=1;
	repaint();
    }
    public void windowClosed(WindowEvent evenement){}
    public void windowClosing(WindowEvent evenement){}
    public void windowDeactivated(WindowEvent evenement){
	this.etat=2;
	repaint();
    }
    public void windowDeiconified(WindowEvent evenement){}
    public void windowIconified(WindowEvent evenement){}
    public void windowOpened(WindowEvent evenement){}
}
