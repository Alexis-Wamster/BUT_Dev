import javax.swing.JComponent;
import java.awt.*;

public class Redimensioneur extends JComponent {
	Image[] listeElement;
    public Redimensioneur(String[] listeImage){
    	this.listeElement = new Image[listeImage.length];
    	for (int i=0; i<listeImage.length; i++){
    		this.listeElement[i] = Toolkit.getDefaultToolkit().getImage(listeImage[i]);
    	}
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
		Graphics secondPinceau = pinceau.create();
		/*if (this.isOpaque()) {
	    	secondPinceau.setColor(this.getBackground());
	   	 	secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}*/
		secondPinceau.setColor(Color.RED);
		secondPinceau.fillRect(0,0,60,60);
		for (Image element: listeElement){
			secondPinceau.drawImage(element,0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
}
