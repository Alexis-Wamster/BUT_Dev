import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1ClosingEvent implements WindowListener{
	public JFrame fenetre;
    
    public Q1ClosingEvent(JFrame fenetre){
    	this.fenetre = fenetre;
    }

    @Override
    public void windowActivated(WindowEvent e){}
	@Override
	public void windowClosed(WindowEvent e){
	}
	@Override
	public void windowClosing(WindowEvent e){
		this.fenetre.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		int fermeture = JOptionPane.showConfirmDialog(this.fenetre, "Voulez vous vraiment fermer ?");
		if (fermeture == JOptionPane.YES_OPTION){
			this.fenetre.dispose();
		}
		
	}
	@Override
	public void windowDeactivated(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowOpened(WindowEvent e){}
}