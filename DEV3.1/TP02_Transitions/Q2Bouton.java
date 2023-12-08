import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Bouton implements ActionListener{
	JDialog popup;
	JFrame fenetre;
    
    public Q2Bouton(JDialog popup, JFrame fenetre){
		this.popup = popup;
		this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent e){
		popup.dispose();
		if (fenetre != null){
			fenetre.dispose();
		}
	}
}