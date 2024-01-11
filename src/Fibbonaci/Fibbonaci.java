package Fibbonaci;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Put number you want for fibbonacci");
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int num1 = 0;
int num2 = 1;
int num3 = 0;

for(int i =1; i!=a; i++) {
	num3 = num1+num2+num3;
	System.out.print(num3 + "," );
	
}

	}

}
