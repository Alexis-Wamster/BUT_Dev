import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionFenetre implements WindowListener{
    private JFrame fenetre;
    
    ActionFenetre(JFrame fenetre){
	this.fenetre = fenetre;
    }
    
    @Override
    public void windowActivated(WindowEvent evenement){
    }
    @Override
    public void windowClosed(WindowEvent evenement){
    }
    @Override
    public void windowClosing(WindowEvent evenement){
    }
    @Override
    public void windowDeactivated(WindowEvent evenement){
    }
    @Override
    public void windowDeiconified(WindowEvent evenement){
    }
    @Override
    public void windowIconified(WindowEvent evenement){
	this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void windowOpened(WindowEvent evenement){
	System.out.println("Edouard");
    }
}
