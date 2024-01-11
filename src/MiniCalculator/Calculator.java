package MiniCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator;
		float number1, number2, result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose an operator +, -, *, /");

		operator = sc.next().charAt(0);
		System.out.println("Enter First Number");
		number1 = sc.nextFloat();

		System.out.println("Enter Second Number");
		number2 = sc.nextFloat();

		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(number1 + "+" + number2 + "=" + result);
			break;
		case '-':
			result = number1 - number2;
			System.out.println(number1 + "-" + number2 + "=" + result);
			break;
		case '*':
			result = number1 * number2;
			System.out.println(number1 + "*" + number2 + "=" + result);
			break;
		case '/':
			result = number1 / number2;
			System.out.println(number1 + "/" + number2 + "=" + result);
			break;
		}
	}

}
