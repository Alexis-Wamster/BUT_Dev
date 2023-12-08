import java.util.Objects;

/**
 * La classe <code>Direction</code>, initialement utilisée pour signifier une orientation possible
 * parmi les quatre points cardinaux, a été transformée pour permettre de fabriquer une rose des vents à 8 directions.
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
 * @author Luc Hernandez, Florent Madelaine.
 */
public class Direction {
    
    /**
     * Constante pointant vers le nord (c'est à dire vers le haut de l'écran).
     */
    public static final Direction NORD = new Direction(+0, -1);///BUGFIX remplacé (0, 1) par (0, -1)

    /**
     * Constante pointant vers le Nord Ouest (c'est à dire la diagonale entre le haut et la gauche de l'écran).
     */
    public static final Direction NO = new Direction(-1, -1);
    
    /**
     * Constante pointant vers l'ouest (c'est à dire vers la gauche de l'écran).
     */
    public static final Direction OUEST = new Direction(-1, +0);

    /**
     * Constante pointant vers le Sud Ouest (c'est à dire la diagonale entre le bas et la gauche de l'écran).
     */
    public static final Direction SO = new Direction(-1, +1);

    /**
     * Constante pointant vers le sud (c'est à dire vers le bas de l'écran).
     */
    public static final Direction SUD = new Direction(+0, +1);

    /**
     * Constante pointant vers le Sud Est (c'est à dire la diagonale vers le bas et la droite de l'écran).
     */
    public static final Direction SE = new Direction(+1, +1);
    
    /**
     * Constante pointant vers l'est (c'est à dire vers la droite de l'écran).
     */
    public static final Direction EST = new Direction(+1, +0);

    /**
     * Constante pointant vers le Nord Est (c'est à dire la diagonale vers le haut et la droite de l'écran).
     */
    public static final Direction NE = new Direction(+1, -1);
  
  
    /**
     * Composante horizontale de la direction (-1, 0 ou 1).
     */
    private int decalageX;
    
    /**
     * Composante verticale de la direction (-1, 0 ou 1).
     */
    private int decalageY;
  
    /**
     * Constructeur uniquement destiné à la création des constantes publiques.
     *
     * @param x l'abcisse (-1, 0 ou 1)
     * @param y l'ordonnée (-1, 0 ou 1)
     */
    private Direction(int x, int y) {
        this.decalageX = x; //BUGFIX y par x
        this.decalageY = y; //BUGFIX x par y
    }
  
    /**
     * Renvoie la composante horizontale de la direction.
     *
     * @return la composante horizontale de la direction (-1, 0 ou 1)
     */
    public int getDecalageX() {
        return this.decalageX;
    }
  
    /**
     * Renvoie la composante verticale de la direction.
     *
     * @return la composante verticale de la direction (-1, 0 ou 1)
     */
    public int getDecalageY() {
        return this.decalageY;
    }

    
    private static Direction[] DirectionsInTrigOrder = { Direction.NORD, Direction.NE, Direction.EST, Direction.SE, Direction.SUD, Direction.SO, Direction.OUEST, Direction.NO};

    /**
     * Renvoie la direction produite par un décalage de un huitième de tour dans le sens horaire.
     *
     * @return la nouvelle direction
     */
    public Direction huitDeTour() { 
        for (int i = 0; i < this.DirectionsInTrigOrder.length; i++) { //BUGFIX i < this.DirectionsInTrigOrder.length - 1 par i< i < this.DirectionsInTrigOrder.length
            if (this == this.DirectionsInTrigOrder[i])
                return this.DirectionsInTrigOrder[(i+1) % this.DirectionsInTrigOrder.length]; //BUGFIX i+1%this.DirectionsInTrigOrder.length par (i+1)%this.DirectionsInTrigOrder.length
        }
        return null;
    }

    /**
     * Renvoie la direction produite par un décalage d'un huitième de tour dans le sens anti-horaire.
     *
     * @return la nouvelle direction
     */
    public Direction huitDeTourAnti() {
        for (int i = 0; i < this.DirectionsInTrigOrder.length; i++) { //BUGFIX i+=2 par ++
            if (this == this.DirectionsInTrigOrder[i]){ //BUGFIX {} par {return ...}
                return this.DirectionsInTrigOrder[((i+8-1) % this.DirectionsInTrigOrder.length)];
             }
            
        }
        return null;
    }

    /**
     * Renvoie la direction produite par un quart de tour dans le sens horaire.
     *
     * @return la nouvelle direction
     */
    public Direction quartDeTour() {
        for (int i = 0; i < this.DirectionsInTrigOrder.length; i++) { //BUGFIX i=1 par i=0
            if (this == this.DirectionsInTrigOrder[i])
                return this.DirectionsInTrigOrder[(i+2) % this.DirectionsInTrigOrder.length];
                    
        }
        return null;
    }

    /**
     * Renvoie la direction produite par un quart de tour dans le sens anti-horaire.
     *
     * @return la nouvelle direction
     */
    public Direction quartDeTourAnti() {
        for (int i = 0; i < this.DirectionsInTrigOrder.length; i++) {
            if (this == this.DirectionsInTrigOrder[i])// de i-1 à i
                return this.DirectionsInTrigOrder[(i+6)%this.DirectionsInTrigOrder.length]; //BUGFIX remplacé i+8-2 par (i+6)%this.DirectionsInTrigOrder.length
            
        }
        return null;
    }


    /**
     * Renvoie la direction produite par un demi tour.
     *
     * @return la nouvelle direction
     */
    public Direction demiTour() {
        for (int i = 0; i < this.DirectionsInTrigOrder.length; i++) {
            if (this == this.DirectionsInTrigOrder[i]){
                Direction d = this.DirectionsInTrigOrder[(i+4)% this.DirectionsInTrigOrder.length];
                return d; //BUGFIX remplacé d.DirectionsInTrigOrder[(i+5)% this.DirectionsInTrigOrder.length] par d
            }
                    
        }
        return null;
    }


    
    
    // /**
    //  * Renvoie la direction produite par un quart de tour dans le sens horaire.
    //  *
    //  * @return la nouvelle direction
    //  */
    // public Direction quartDeTour() {
    //     if (this == Direction.NORD)
    //         return Direction.EST;
    //     else if (this == Direction.EST)
    //         return Direction.SUD;
    //     else if (this == Direction.SUD)
    //         return Direction.OUEST;
    //     else // if (this == Direction.OUEST)
    //         return Direction.NORD;
    // }
    
    // /**
    //  * Renvoie la direction produite par un quart de tour dans le sens anti-horaire.
    //  *
    //  * @return la nouvelle direction
    //  */
    // public Direction quartDeTourAnti() {
    //     if (this == Direction.NORD)
    //         return Direction.OUEST;
    //     else if (this == Direction.EST)
    //         return Direction.NORD;
    //     else if (this == Direction.SUD)
    //         return Direction.EST;
    //     else // if (this == Direction.OUEST)
    //         return Direction.SUD;
    // }


    public String toString(){
        return "(x: "+ this.decalageX + " ," + "y:"+ this.decalageY + ")";
    }

 
    /**
     * Méthode qui ne sert qu'à faire un exemple de méthode qui va renvoyer une exeption
     */
    public static void reset(){
        Objects.requireNonNull(null, "On ne devrait pas faire comme ça");
    }
    
}
