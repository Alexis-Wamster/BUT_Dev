//Wamster Alexis

import java.awt.GraphicsEnvironment;
public class Q1Main{
    public static void main(String[] args){
	GraphicsEnvironment serveur = new Serveur();
	System.out.println("isHeadless dit :         "     + GraphicsEnvironment.isHeadless());
	System.out.println("isHeadlessInstance dit : "     + serveur.isHeadlessInstance());
    }
}
