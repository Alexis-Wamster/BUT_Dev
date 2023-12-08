import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2Main{
    public static void main(String[] args) {
	RecupereSauvegarde sauvegarde = new RecupereSauvegarde("fenetre.txt");
	
	sauvegarde.fenetre.setVisible(true);
    }
}
