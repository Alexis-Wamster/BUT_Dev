import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Polygon;
import java.lang.Math;

public class Q5Main{
    public static void main(String[] args) {
		int l = 1000;
		int m = 40;
		int detail = Integer.parseInt(args[0]);
		JFrame fenetre = new JFrame("Q1 Galerie");
		fenetre.setSize(l+2*m, l+2*m);
		fenetre.setLocation(0, 0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Polygon etoile = new Polygon();
		Q5Polygon dessinEtoile = new Q5Polygon(etoile);
		Q5Recursivite modele = new Q5Recursivite(etoile, fenetre);
		fenetre.add(dessinEtoile);
		fenetre.setVisible(true);
		
		Q5Point g = new Q5Point(m+l/2, m);
		Q5Point c = new Q5Point(m+l-((int)(l*Math.sqrt(3))/2), m+(3*l)/4);
		Q5Point a = new Q5Point(2*m+((int)(l*Math.sqrt(3))/2), m+(3*l)/4);
		modele.nextStep(detail, a,c,g);
		modele.nextStep(detail, c,g,a);
		modele.nextStep(detail, g,a,c);
	}
}