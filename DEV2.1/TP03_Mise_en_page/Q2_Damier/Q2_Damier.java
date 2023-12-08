import javax.swing.*;
import java.awt.*;

public class Q2_Damier{
  public static void main(String[] args) {
      if (args.length < 2){
	  System.out.println("Usage: java Q2_Damier <columns> <rows>");
      }
      else{
	  int columns = Integer.parseInt(args[0]);
	  int rows = Integer.parseInt(args[1]);
	  Q2_Fenetre fenetre = new Q2_Fenetre(columns, rows);
	  fenetre.creerFenetre();
      }
  }
}
