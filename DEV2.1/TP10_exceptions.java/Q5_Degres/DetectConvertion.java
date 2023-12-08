import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DetectConvertion implements ActionListener{
    private JTextField champsFarenheit;
    private JTextField champsCelsius;
    
    public DetectConvertion(JTextField champsFarenheit, JTextField champsCelsius){
	this.champsFarenheit = champsFarenheit;
	this.champsCelsius = champsCelsius;
    }

    @Override
    public void actionPerformed(ActionEvent evenement){
	JTextField source = (JTextField) evenement.getSource();
	String valeurString = evenement.getActionCommand();
	if (source == this.champsCelsius){
	    try{
		double valeurDouble = Double.parseDouble(valeurString);
		double resultat = valeurDouble*1.8+32;
		this.champsFarenheit.setText(Double.toString(resultat));
	    }
	    catch(NumberFormatException erreur){
		this.champsFarenheit.setText("???");
	    }
	}
	if (source == this.champsFarenheit){
	    try{
		double valeurDouble = Double.parseDouble(valeurString);
		double resultat = (valeurDouble-32)/1.8;
		this.champsCelsius.setText(Double.toString(resultat));
	    }
	    catch(NumberFormatException erreur){
		this.champsCelsius.setText("???");
	    }
	}
    }
}
