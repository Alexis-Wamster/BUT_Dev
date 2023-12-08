public class Q2_Date {
  public static void main(String[] args) {
      Date today = new Date(2023, 2, 23);
      Date mariage = new Date(2023, 3, 1);
      for (int i=0; i<10 ; i++){
	  System.out.print(today);
	  if (today.compare(mariage)){
	  	System.out.print(" = Jour de mariage !!!");
	  }
	  System.out.println("");
	  today.lendemain();
      }
  }
}
