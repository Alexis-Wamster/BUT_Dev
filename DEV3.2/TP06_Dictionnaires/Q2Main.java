import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Q2Main{
    public static void main(String args[]){
        String nomFichier = "rgb.txt";
        HashMap<String,Color> dicoCouleur = new HashMap<>();
        DefaultListModel<String> listeCouleur = new DefaultListModel<>();
        try{
            BufferedReader lecture = new BufferedReader(new FileReader(nomFichier));
            String ligne;

            try {
                while ((ligne = lecture.readLine()) != null) {
                    int rouge = Integer.parseInt(ligne.substring(0,3).trim());
                    int vert = Integer.parseInt(ligne.substring(4,7).trim());
                    int bleu = Integer.parseInt(ligne.substring(8,11).trim());
                    Color couleur = new Color(rouge, vert, bleu);
                    String nom = ligne.substring(13).trim();
                    dicoCouleur.put(nom, couleur);
                    listeCouleur.addElement(nom);
                }
            } catch (IOException e) {
                System.err.println("Erreur de lecture dans rgb.txt !");
            }

            try {
                lecture.close();
            } catch(IOException e) {
                System.err.println("Erreur de fermeture de rgb.txt !");
            }

            JList<String> menuDeroulant = new JList<>(listeCouleur);
            JScrollPane ascensseur = new JScrollPane(menuDeroulant);
            JFrame fenetre = new JFrame();
            fenetre.setSize(700, 300);
            fenetre.setLocation(0, 0);
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel contenu = new JPanel(new BorderLayout());
            contenu.setBackground(Color.RED);
            contenu.add(ascensseur, BorderLayout.WEST);
            fenetre.add(contenu, BorderLayout.CENTER);
            fenetre.setVisible(true);

        } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture de rgb.txt !");
        }
    }
}