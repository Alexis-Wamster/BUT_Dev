import javax.swing.JComponent;
import java.awt.*;
 
public class Cercle extends JComponent {
    public Color couleurCercle;

    public Cercle(int r, int g, int b){
	this.couleurCercle = new Color(r,g,b);
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	Color couleurFond = this.getBackground();
	if (this.isOpaque()) {
	    secondPinceau.setColor(couleurFond);
	    secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	
	secondPinceau.setColor(this.couleurCercle);
	secondPinceau.fillOval(0,0, this.getWidth(), this.getHeight());
	secondPinceau.setColor(couleurFond);
	secondPinceau.fillOval(this.getWidth()/4 , this.getHeight()/4 , this.getWidth()/2 , this.getHeight()/2);
    }
}
