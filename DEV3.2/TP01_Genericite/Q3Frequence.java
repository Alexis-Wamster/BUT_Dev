public class Q3Frequence{
    public static <T> Q4Association getSouvent(T[] tableau)  {
		int occurenceMax = 0;
		T elementMax=null;
		for (T element1 : tableau){
			int occurence = 0;
			for (T element2 : tableau){
				if (element1.equals(element2)){
					occurence ++;
				}
			}
			if (occurenceMax < occurence){
				occurenceMax = occurence;
				elementMax = element1;
			}
		}
		return new Q4Association(elementMax, occurenceMax);
    }
}

