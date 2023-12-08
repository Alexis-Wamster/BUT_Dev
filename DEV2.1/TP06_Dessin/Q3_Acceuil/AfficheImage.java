import javax.swing.*;
import java.awt.*;
 
public class AfficheImage extends JComponent {
    private Image fond;
    
    public AfficheImage(String cheminImage) {
	super();
	this.fond = Toolkit.getDefaultToolkit().getImage(cheminImage);
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
        if (this.isOpaque()) {
            secondPinceau.setColor(this.getBackground());
            secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
        secondPinceau.drawImage(this.fond, 0, 0, this);
    }
}
