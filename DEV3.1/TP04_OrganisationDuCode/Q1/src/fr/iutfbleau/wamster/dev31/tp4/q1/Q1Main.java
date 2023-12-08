package fr.iutfbleau.wamster.dev31.tp4.q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1Main{
    public static void main(String[] args) {

        JFrame fenetre = new JFrame("Q1 Galerie");
        fenetre.setSize(300, 200);
        fenetre.setLocation(700, 300);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Q1Evenement evenementBouton = new Q1Evenement(fenetre);
        fenetre.addMouseListener(evenementBouton);

        fenetre.setVisible(true);
    }
}