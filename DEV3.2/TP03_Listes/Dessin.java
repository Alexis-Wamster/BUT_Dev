import javax.swing.JComponent;
import java.awt.*;
import java.util.*;
 
public class Dessin extends JComponent {

	public ListeParallelogramme listeParallelogramme;

    public Dessin(ListeParallelogramme listeParallelogramme){
		this.listeParallelogramme = listeParallelogramme;
    }
    
    @Override
    protected void paintComponent(Graphics pinceau) {
		Graphics secondPinceau = pinceau.create();
		if (this.isOpaque()) {
			secondPinceau.setColor(this.getBackground());
			secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
		Parallelogramme parallelogramme = this.listeParallelogramme.get(-1);
		while ((parallelogramme = this.listeParallelogramme.next(parallelogramme)) != null){
			secondPinceau.setColor(parallelogramme.couleur);
			secondPinceau.fillPolygon(parallelogramme.forme);
			secondPinceau.setColor(Color.BLACK);
			secondPinceau.drawPolygon(parallelogramme.forme);
		}
    }
}
