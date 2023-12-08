import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetreEvent implements WindowListener{
    RecupereSauvegarde sauvegarde;
    public FenetreEvent(RecupereSauvegarde sauvegarde){
    	this.sauvegarde = sauvegarde;
    }
    @Override // premier plan
    public void windowActivated(WindowEvent evenement){}
    
	@Override // apres fermeture
	 public void windowClosed(WindowEvent evenement){}
	 
	@Override // avant fermeture
	 public void windowClosing(WindowEvent evenement){
	    sauvegarde.sauvegardeFenetre();
	 }
	 
	@Override // arriere-plan
	 public void windowDeactivated(WindowEvent evenement){}
	 
	@Override // restauration
	 public void windowDeiconified(WindowEvent evenement){}
	 
	@Override // minimisation
	 public void windowIconified(WindowEvent evenement){}
	 
	@Override // apres ouverture
	 public void windowOpened(WindowEvent evenement){}
}
