import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionGroupe implements MouseListener,KeyListener{
    public JLabel[] listeMusique;
    public boolean[] selection;
    public boolean isCtrlPressed;

    public ActionGroupe(JLabel[] listeMusique){
		this.listeMusique = listeMusique;
		this.selection = new boolean[this.listeMusique.length];
		this.isCtrlPressed = false;
		
		this.selectionFalse();
		for (JLabel musique : this.listeMusique){
	    	musique.setOpaque(true);
		}
    }
    
    private void selectionFalse(){
    	for (int i=0; i<this.selection.length; i++){
    		this.selection[i] = false;
			this.listeMusique[i].setBackground(new Color(255,255,255));
		}
    }
    
    private boolean isSelected(JLabel musique){
    	for (int i=0; i<listeMusique.length; i++){
    		if (this.listeMusique[i] == musique){
    			if (selection[i] == true){
    				return true;
    			}
    			return false;
    		}
    	}
    	return false;
    }
    
    private int indiceMusique(JLabel musique){
    	for (int i=0; i<listeMusique.length; i++){
    		if (this.listeMusique[i] == musique){
    				return i;
    		}
    	}
    	return -1;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
		JLabel musiqueSelection = (JLabel) e.getComponent();
		int indiceMusiqueSelection = this.indiceMusique(musiqueSelection);
		if (this.isCtrlPressed==false){
			this.selectionFalse();
			System.out.println(this.selection);
		}
		this.selection[indiceMusiqueSelection] = true;
		musiqueSelection.setBackground(new Color(100,255,0));
    }
    @Override
    public void mouseEntered(MouseEvent e){
		JLabel musiqueSelection = (JLabel) e.getComponent();
		if (this.isSelected(musiqueSelection)==false){
	    	musiqueSelection.setBackground(new Color(100,100,100));
		}
    }
    @Override
    public void mouseExited(MouseEvent e){
		JLabel musiqueSelection = (JLabel) e.getComponent();
		if (this.isSelected(musiqueSelection)==false){
	    	musiqueSelection.setBackground(new Color(255,255,255));
		}
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int touche = e.getKeyCode();
        if (touche == 17){
        	this.isCtrlPressed = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    	int touche = e.getKeyCode();
    	 if (touche == 17){
        	this.isCtrlPressed = false;
       }
    }
}
