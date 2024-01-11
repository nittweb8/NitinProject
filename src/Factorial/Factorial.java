package Factorial;

import java.util.Scanner;

public class Factorial {
	
	
public static int add (int a,int b) {
	
	return a+b;
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");

		int number = sc.nextInt();

		int i, factoria = 1;

		for (i = 1; i <= number; i++) {
			factoria = factoria * i;
		}

		System.out.println("Factorial of " + number + " = " + factoria);
		System.out.println(add(number,factoria));


	}
}
