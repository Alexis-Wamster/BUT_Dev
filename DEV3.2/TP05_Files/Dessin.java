import javax.swing.*;
import java.awt.*;
 
public class Dessin extends JComponent {
    public Color couleur;

    public Dessin(Color couleur){
		this.couleur = couleur;
    }

	public void setColor(Color couleur){
		this.couleur = couleur;
		this.repaint();
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	Color couleurFond = this.getBackground();
	if (this.isOpaque()) {
	    secondPinceau.setColor(couleurFond);
	    secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	secondPinceau.setColor(this.couleur);
	secondPinceau.fillRect(2,2, this.getWidth()-2, this.getHeight()-2);
    }
}
