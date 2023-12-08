public class Q5Point{
    public int x;
    public int y;

    public Q5Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Q5Point() {
        this.x = 0;
        this.y = 0;
    }

    public static Q5Point tiers(Q5Point a, Q5Point b){
        Q5Point resultat = new Q5Point();
        resultat.x = (int) a.x + (b.x - a.x)/3;
        resultat.y = (int) a.y + (b.y - a.y)/3;
        return resultat;
    }
    public static Q5Point millieu(Q5Point a, Q5Point b){
        Q5Point resultat = new Q5Point();
        resultat.x = (int) a.x + (b.x - a.x)/2;
        resultat.y = (int) a.y + (b.y - a.y)/2;
        return resultat;
    }
    public static Q5Point pointe(Q5Point a, Q5Point b, Q5Point p){
        Q5Point i = Q5Point.millieu(a,b);
        Q5Point resultat = new Q5Point();
        resultat.x = (int) i.x - (p.x - i.x)/3;
        resultat.y = (int) i.y - (p.y - i.y)/3;
        return resultat;
    }
}