import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FondEvent implements ActionListener{
    public JPanel panneau;
    public JTextField champsSaisis;
    
    public FondEvent(JPanel contenu){
	this.champsSaisis = new JTextField();
	this.champsSaisis.setPreferredSize(new Dimension(200,20));
	this.panneau = contenu;
	this.panneau.add(this.champsSaisis);
    }

    @Override
    public void actionPerformed(ActionEvent evenement){
	String couleur = evenement.getActionCommand();
        if (couleur.equals("Cyan")){
	    panneau.setBackground(Color.CYAN);
	}
	if (couleur.equals("Magenta")){
	    panneau.setBackground(Color.MAGENTA);
	}
	if (couleur.equals("Jaune")){
	    panneau.setBackground(Color.YELLOW);
	}
        this.champsSaisis.setText("");
    }
}
