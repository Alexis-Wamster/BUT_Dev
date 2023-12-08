import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Evenement implements ActionListener{
    public JLabel pays;
    public JLabel score;
    
    public Q2Evenement(JLabel pays, JLabel score){
	this.pays = pays;
	this.score = score;
    }

    @Override
    public void actionPerformed(ActionEvent evenement){
    	String[] bestPays = Q2BestPays.bestPays();
    	if (bestPays != null){
    		this.pays.setText(bestPays[0]);
    		this.score.setText(bestPays[1]);
    	}
    }
}