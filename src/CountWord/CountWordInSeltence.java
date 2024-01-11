package CountWord;
import java.util.Scanner;


public class CountWordInSeltence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      System.out.println("Enter Your String");
	      Scanner sc = new Scanner (System.in);
	      String S = sc.nextLine();
	      int count = 1;
	      for(int i = 0 ; i<S.length()-1; i++) {
	      if(S.charAt(i) == ' '&& S.charAt(i+1)!=' ') {
	    	  count++;
	      }
	      
	      } 
	      
	      System.out.println(count);


	}

}
