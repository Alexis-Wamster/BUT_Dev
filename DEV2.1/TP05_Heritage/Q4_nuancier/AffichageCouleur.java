import javax.swing.*;
import java.awt.*;
public class AffichageCouleur{
    public JPanel ensemble;
    public int r;
    public int v;
    public int b;
    AffichageCouleur(String codeHexa){
	Color couleur = Color.decode(codeHexa);
	this.r = couleur.getRed();
	this.v = couleur.getGreen();
	this.b = couleur.getBlue();
	String texteRGB = r+","+v+","+b;
	JLabel texte = new JLabel(texteRGB,JLabel.CENTER);
	texte.setOpaque(true);
	texte.setBackground(new Color(0,0,0));
	texte.setForeground(new Color(255,255,255));
	texte.setPreferredSize(new Dimension(100,20));

	FlowLayout grille = new FlowLayout(FlowLayout.CENTER,0,0);
	this.ensemble = new JPanel();
	this.ensemble.setLayout(grille);
	this.ensemble.setPreferredSize(new Dimension(100,100));
	this.ensemble.add(texte);
	this.ensemble.setBackground(new Color(this.r,this.v,this.b));
	
    }
}
