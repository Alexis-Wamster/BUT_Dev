import java.util.*;
import java.io.*;

public class Q1Main{
    private static Arbre<Q1File> arbre;

    public static void main(String args[]){
        try{
            Q1File racine = new Q1File(args[0]);
            Q1Main.arbre = new Arbre<Q1File>(racine);
            Q1Main.recursive(racine, arbre.getRacine());
            Q1Main.arbre.afficheArbre();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void recursive(Q1File repertoire, Noeud<Q1File> noeud){
        if (repertoire != null){
            Q1File[] contenu = Q1File.convertion(repertoire.listFiles());
            if (contenu != null){
                for (Q1File item : contenu){
                    Noeud<Q1File> newFils = new Noeud<Q1File>(item);
                    noeud.add(newFils);
                    Q1Main.recursive(item, newFils);
                }
            }
        }
    }
}