public class Q1_Progression {
  public static void main(String[] args) {
    Compteur c = new Compteur(5);
    do {
	System.out.println(c.toString());
	c.plusUn();
    } while (c.getValue() <=9);
  }
}
