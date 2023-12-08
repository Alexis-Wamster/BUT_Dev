//Wamster Alexis

import javax.swing.JComponent;
import java.awt.*;
 
public class Soleil extends JComponent {
    private ActionSouris detectClic;
    
    public Soleil(ActionSouris detectClic){
	this.detectClic = detectClic;
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	secondPinceau.setColor(new Color(115,194,251));
	secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	
	int rayon = detectClic.RecupereRayon();
	secondPinceau.setColor(Color.YELLOW);
	secondPinceau.fillOval(this.getWidth()/2-rayon,this.getHeight()-rayon, rayon*2, rayon*2);
    }
}
