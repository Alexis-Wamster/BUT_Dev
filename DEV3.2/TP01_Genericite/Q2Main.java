import java.util.*;
import java.text.*;

public class Q2Main{
    public static void main(String[] args)  {
		System.out.println(Arrays.toString(args));
		
		// b
		String[] args5 = Arrays.copyOf(args, 5);
		System.out.println(Arrays.toString(Arrays.copyOf(args, 5)));
		
		//c
		Collator collator = Collator.getInstance(Locale.FRENCH);
		collator.setStrength(Collator.PRIMARY);
		Arrays.sort(args, collator);
		System.out.println(Arrays.toString(args));
		
    }
}
