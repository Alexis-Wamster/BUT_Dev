import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Touche implements KeyListener{
    public Touche(){
    }
    @Override
    public void keyTyped(KeyEvent e) {
    	System.out.println("L");
        int touche = e.getKeyCode();
        System.out.println("La touche " + touche + " a été ...");
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	System.out.println("L");
        int touche = e.getKeyCode();
        System.out.println("La touche " + touche + " a été enfoncée.");
    }
    @Override
    public void keyReleased(KeyEvent e) {
    	System.out.println("L");
        int touche = e.getKeyCode();
        System.out.println("La touche " + touche + " a été relaché.");
    }
}
