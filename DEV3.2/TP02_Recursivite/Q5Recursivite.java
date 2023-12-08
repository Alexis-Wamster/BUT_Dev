import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Polygon;

public class Q5Recursivite{
    public Polygon etoile;
    public JFrame fenetre;

    public Q5Recursivite(Polygon etoile, JFrame fenetre) {
        this.etoile = etoile;
        this.fenetre = fenetre;
    }
    public void nextStep(int i, Q5Point c, Q5Point g, Q5Point a){
        if (i<=0){
            this.etoile.addPoint(c.x,c.y);
            this.fenetre.repaint();
        }
        else{
            Q5Point b = Q5Point.tiers(c,a);
            Q5Point d = Q5Point.tiers(c,g);
            Q5Point e = Q5Point.pointe(c,g,a);
            Q5Point f = Q5Point.tiers(g,c);
            Q5Point h = Q5Point.tiers(g,a);
            this.nextStep(i-1, c, d, b);
            this.nextStep(i-1, d, e, f);
            this.nextStep(i-1, e, f, d);
            this.nextStep(i-1, f, g, h);
        }

    }
}