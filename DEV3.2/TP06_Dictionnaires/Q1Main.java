import java.util.*;

public class Q1Main{
    public static void main(String args[]){
        Map<Thread, StackTraceElement[]> listeThreadNul = Thread.getAllStackTraces();
        Set<Map.Entry<Thread, StackTraceElement[]>> listeThread = listeThreadNul.entrySet();
        for (Map.Entry<Thread, StackTraceElement[]> thread : listeThread) {
            Thread clef = thread.getKey();
            StackTraceElement[] valeur = thread.getValue();

            System.out.println(clef.getName() + ":");

            for (StackTraceElement item : valeur){
                System.out.println("    " + item);
            }
            System.out.println();
        }
    }
}