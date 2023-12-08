import org.mariadb.jdbc.*;
import java.sql.*;

public class Q1Main{
    public static void main(String[] args) {
		if (args.length < 1){
		    System.out.println("Arguments invalide");
		    System.exit(0);
		}
		String pays = args[0];
		try{
		    int idPays = -1;
		    Connection cnx = DriverManager.getConnection(
		    "jdbc:mariadb://dwarves.iut-fbleau.fr/wamster",
		    "wamster","32201909");
		    try {
				Class.forName("org.mariadb.jdbc.Driver");
		    }
		    catch(ClassNotFoundException e){
				System.out.println("ClassNotFoundException");
				cnx.close();
				System.exit(0);
		    }
		    
				
			 // recuperation de l'id du pays entree en ligne de commande
			 try {
			 	PreparedStatement pst = cnx.prepareStatement(
		    	"SELECT idPays FROM DEV31TP01Q1_ListePays WHERE nomPays=?");
		    	pst.setString(1, pays);
		   	 ResultSet rs = pst.executeQuery();
		    	pst.close();
		    	if (rs.next()){
		    		idPays = rs.getInt("idPays");
		    	}
		    	rs.close();
		    	if (idPays == -1){
					System.out.println("Pays inconnus");
					System.exit(0);
		    	}
			 }
			 catch(SQLException e){
		    	System.out.println("probleme de select 1");
		    	cnx.close();
		    	System.exit(0);
			}
		    
		    // recuperation des score du pays
		    try {
		    	PreparedStatement pst = cnx.prepareStatement(
		    	"SELECT * FROM DEV31TP01Q1_score WHERE idCompetiteurs=?");
		    	pst.setInt(1, idPays);
		    	ResultSet rsid = pst.executeQuery();
		    	pst.close();
		    	int scoreTotal = 0;

		    	//recuperation du nom du votant à partir de son id
		    	try{
		    		pst = cnx.prepareStatement(
		    		"SELECT nomPays FROM DEV31TP01Q1_ListePays WHERE idPays=?");
		    		while (rsid.next()){
		    			int idVotant = rsid.getInt("idVotants");
						int score = rsid.getInt("score");
						String nomVotant = null;
						pst.setInt(1, idVotant);
						ResultSet rsnom = pst.executeQuery();
						if (rsnom.next()){
							nomVotant = rsnom.getString("NomPays");
						}
						rsnom.close();

						// affichage du score qu'a donne le votant (aligner proprement)
						System.out.print(nomVotant);
						int espaceAAjouter = 20 - (nomVotant.length() + Integer.toString(score).length());
						for (int i=0; i<espaceAAjouter; i++){
							System.out.print(" ");
						}
						System.out.println(score);
						scoreTotal += score;
		    		}
		    		pst.close();
		    		rsid.close();

		    		//affichage du score total
		    		for (int i=0; i<17; i++){
						System.out.print(" ");
					}
					System.out.println("___");
					int espaceAAjouter = 20 - ("Total".length() + Integer.toString(scoreTotal).length());
					System.out.print("Total");
					for (int i=0; i<espaceAAjouter; i++){
						System.out.print(" ");
					}
					System.out.println(scoreTotal);

		    	}
		    		catch(SQLException e){
		    		System.out.println("probleme de select ?");
		    		cnx.close();
		    		System.exit(0);
				}

		    }
		    catch(SQLException e){
		    	System.out.println("probleme de select 2");
		    	cnx.close();
		    	System.exit(0);
			}
		    cnx.close();
		    
		}
		catch(SQLException e){
		    System.out.println("SQLException");
		}
    }
}
