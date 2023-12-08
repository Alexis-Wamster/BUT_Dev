import javax.swing.*;
import java.awt.*;
 
public class Sablier extends JComponent {
    public static int nbColone = 5;
    public static int nbLigne = 5;
    
    public Sablier() {
	super();
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
	int longueur = this.getWidth();
	int hauteur = this.getHeight();
        if (this.isOpaque()) {
            secondPinceau.setColor(this.getBackground());
            secondPinceau.fillRect(0, 0, longueur, hauteur);
        }
	int[] triangleXHaut = {0, longueur, longueur/2};
	int[] triangleYHaut = {0, 0, hauteur/2};
	int[] triangleXBas = {0, longueur, longueur/2};
	int[] triangleYBas = {hauteur, hauteur, hauteur/2};
	
	secondPinceau.setColor(new Color(255,100,0));
	secondPinceau.fillPolygon(triangleXHaut, triangleYHaut, 3);
	secondPinceau.fillPolygon(triangleXBas, triangleYBas, 3);
    }
}
