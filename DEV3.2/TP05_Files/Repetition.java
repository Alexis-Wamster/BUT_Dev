import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Repetition extends TimerTask{

    public Serpent jeux;
    public java.util.Timer boucle;

    public Repetition(Serpent jeux, java.util.Timer boucle){
        this.jeux = jeux;
        this.boucle = boucle;
    }

    @Override
    public void run(){
        try{
            if (this.jeux.isFreeze == false){
                Point direction;
                if (this.jeux.direction.isEmpty()){
                    direction = this.jeux.derniereDirection;
                }
                else{
                    direction = this.jeux.direction.poll();
                }
                this.jeux.tete = new Point(this.jeux.tete.x + direction.x, this.jeux.tete.y + direction.y);
                if (this.jeux.serpent.contains(this.jeux.tete)){
                    this.perdu();
                }
                this.jeux.serpent.offer(this.jeux.tete);
                this.jeux.listeCase[this.jeux.tete.x][this.jeux.tete.y].setColor(Serpent.SERPENT);

                int indicePomme = this.jeux.listePomme.indexOf(this.jeux.tete);
                if (indicePomme == -1){
                    Point queue = this.jeux.serpent.poll();
                    this.jeux.listeCase[queue.x][queue.y].setColor(Serpent.FOND);
                }
                else{
                    this.jeux.listePomme.remove(indicePomme);
                    this.jeux.newPomme();
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            this.perdu();
        }
    }

    private void perdu(){
        System.out.println("perdu");
        this.jeux.isFreeze = false;
        int fermeture = JOptionPane.showConfirmDialog(null,
                "Score : " + (this.jeux.serpent.size()-3) + "\nVoulez vous rejouer ?");
		if (fermeture == JOptionPane.YES_OPTION){
            this.jeux.initialisation();
        }
        else{
            this.boucle.cancel();
        }
    }
}