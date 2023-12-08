public class Q2Modele{
    private String[] tabString;
    private int[] tabInt;
    private int paire;
    private int max;

    public Q2Modele(String[] tableau){
        this.tabString = tableau;
        this.tabInt = new int[this.tabString.length];
        this.stringToInt(0);
        this.paire = 0;
        this.max = 0;
    }
    private void stringToInt(int i) {
        if (i>=0 && i < this.tabString.length){
            this.tabInt[i] = Integer.parseInt(this.tabString[i]);
            stringToInt(i+1);
        }
    }
    public void printInt(int i) {
        if (i>=0 && i < this.tabInt.length-1){
            System.out.print(this.tabInt[i] + " ");
            printInt(i+1);
        }
        if (i == this.tabInt.length-1){
            System.out.println(this.tabInt[i]);
        }
    }

    public void printInv(int i) {
        if (i>=0 && i < this.tabInt.length-1){
            System.out.print(this.tabInt[this.tabInt.length-i-1] + " ");
            printInt(i+1);
        }
        if (i == this.tabInt.length-1){
            System.out.println(this.tabInt[0]);
        }
    }

    private void paire(int i) {
        if (i==0){
            this.paire = 0;
        }
        if (i>=0 && i < this.tabInt.length){
            if (this.tabInt[i]%2 == 0){
                this.paire ++;
            }
            paire(i+1);
        }
    }

    private void max(int i) {
        if (i==0){
            this.max = 0;
        }
        if (i>=0 && i < this.tabInt.length){
            if (this.tabInt[i] > this.max){
                this.max = this.tabInt[i];
            }
            max(i+1);
        }
    }

    public int getPaire(){
        paire(0);
        return this.paire;
    }

    public int getMax(){
        max(0);
        return this.max;
    }
}