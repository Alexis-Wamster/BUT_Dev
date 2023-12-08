public class Q1Model{
	public final static int NBIMAGE = 10000;
	public final static int PAS = 100;
	public final static int NBCHIFFREIMAGE = 7;
	public final static String CHEMIN = "Images/";
	
    public static String next(String nomImage) {
		int numImage;
		try {
		    numImage = Integer.parseInt(nomImage.substring(Q1Model.CHEMIN.length(), Q1Model.CHEMIN.length() + Q1Model.NBCHIFFREIMAGE));
		    numImage = (numImage+Q1Model.PAS)%Q1Model.NBIMAGE;
		    return Q1Model.CHEMIN + Q1Model.add0(numImage) + ".png";
		}
		catch (NumberFormatException e) {
		    return null;
		}
    }
    public static String previous(String nomImage) {
		int numImage;
		try {
		    numImage = Integer.parseInt(nomImage.substring(Q1Model.CHEMIN.length(), Q1Model.CHEMIN.length() + Q1Model.NBCHIFFREIMAGE));
		    numImage = (numImage+Q1Model.NBIMAGE-Q1Model.PAS)%Q1Model.NBIMAGE;
		    return Q1Model.CHEMIN +Q1Model.add0(numImage) + ".png";
		}
		catch (NumberFormatException e) {
		    return null;
		}
    }

    public static String add0(int number){
	int zeroAAjouter = Q1Model.NBCHIFFREIMAGE - Integer.toString(number).length();
	String resultat = "";
	for (int i=0; i < zeroAAjouter; i++){
	    resultat += "0";
	}
	resultat += Integer.toString(number);
	return resultat;
    }
}
