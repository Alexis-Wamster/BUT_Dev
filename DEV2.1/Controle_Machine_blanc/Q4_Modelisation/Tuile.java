import javax.swing.*;
import java.awt.*;
 
public class Tuile extends JComponent {
  private Image texture;
  private int longueur;
  private int hauteur;
    
  public Tuile(String cheminImage) {
    super();
    this.texture = Toolkit.getDefaultToolkit().getImage(cheminImage);
    this.longueur = 512;
    this.hauteur = 512;
  }
  @Override
  protected void paintComponent(Graphics pinceau) {
    Graphics secondPinceau = pinceau.create();
    if (this.isOpaque()) {
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    for (int y=0; y<this.getHeight(); y+=this.hauteur){
	for (int x=0; x<this.getWidth(); x+=this.longueur){
	    secondPinceau.drawImage(this.texture, x, y, this);
	}
    }
  }
}
