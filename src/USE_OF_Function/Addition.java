package USE_OF_Function;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		newAddition naa = new newAddition();
		Multiply naa1 = new Multiply();

		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 IF you want ADD, Enter 2 If you want Mutiply");
		int choose = sc.nextInt();
		System.out.println("Enter Your First Number");
		a = sc.nextInt();

		b = sc.nextInt();
		System.out.println("Enter Your Second Number");
		if (choose == 1) {

			int result = naa.addTwoNumber(a, b);
			System.out.println("The sum of " + a + " and " + b + " is: " + result);
		} else {

			int result = naa1.multiPlyy(a, b);

			System.out.println("The Multiply of " + a + " and " + b + " is: " + result);
			System.out.println("Programe Done");
		}
	}

}

class newAddition {

	public int addTwoNumber(int n, int m) {

		return n + m;

	}

}

class Multiply {
	public int multiPlyy(int n, int m) {
		return n * m;
	}
}
