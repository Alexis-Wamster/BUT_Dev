import javax.swing.JComponent;
import java.awt.*;
import javax.swing.*;
 
public class Accueil extends JComponent {
    private Image acc;
    public Accueil() {
	super();
	this.acc = Toolkit.getDefaultToolkit().getImage("login.jpg");
    }
    @Override
    protected void paintComponent(Graphics pinceau) {
	Graphics secondPinceau = pinceau.create();
	if (this.isOpaque()) {
	    secondPinceau.setColor(this.getBackground());
	    secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
	secondPinceau.drawImage(this.acc,0,0,this);
    }
    public static void main(String[] args) {
	JFrame fenetre = new JFrame();
	Accueil imag = new Accueil();
	JTextField champlog = new JTextField();
	JTextField champmdp = new JTextField();
	fenetre.setLayout(null);
	fenetre.setSize(290,220);
	fenetre.setLocation(0,0);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	imag.setLocation(0,0);
	imag.setSize(278,183);
	champlog.setSize(160,20);
	champlog.setLocation(102,92);
	champmdp.setSize(160,20);
	champmdp.setLocation(102,134);
	fenetre.add(imag);
	fenetre.add(champlog);
	fenetre.add(champmdp);
	fenetre.setVisible(true);
    }
}
