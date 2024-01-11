package PrimeNumber;

import java.util.Scanner;

import Additin_Task.Prime;

public class Prime_Number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		Prime P = new Prime();
		boolean b = P.isNumberPrime(num);
		if(b) {
			System.out.println("Number is Prime");
			
		}
		else {
			System.out.println("Not a prime Number");
		}
		
		
	}
}
