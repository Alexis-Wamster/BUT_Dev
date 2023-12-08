public class Compteur {

  private int compte;

  public Compteur() {
    this.compte = 0;
  }
  
  public int getValue(){
    return this.compte;
  }

  public Compteur(int value) {
    this.compte = value;
  }

  public void plusUn() {
    this.compte++;
  }
    
  public String toString() {
    return Integer.toBinaryString(this.compte);
  }
}
