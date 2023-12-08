
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test extends TimerTask {

    @Override
    public void run() {
        System.out.println("hello");
    }
    
    public static void main(String args[]){
        Test timerTask = new Test();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
        try {
            while(true){
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
    }

}