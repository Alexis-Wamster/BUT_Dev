import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rond extends JComponent implements MouseWheelListener{
    public int nbRond;
    public int valeur;
    public double tailleRond;
	
    public Rond(int nbRond){
	this.nbRond = nbRond;
	this.valeur = 0;
	this.tailleRond = 0.8;
    }
	
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	secondPinceau.setColor(new Color(0,0,0));
	secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	
	secondPinceau.setColor(new Color(0,255,100));	
	int unite = this.getWidth() / this.nbRond;
	int diametre = (int) ((double) unite * tailleRond);
	int ordonnee = (getHeight()-diametre)/2;
	for (int i=0; i<this.nbRond; i++){
	    if (this.valeur <= i){
		secondPinceau.setColor(new Color(100,0,255));
	    }
	    secondPinceau.fillOval(i*unite+(unite-diametre)/2, ordonnee,diametre,diametre);
	}
    }
    
    public void mouseWheelMoved(MouseWheelEvent e){
        if (e.getWheelRotation() < 0) {
	    if (this.valeur<this.nbRond){
		this.valeur++;
	    }
        } else {
            if (this.valeur>0){
		this.valeur--;
	    }
        }
    }
}
