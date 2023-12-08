import org.mariadb.jdbc.*;
import java.sql.*;

public class Q2BestPays{
    public static String[] bestPays() {
    	try{
		    int idPays = -1;
		    String nomPays = null;
		    String bestPays = null;
		    int score = 0;
		    int bestScore = 0;

		    Connection cnx = DriverManager.getConnection(
		    "jdbc:mariadb://dwarves.iut-fbleau.fr/wamster",
		    "wamster","32201909");
		    try {
				Class.forName("org.mariadb.jdbc.Driver");
		    }
		    catch(ClassNotFoundException e){
				cnx.close();
				return null;
		    }

		    try {
			 	PreparedStatement pstCompetiteur = cnx.prepareStatement(
		    	"SELECT * FROM DEV31TP01Q1_ListePays");
		   	 	ResultSet rsCompetiteur = pstCompetiteur.executeQuery();
		    	while (rsCompetiteur.next()){
		    		idPays = rsCompetiteur.getInt("idPays");
		    		nomPays = rsCompetiteur.getString("NomPays");
		    		score = 0;
		    		PreparedStatement pstScore = cnx.prepareStatement(
		    		"SELECT score FROM DEV31TP01Q1_score WHERE idCompetiteurs=?");
		    		pstScore.setInt(1, idPays);
		    		ResultSet rsScore = pstScore.executeQuery();
		    		pstScore.close();
		    		while (rsScore.next()){
		    			score += rsScore.getInt("score");
		    		}
		    		rsScore.close();
		    		if (score > bestScore){
		    			bestScore = score;
		    			bestPays = nomPays;
		    		}
		    	}
		    	rsCompetiteur.close();
		    	pstCompetiteur.close();
		    	if (idPays == -1){
		    		cnx.close();
					return null;
		    	}
		    	cnx.close();
		    	return new String[] {bestPays, Integer.toString(bestScore)};
			}
			catch(SQLException e){
		    	cnx.close();
		    	return null;
			}
		}
		catch(SQLException e){
		    return null;
		}
    }
}