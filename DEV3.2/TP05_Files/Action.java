import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Action implements KeyListener {

    public static final Point HAUT=new Point(0,-1);
    public static final Point BAS=new Point(0,1);
    public static final Point GAUCHE=new Point(-1,0);
    public static final Point DROITE=new Point(1,0);
    public Serpent jeux;

    public Action(Serpent jeux){
        this.jeux = jeux;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (this.jeux.isFreeze == false){
            if (keyCode == KeyEvent.VK_UP){
                if (this.jeux.derniereDirection != Action.BAS){
                    this.jeux.derniereDirection = Action.HAUT;
                    this.jeux.direction.offer(Action.HAUT);
                }
            }
            if (keyCode == KeyEvent.VK_DOWN){
                if (this.jeux.derniereDirection != Action.HAUT){
                    this.jeux.derniereDirection = Action.BAS;
                    this.jeux.direction.offer(Action.BAS);
                }
            }
            if (keyCode == KeyEvent.VK_LEFT){
                if (this.jeux.derniereDirection != Action.DROITE){
                    this.jeux.derniereDirection = Action.GAUCHE;
                    this.jeux.direction.offer(Action.GAUCHE);
                }
            }
            if (keyCode == KeyEvent.VK_RIGHT){
                if (this.jeux.derniereDirection != Action.GAUCHE){
                    this.jeux.derniereDirection = Action.DROITE;
                    this.jeux.direction.offer(Action.DROITE);
                }
            }
        }
        if (keyCode == KeyEvent.VK_SPACE){
            this.jeux.isFreeze = !this.jeux.isFreeze;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}