import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RecupereSauvegarde{
    JFrame fenetre;
    JPanel contenu;
    JButton boutonCyan;
    JButton boutonMagenta;
    JButton boutonJaune;
    FondEvent evenementBouton;
    FenetreEvent evenementFenetre;
    String cheminSauvegarde;
    public RecupereSauvegarde(String cheminSauvegarde){
	this.cheminSauvegarde = cheminSauvegarde;
	try{
	    FileInputStream fichier = new FileInputStream(cheminSauvegarde);
	    ObjectInputStream source = new ObjectInputStream(fichier);
	    try{
	        this.fenetre = (JFrame) source.readObject();
		this.contenu= (JPanel) source.readObject();
		this.boutonCyan = (JButton) source.readObject();
		this.boutonMagenta = (JButton) source.readObject();
		this.boutonJaune = (JButton) source.readObject();
		this.evenementBouton = (FondEvent) source.readObject();
		this.evenementFenetre = (FenetreEvent) source.readObject();
	    }
	    catch(ClassNotFoundException e){
	        System.err.println("impossible de trouver la classe sauvegarder");
		this.parDefault();
	    }
	    catch (IOException e){
	        System.err.println("echec dans la lecture du fichier");
		this.parDefault();
	    }
	    try{
	        source.close();
	    }
	    catch (IOException e){
	        System.err.println("echec dans la fermeture du fichier");
	    }
	}
        catch (IOException e){
            System.err.println("echec dans l'ouverture du fichier");
	    this.parDefault();
        }
    }

    public void parDefault(){
	this.fenetre = new JFrame();
	this.fenetre.setSize(500, 300);
	this.fenetre.setLocation(0, 0);
        this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.boutonCyan = new JButton("Cyan");
	this.boutonMagenta = new JButton("Magenta");
	this.boutonJaune = new JButton("Jaune");
	
	this.contenu = new JPanel();
	this.contenu.add(boutonCyan);
	this.contenu.add(boutonMagenta);
	this.contenu.add(boutonJaune);
	
	this.evenementBouton = new FondEvent(contenu);
	this.boutonCyan.addActionListener(evenementBouton);
	this.boutonMagenta.addActionListener(evenementBouton);
	this.boutonJaune.addActionListener(evenementBouton);

	this.fenetre.add(contenu);

	this.evenementFenetre = new FenetreEvent(this);
	this.fenetre.addWindowListener(evenementFenetre);
    }

    public void sauvegardeFenetre(){
	try{
	    FileOutputStream fichier = new FileOutputStream(this.cheminSauvegarde);
	    ObjectOutputStream source = new ObjectOutputStream(fichier);
	    try{
		source.writeObject(this.fenetre);
		source.writeObject(this.contenu);
		source.writeObject(this.boutonCyan);
		source.writeObject(this.boutonMagenta);
		source.writeObject(this.boutonJaune);
	        source.writeObject(this.evenementBouton);
		source.writeObject(this.evenementFenetre);
	    }
	    catch (IOException e){
	        System.err.println("echec dans l'ecriture du fichier");
	    }
	    try{
	        source.close();
	    }
	    catch (IOException e){
                System.err.println("echec dans la fermeture du fichier");
	    }
	}
	catch (IOException e){
	    System.err.println("echec dans l'ouverture du fichier");
	}
    }
}
