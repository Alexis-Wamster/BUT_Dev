import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Q1Main{
    public static void main(String[] args) {
	
		ArrayDeque<Integer> liste = new ArrayDeque<>();
		int i;
		try{
			for (i=0; i<args.length; i++){
				if (args[i].equals("x") || args[i].equals("/") || args[i].equals("+") || args[i].equals("-")){
					int a;
					int b;
					a = liste.pop();
					b = liste.pop();
					if(args[i].equals("x")){
						liste.push(b*a);
					}
					if(args[i].equals("/")){
						liste.push(b/a);
					}
					if(args[i].equals("+")){
						liste.push(b+a);
					}
					if(args[i].equals("-")){
						liste.push(b-a);
					}
				}
				else{
					liste.push(Integer.parseInt(args[i]));
				}
			}
			System.out.println(liste.pop());
		}
		catch(NoSuchElementException e){
			System.out.println("tu ecrit bien");
		}
		catch(NumberFormatException e){
			System.out.println("arretes de mal executer le code");
		}
	}
}
