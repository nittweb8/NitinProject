package New_Task1;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


	public static void main(String[] args) {

		
   Scanner sc = new Scanner(System.in);
   String x = "SILENT";
   String y = "LISTEN";
   
   char a[]=x.toCharArray();
   char b[]= y.toCharArray();
   Arrays.sort(a);
   Arrays.sort(b);;
   boolean result = Arrays.equals(a, b);
   
   if(result==true) {
		System.out.println("String Are Anagram");

   }
   else {
		System.out.println("String Are Not Anagram");
        }

   }
   
	}


