import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testMain{
    public static void main(String[] args) {

        // création d'une JFrame pour recevoir des événements de clavier
        JFrame frame = new JFrame("Test KeyListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        // ajout du listener de clavier au JFrame
        Touche test = new Touche();
        frame.addKeyListener(test);
    }
}