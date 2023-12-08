package fr.iutfbleau.wamster.dev31.tp4.q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Q1Evenement implements MouseListener{
    public URL chemin;
    public JLabel image;
    public JFrame fenetre;
    public Q1Model listeImg;

    public Q1Evenement(JFrame fenetre){
        this.listeImg = new Q1Model();
        this.chemin = this.listeImg.current();
        this.image = new JLabel(new ImageIcon(this.chemin));
        this.fenetre = fenetre;
        this.fenetre.add(this.image, BorderLayout.CENTER);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        int largeurImage = fenetre.getWidth();
        int clicX = e.getX();
        this.fenetre.remove(this.image);
        if (clicX < largeurImage/2){
            this.chemin = this.listeImg.previous();
        }
        else{
            this.chemin = this.listeImg.next();
        }
        System.out.println(this.chemin);
        this.image = new JLabel(new ImageIcon(this.chemin));
        this.fenetre.add(this.image, BorderLayout.CENTER);
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