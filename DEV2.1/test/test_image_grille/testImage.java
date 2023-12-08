import javax.swing.JComponent;
import java.awt.*;

public class testImage extends JComponent {
    Image image;
    public testImage(String cheminImage){
    		this.image = Toolkit.getDefaultToolkit().getImage(cheminImage);
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
		Graphics secondPinceau = pinceau.create();
	       	secondPinceau.drawImage(this.image,0, 0, this.getWidth(), this.getHeight(), this);
	}
}
