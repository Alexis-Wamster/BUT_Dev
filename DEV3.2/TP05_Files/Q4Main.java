import java.util.*;

public class Q4Main{

    public static void main(String[] args){

		Serpent jeux = new Serpent();

        Timer boucle = new Timer(true);
		Repetition iteration = new Repetition(jeux, boucle);
        boucle.scheduleAtFixedRate(iteration, 1000, 100);
        try {
            while(true){
                Thread.sleep(1000000);
            }
        }
		catch (InterruptedException e) {
            e.printStackTrace();
        }
        boucle.cancel();
    }
}
