import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Q2Main{
    public static void main(String[] args) {
	
		ArrayDeque<Noeud<String>> liste = new ArrayDeque<>();
		try{
			for (int i=0; i<args.length; i++){
				if (args[i].equals("x") || args[i].equals("/") || args[i].equals("+") || args[i].equals("-")){
					Noeud<String> a = liste.pop();
					Noeud<String> b = liste.pop();
                    Noeud<String> c = new Noeud<String>(args[i]);
                    c.add(b);
                    c.add(a);
                    liste.push(c);
				}
				else{
					liste.push(new Noeud<String>(args[i]));
				}
			}
			Arbre<String> arbre = new Arbre<>(liste.pop());
            arbre.afficheArbreQ2();
            arbre.afficheArbreQ3();
		}
		catch(NoSuchElementException e){
			System.out.println("tu ecrit bien");
		}
		catch(NumberFormatException e){
			System.out.println("arretes de mal executer le code");
		}
	}
}