import org.mariadb.jdbc.*;
import java.sql.*;

public class Q2GetBD{
    public static String[] getBD() {
    	try{

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
		    	Q2Array<String> resultat = new Q2Array();
			 	PreparedStatement pstChamp = cnx.prepareStatement(
		    	"SELECT * FROM DEV31TP02Q2_Champ");
		   	 	ResultSet rsChamp = pstChamp.executeQuery();
		    	while (rsChamp.next()){
		    		int idChamp = rsChamp.getInt("id");
		    		String nomChamp = rsChamp.getString("c0de");
		    		Q2Array<String[]> listeModule = new Q2Array();
					listeModule.add(nomChamp);
		    		PreparedStatement pstModule = cnx.prepareStatement(
		    		"SELECT score FROM DEV31TP02Q2_Module WHERE id=?");
		    		pstModule.setInt(1, idChamp);
		    		ResultSet rsModule = pstModule.executeQuery();
		    		pstModule.close();
		    		while (rsModule.next()){
		    			listeModule.add(rsModule.getInt("score"));
		    		}
		    		rsModule.close();
		    		resultat.add(listeModule.getListe());
		    	}
		    	rsChamp.close();
		    	pstChamp.close();
		    	cnx.close();
		    	return new resultat.getListe();
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