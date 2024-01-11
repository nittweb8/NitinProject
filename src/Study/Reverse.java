package Study;

public class Reverse {

	public static void main(String[] args) {
		       
	        String name= "Deepak", Ulta="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Deepak"); 
	       
	      for (int i=0; i<name.length(); i++)
	      {
	        ch= name.charAt(i);
	        Ulta= ch+Ulta; 
	      }
	      System.out.println("Reversed word: "+ Ulta);

	}

}
