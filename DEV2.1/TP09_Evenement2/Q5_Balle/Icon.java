import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Icon extends JComponent implements MouseMotionListener,MouseListener{
    int xSouris;
    int ySouris;
    int xDistanceSourisIcon;
    int yDistanceSourisIcon;
    int xIcon;
    int yIcon;
    int xSizeIcon;
    int ySizeIcon;
    boolean isMoved;
    Image icon;
    Image fond;
    
    public Icon(String cheminFond, String cheminIcon){
	this.xSouris = -1;
	this.ySouris = -1;
	this.xIcon = 100;
	this.yIcon = 100;
	this.xDistanceSourisIcon = -1;
	this.yDistanceSourisIcon = -1;
	this.xSizeIcon = 29;
	this.ySizeIcon = 28;
	this.isMoved = false;
	this.icon = Toolkit.getDefaultToolkit().getImage(cheminIcon);
	this.fond = Toolkit.getDefaultToolkit().getImage(cheminFond);
    }
	
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	secondPinceau.drawImage(this.fond, 0, 0, this);
	secondPinceau.drawImage(this.icon, this.xIcon, this.yIcon, this);
    }

    @Override
    public void mouseDragged(MouseEvent e){
	if (this.isMoved == true){
	    this.xSouris = e.getX();
	    this.ySouris = e.getY();
	    this.xIcon = this.xSouris - this.xDistanceSourisIcon;
	    this.yIcon = this.ySouris - this.yDistanceSourisIcon;
	    repaint();
	}
    }
    @Override
    public void mousePressed(MouseEvent e){
        this.xSouris = e.getX();
	this.ySouris = e.getY();
	this.xDistanceSourisIcon = this.xSouris - this.xIcon;
	this.yDistanceSourisIcon = this.ySouris - this.yIcon;
	if (xDistanceSourisIcon >= 0 && xDistanceSourisIcon < this.xSizeIcon && yDistanceSourisIcon >= 0 && yDistanceSourisIcon < this.ySizeIcon){
	    this.isMoved = true;
	}
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
	this.isMoved = false;
    }
}
