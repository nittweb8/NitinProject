package AddTwoNumber;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your year to know Leap Year OR Not");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ( year % 400 == 0 ) {
			System.out.println("Leap Year");
		}
		
		else if ( year % 100 == 0 && year % 400 != 0 ) {
			System.out.println("Not a Leap Year");
		}
		
		else if ( year % 100 != 0 && year % 4 == 0 ) {
			
			System.out.println("Leap Year");
		}
			
			else if ( year % 4 != 0 ) {
				
				System.out.println("Not a Leap Year");
			

		}

		
	}

}
