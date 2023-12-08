import java.awt.Point;
import java.util.*;
 
public class LigneAleatoire implements ProducteurDePoints {
  private int numero;
    
  public LigneAleatoire() {
    this.numero = 0;
  }
    
  public Point suivant() {
    Point p = null;
    if (this.numero < 10) {
	p = new Point(((int) (Math.random()*200)+50),
		      ((int) (Math.random()*200)+50));
      this.numero++;
    } else {
      this.numero = 0;
    }
    System.out.println(p);
    return p;
  }
}
