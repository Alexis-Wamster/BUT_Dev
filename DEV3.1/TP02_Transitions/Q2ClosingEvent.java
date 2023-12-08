import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2ClosingEvent implements WindowListener{
	public JFrame fenetre;
    
    public Q2ClosingEvent(JFrame fenetre){
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
		JDialog newPopup = Q2PopUp.createPopup(this.fenetre);
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