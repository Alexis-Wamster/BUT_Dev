public class Q2Model{
	public final static int NBIMAGE = 10000;
	public final static int PAS = 100;
	public final static int NBCHIFFREIMAGE = 7;
	public final static String CHEMIN = "Images/";
	
    public static String getChemin(int numImage) {
		    numImage = numImage*Q2Model.PAS;
		    return Q2Model.CHEMIN +Q2Model.add0(numImage) + ".png";
    }

    public static String add0(int number){
	int zeroAAjouter = Q2Model.NBCHIFFREIMAGE - Integer.toString(number).length();
	String resultat = "";
	for (int i=0; i < zeroAAjouter; i++){
	    resultat += "0";
	}
	resultat += Integer.toString(number);
	return resultat;
    }
}
