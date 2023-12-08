import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FondEvent implements ActionListener{
    public JPanel panneau;
    
    public FondEvent(JPanel contenu){
	this.panneau = contenu;
    }

    @Override
    public void actionPerformed(ActionEvent evenement){
	String couleur = evenement.getActionCommand();
        if (couleur=="Cyan"){
	    panneau.setBackground(Color.CYAN);
	}
	if (couleur=="Magenta"){
	    panneau.setBackground(Color.MAGENTA);
	}
	if (couleur=="Jaune"){
	    panneau.setBackground(Color.YELLOW);
	}
    }
}
