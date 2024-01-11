package RemoveSpace;

import java.util.Scanner;

public class RemoveSpace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String newString = " This is Java Programe ";
		     System.out.println("Your String is: " + newString );

	     String removeSpace = "";
	
	     for (int i=0;i<newString.length();i++) {
	    	 if(newString.charAt(i)!=' ') {
	    		 removeSpace = removeSpace+ newString.charAt(i);
	    		 
	    	 }
	     }
	      
	     System.out.println(removeSpace);


}
	
}

// hello world
