import javax.swing.JComponent;
import java.awt.*;
 
public class Graphe extends JComponent {
    public ProducteurDePoints graphe;

    public Graphe(ProducteurDePoints graphe){
        this.graphe = graphe;
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	if (this.isOpaque()) {
	    secondPinceau.setColor(this.getBackground());
	    secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	secondPinceau.setColor(Color.BLACK);
	Point point1 = this.graphe.suivant();
	Point point2 = this.graphe.suivant();
	while (point2 != null){
	    secondPinceau.drawLine(point1.x, point1.y, point2.x, point2.y);
	    point1 = point2;
	    point2 = this.graphe.suivant();
	}
    }
}
