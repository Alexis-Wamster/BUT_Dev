import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Serpent{

    public static final int LONGUEUR=25;
    public static final int HAUTEUR=25;
	public static final Color SERPENT=Color.ORANGE;
	public static final Color FOND=Color.GREEN;
	public static final Color POMME=Color.RED;

    public JFrame fenetre;
    public Queue<Point> serpent;
    public Point tete;
    public ArrayList<Point> listePomme;
    public Dessin[][] listeCase;
    public Queue<Point> direction;
    public Point derniereDirection;
    public boolean isFreeze;
    public Random random;

    public Serpent(){
        this.fenetre = new JFrame("serpent");
		this.fenetre.setSize(800, 800);
		this.fenetre.setLocation(0, 0);
		this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grille = new GridLayout(Serpent.HAUTEUR,Serpent.LONGUEUR);
		this.fenetre.setLayout(grille);

        this.listeCase = new Dessin[Serpent.LONGUEUR][Serpent.HAUTEUR];
        int x,y;
        for (y=0; y<Serpent.HAUTEUR; y++){
            for (x=0; x<Serpent.LONGUEUR; x++){
                this.listeCase[x][y] = new Dessin(Serpent.FOND);
				this.fenetre.add(this.listeCase[x][y]);
            }
        }

        this.random = new Random();
        this.initialisation();
        Action evenement = new Action(this);
        this.fenetre.addKeyListener(evenement);
        this.fenetre.setVisible(true);
    }

	public void initialisation(){
        int x,y;
        for (y=0; y<Serpent.HAUTEUR; y++){
            for (x=0; x<Serpent.LONGUEUR; x++){
                this.listeCase[x][y].setColor(Serpent.FOND);
            }
        }
        this.direction = new LinkedList<>();
        this.derniereDirection = Action.DROITE;
        this.listePomme = new ArrayList<>();
        this.serpent = new LinkedList<>();
        this.tete = new Point(2,12);
		this.serpent.offer(this.tete);
		this.listeCase[this.tete.x][this.tete.y].setColor(Serpent.SERPENT);
        this.tete = new Point(3,12);
		this.serpent.offer(this.tete);
		this.listeCase[this.tete.x][this.tete.y].setColor(Serpent.SERPENT);
        this.tete = new Point(4,12);
		this.serpent.offer(this.tete);
		this.listeCase[this.tete.x][this.tete.y].setColor(Serpent.SERPENT);

        this.listePomme.add(new Point(15,12));
        this.listeCase[15][12].setColor(Serpent.POMME);
        newPomme();
        newPomme();
        this.fenetre.repaint();
        this.isFreeze = true;
	}

    public void newPomme(){
        Point emplacement;
        do{
            emplacement = new Point(this.random.nextInt(Serpent.LONGUEUR), this.random.nextInt(Serpent.HAUTEUR));
        } while (this.serpent.contains(emplacement) || this.listePomme.contains(emplacement));

        this.listePomme.add(emplacement);
		this.listeCase[emplacement.x][emplacement.y].setColor(Serpent.POMME);
    }
}