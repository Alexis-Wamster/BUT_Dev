import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FondEvent implements ActionListener{
    public JPanel panneau;
    public JCheckBox boutonCyan;
    public JCheckBox boutonMagenta;
    public JCheckBox boutonJaune;
    public static Color[] listeCouleur= {
	Color.WHITE,
	Color.YELLOW,
	Color.MAGENTA,
	Color.RED,
	Color.CYAN,
	Color.GREEN,
	Color.BLUE,
	Color.BLACK
    };
    
    public FondEvent(JPanel contenu){
	this.panneau = contenu;
	this.boutonCyan = new JCheckBox("Cyan");
	this.boutonMagenta = new JCheckBox("Magenta");
	this.boutonJaune = new JCheckBox("Jaune");
	this.panneau.add(this.boutonCyan);
	this.panneau.add(this.boutonMagenta);
	this.panneau.add(this.boutonJaune);
    }

    @Override
    public void actionPerformed(ActionEvent evenement){
        int numCouleur = 0;
        if (this.boutonCyan.isSelected()){
	    numCouleur += 4;
	}
	if (this.boutonMagenta.isSelected()){
	    numCouleur += 2;
	}
	if (this.boutonJaune.isSelected()){
	    numCouleur += 1;
	}
	panneau.setBackground(FondEvent.listeCouleur[numCouleur]);
    }
}
