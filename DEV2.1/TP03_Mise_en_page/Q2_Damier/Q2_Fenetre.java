import javax.swing.*;
import java.awt.*;

class Q2_Fenetre{
    private int columns;
    private int rows;
    private static Color color1 = new Color(0,0,0);
    private static Color color2 = new Color(255,255,255);
    
    public Q2_Fenetre(int columns, int rows){
	this.columns = columns;
	this.rows = rows;
    }
    public void creerFenetre(){
	GridLayout grille = new GridLayout(this.rows, this.columns);

	JFrame fenetre = new JFrame();
	fenetre.setSize(500, 300);
	fenetre.setLocation(0, 0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.setLayout(grille);
	
        for(int y = 0; y < this.rows; y++){
	    for(int x = 0; x < this.columns; x++){
		JButton square = new JButton();
		if ((x%2==0 && y%2==0) || (x%2==1 && y%2==1)){
		square.setBackground(Q2_Fenetre.color1);
		}
		else{
		   square.setBackground(Q2_Fenetre.color2);
		}
		fenetre.add(square);
	    }
	}
	fenetre.setVisible(true);
    }
}
