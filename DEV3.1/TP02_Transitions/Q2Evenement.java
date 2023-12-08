import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Evenement implements MouseListener{
	public JFrame fenetre;
	public JPanel listeImage;
	public CardLayout listeOnglets;
	public Container conteneur;
	public int numImage;
    
    public Q2Evenement(JFrame fenetre){
    	this.numImage = 1;
		this.fenetre = fenetre;
		this.conteneur = this.fenetre.getContentPane();
		this.listeOnglets = new CardLayout();
		this.listeImage = new JPanel(this.listeOnglets);
		for (int i=0; i<(Q2Model.NBIMAGE/Q2Model.PAS); i++){
			String chemin = Q2Model.getChemin(i);
			this.listeImage.add(new JLabel(new ImageIcon(chemin)));
		}
		this.fenetre.add(this.listeImage, BorderLayout.CENTER);
    }

    @Override
    public void mouseClicked(MouseEvent e){
		int largeurImage = fenetre.getWidth();
        int clicX = e.getX();
		if (clicX < largeurImage/2){
			if (this.numImage > 1){
				this.listeOnglets.previous(this.listeImage);
				this.numImage --;
			}
		}
		else{
			if (this.numImage < (Q2Model.NBIMAGE/Q2Model.PAS)){
				this.listeOnglets.next(this.listeImage);
				this.numImage ++;
			}
		}
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