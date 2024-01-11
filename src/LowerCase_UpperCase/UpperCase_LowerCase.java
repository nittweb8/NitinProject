package LowerCase_UpperCase;

import java.util.*;

public class UpperCase_LowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		str = sc.nextLine();
		String lowerstring = "" , upperstring = "";
		lowerstring = str.toLowerCase();
		upperstring = str.toUpperCase();
		System.out.println("Original Word: " + str);
		System.out.println("Lower Case : " + lowerstring);
		System.out.println("Upper Case : " + upperstring);

		

	}

}
