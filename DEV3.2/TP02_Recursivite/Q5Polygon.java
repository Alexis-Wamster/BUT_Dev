import javax.swing.JComponent;
import java.awt.*;
 
public class Q5Polygon extends JComponent {
    public Polygon etoile;

    public Q5Polygon(Polygon etoile){
        this.etoile = etoile;
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
        pinceau.setColor(Color.BLUE);
        pinceau.drawPolygon(this.etoile);
    }
}