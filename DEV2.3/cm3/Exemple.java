/**
 * Mise en oeuvre de la classe <code>Direction</code>, quit permet de manipuler une direction dans la rose des vents à 8 directions.
 *  
 *   (y)
 *
 *   -1   NO    N    NE
 *
 *    0    O         E     
 *
 *    1   SO    S    SE
 *
 *        -1    0    1   (x)
 *
 * @version 1.2
 * @author  Florent Madelaine.
 */

public class Exemple{
    
    public static void main(String[] args) {
        Direction d = Direction.NORD;
        System.out.println(d.toString());
        d = d.demiTour();
        System.out.println(d.toString());
        d = d.demiTour();
        System.out.println(d.toString());
        int i = 0;
        System.out.println(i);
        int j = i+8-1;
        System.out.println(j);
        int k = j % 8;
        System.out.println(k);
        int l = i-1;
        System.out.println(l);
        int m = l % 8;
        System.out.println(m);
    }
}
