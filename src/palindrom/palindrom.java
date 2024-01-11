package palindrom;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		String str, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		str = sc.nextLine();
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		if (str.equals(reverse)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a Palindrom");
		}
	}

}
