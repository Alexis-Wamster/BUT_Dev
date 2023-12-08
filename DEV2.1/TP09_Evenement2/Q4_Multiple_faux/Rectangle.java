import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
public class Rectangle extends JComponent implements MouseMotionListener, MouseListener, KeyListener{
    private List<Integer> xOrigine;
    private List<Integer> yOrigine;
    private List<Integer> yFinal;
    private List<Integer> xFinal;
    private List<Integer> longueurFenetre;
    private List<Integer> hauteurFenetre;
    boolean isCtrlPressed;
    
    public Rectangle(){
		this.xOrigine = new ArrayList<Integer>();
		this.yOrigine = new ArrayList<Integer>();
		this.xFinal = new ArrayList<Integer>();
		this.yFinal = new ArrayList<Integer>();
		this.longueurFenetre = new ArrayList<Integer>();
		this.hauteurFenetre = new ArrayList<Integer>();
		this.isCtrlPressed = false;
    }
	
    @Override
    protected void paintComponent(Graphics pinceau) {
		Graphics secondPinceau = pinceau.create();
		if (this.isOpaque()){
			secondPinceau.setColor(new Color(0,0,0));
			secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
		secondPinceau.setColor(new Color(0,255,100));
	
		for (int i=0; i<this.xOrigine.size(); i++){	
       	if (this.xOrigine(i) >= 0 && this.yOrigine(i) >= 0){
	    		int newXOrigine;
	    		int newYOrigine;
	    		int newLongueur;
	    		int newHauteur;
	    		if (this.xFinal(i) >= this.xOrigine(i)){
					newXOrigine = this.getWidth()*this.xOrigine(i)/this.longueurFenetre(i);
					newLongueur = this.getWidth()*(this.xFinal(i)-this.xOrigine(i))/this.longueurFenetre(i);
	    		}
	    		else{
					newXOrigine = this.getWidth()*this.xFinal(i)/this.longueurFenetre(i);
					newLongueur = this.getWidth()*(this.xOrigine(i)-this.xFinal(i))/this.longueurFenetre(i);
	      	}
	    		if (this.yFinal(i) >= this.yOrigine(i)){
					newYOrigine = this.getHeight()*this.yOrigine(i)/this.hauteurFenetre(i);
					newHauteur = this.getHeight()*(this.yFinal(i)-this.yOrigine(i))/this.hauteurFenetre(i);
	   		}
	   		else{
					newYOrigine = this.getHeight()*this.yFinal(i)/this.hauteurFenetre(i);
					newHauteur = this.getHeight()*(this.yOrigine(i)-this.yFinal(i))/this.hauteurFenetre(i);
	    		}
	    		secondPinceau.fillRect(newXOrigine,newYOrigine,newLongueur,newHauteur);
       	}
    	}
    }

    @Override
    public void mouseDragged(MouseEvent e){
		this.xFinal(xFinal.Count) = e.getX();
		this.yFinal(yFinal.Count) = e.getY();
		repaint();
    }
    @Override
    public void mousePressed(MouseEvent e){
    	if (this.isCtrlPressed == false){
    		this.longueurFenetre.clear();
    		this.hauteurFenetre.clear();
    		this.xOrigine.clear();
    		this.yOrigine.clear();
			this.xFinal.clear();
			this.yFinal.clear();
    	}
    	this.longueurFenetre.add(this.getWidth());
		this.hauteurFenetre.add(this.getHeight());
      this.xOrigine.add(e.getX());
		this.yOrigine.add(e.getY());
		this.xFinal.add(e.getX());
		this.yFinal.add(e.getY());
		repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e){
    }
    @Override
    public void mouseClicked(MouseEvent e){
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
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
