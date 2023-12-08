import javax.swing.JComponent;
import java.awt.*;
 
public class Dessin extends JComponent {

    public Dessin(){
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	if (this.isOpaque()) {
	    secondPinceau.setColor(this.getBackground());
	    secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
    
	secondPinceau.setColor(Color.BLUE);
	secondPinceau.drawRect(20,20, 50, 50);

	secondPinceau.setColor(Color.GREEN);
	secondPinceau.fillOval(80, 20, 50, 50);

	secondPinceau.setColor(Color.MAGENTA);
	Font myFont = new  Font("Arial", Font.BOLD, 14);
	secondPinceau.setFont(myFont);
	secondPinceau.drawString(">o<",140, 20);

	Image cercles = Toolkit.getDefaultToolkit().getImage("cercles.png");
	secondPinceau.drawImage(cercles,200,20,this);
    }
}
