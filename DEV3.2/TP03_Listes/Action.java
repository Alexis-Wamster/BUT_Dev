import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Action implements MouseListener{
    public ListeParallelogramme listeParallelogramme;
    public Point origine;
    public JFrame fenetre;

    public Action(ListeParallelogramme listeParallelogramme, JPanel panel, JFrame fenetre){
		this.listeParallelogramme = listeParallelogramme;
        this.origine = panel.getLocationOnScreen();
        this.fenetre = fenetre;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        Point clic = e.getPoint();
        int x = clic.x - this.origine.x;
        int y = clic.y - this.origine.y;
        Parallelogramme parallelogramme = this.listeParallelogramme.get(-1);
		while ((parallelogramme = this.listeParallelogramme.next(parallelogramme)) != null){
            int[] xPoints = parallelogramme.forme.xpoints;
            System.out.print("x=[");
            for (int px : xPoints){
                System.out.print(px+",");
            }
            System.out.print("] ");
            int[] yPoints = parallelogramme.forme.ypoints;
            System.out.print("y=[");
            for (int yx : yPoints){
                System.out.print(yx+",");
            }
            System.out.print("] ");
            System.out.println(" clic=" + x + "," + y);
			if (parallelogramme.forme.contains(x, y)){
                System.out.println(parallelogramme.luminance());
				this.listeParallelogramme.delete(parallelogramme);
                fenetre.repaint();
                break;
			}
		}
        System.out.println();
    }

    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
    @Override
    public void mousePressed(MouseEvent e){
    }
    @Override
    public void mouseReleased(MouseEvent e){
    }
}
