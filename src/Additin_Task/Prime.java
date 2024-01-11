package Additin_Task;

import java.util.Scanner;

public class Prime {

	public boolean isNumberPrime(int number) {
		
		boolean prime = true;
		//int number = sc.nextInt();
		int a = 0, b = 1;
		if (number == a || number == b) {
			System.out.println("Not a prime Number");
		} else if (number == 2) {
			System.out.println(" prime Number");
		}

		for (int c = 2; c < number; c++) {

			if (number % c == 0) {
				prime = false;
				// System.out.println("Not a prime Number");
				break;
			}

		}
		return prime;

	}

}
