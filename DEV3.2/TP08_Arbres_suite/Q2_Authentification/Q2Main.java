import java.util.*;

public class Q2Main{

    public static void main(String[] args){
        HashMap<String,Integer> dicoId = new HashMap<>();
        Q2Arbre arbre = new Q2Arbre();
        Scanner scanneur = new  Scanner(System.in);
        boolean programmeEnCours = true;
        int numUser = 0;
        while(programmeEnCours){
            String[] mots = scanneur.nextLine().split(" ");
            if (mots[0].equals("add") && mots.length == 3){
                dicoId.put(mots[1], numUser);
                arbre.add(numUser, mots[1], mots[2]);
                numUser ++;
                System.out.println("Utilisateur \""+mots[0]+"\" ajoute");
            }
            else if (mots[0].equals("auth") && mots.length == 3){
                try{
                    int clefArbre = dicoId.get(mots[1]);
                    if (arbre.get(clefArbre).getMotDePasse().equals(mots[2])){
                        System.out.println("Utilisateur \""+mots[1]+"\" reconnu");
                    }
                    else{
                       throw(new NullPointerException("Utilisateur \""+mots[1]+"\" non reconnu"));
                    }
                }
                catch(NullPointerException e){
                    System.out.println("Utilisateur \""+mots[1]+"\" non reconnu");
                }
            }
            else if (mots[0].equals("del") && mots.length == 2){
                try{
                    int clefArbre = dicoId.get(mots[1]);
                    if (arbre.remove(clefArbre)){
                        System.out.println("Utilisateur \""+mots[0]+"\" retire");
                    }
                    else{
                        throw(new NullPointerException("Utilisateur \""+mots[1]+"\" non retire"));
                    }
                }
                catch(NullPointerException e){
                    System.out.println("Utilisateur \""+mots[1]+"\" non retire");
                }
            }
            else if (mots[0].equals("quit") && mots.length == 1){
                programmeEnCours = false;
            }
            else{
                System.out.println("operation incorrect ! Voici les operations possibles :\n- add <user> <p@ssW0rd> \n- auth <user> <p@ssW0rd>\n- del <user>\n- quit");
            }
        }
        scanneur.close();
        arbre.affichage();
    }
}