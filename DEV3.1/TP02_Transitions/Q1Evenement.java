import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1Evenement implements MouseListener{
    public String chemin;
	public JLabel image;
	public JFrame fenetre;
    
    public Q1Evenement(JFrame fenetre, String chemin){
		this.chemin = chemin;
		this.image = new JLabel(new ImageIcon(this.chemin));
		this.fenetre = fenetre;
		this.fenetre.add(this.image, BorderLayout.CENTER);
    }

    @Override
    public void mouseClicked(MouseEvent e){
		int largeurImage = fenetre.getWidth();
        int clicX = e.getX();
		this.fenetre.remove(this.image);
		if (clicX < largeurImage/2){
			this.chemin = Q1Model.previous(this.chemin);
		}
		else{
			this.chemin = Q1Model.next(this.chemin);
		}
		this.image = new JLabel(new ImageIcon(this.chemin));
		this.fenetre.add(this.image, BorderLayout.CENTER);
		this.fenetre.revalidate();
    }
	@Override
	public void mouseEntered(MouseEvent evenement){}
	@Override
	public void mouseExited(MouseEvent evenement){}
	@Override
	public void mousePressed(MouseEvent evenement){}
	@Override
	public void mouseReleased(MouseEvent evenement){}
}