import java.awt.*;
import java.util.*;

public class Parallelogramme{
    public static int hauteur=100;
    public static int largeur=50;
    public static int marge=5;
    public static int inclinaison=40;
    public static Random aleatoire = new Random();

    public Polygon forme;
    public Color couleur;

    public Parallelogramme(){
        this(0,Parallelogramme.marge);
    }
    public Parallelogramme(Parallelogramme ancien){
        this(ancien.forme.xpoints[1],ancien.forme.ypoints[2]);
    }
    public Parallelogramme(int gauche, int haut){
        this.forme = new Polygon();
        this.couleur = new Color(Parallelogramme.aleatoire.nextInt(255), Parallelogramme.aleatoire.nextInt(255), Parallelogramme.aleatoire.nextInt(255));
        this.forme.addPoint(gauche+Parallelogramme.marge, haut+Parallelogramme.hauteur);
        this.forme.addPoint(gauche+Parallelogramme.marge+Parallelogramme.largeur, haut+Parallelogramme.hauteur);
        this.forme.addPoint(gauche+Parallelogramme.marge+Parallelogramme.largeur+Parallelogramme.inclinaison, haut);
        this.forme.addPoint(gauche+Parallelogramme.marge+Parallelogramme.inclinaison, haut);
    }

    public void translationGauche(){
        int[] xPoints = this.forme.xpoints;
        int nbPoint = this.forme.npoints;
        for (int i = 0; i < nbPoint; i++) {
            xPoints[i] -= (Parallelogramme.largeur + Parallelogramme.marge);
        }
    }
    public int luminance(){
        return 21*this.couleur.getRed() + 72*this.couleur.getGreen() + 7*this.couleur.getBlue();
    }
}