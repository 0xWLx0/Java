// The program should prompt the user to enter a number between 1 and 7
// then print the day that represent the number the user entered
// the program should also print an error message if the user entered a number less than 1 and greater than 7
//

import java.util.Scanner;

public class Project_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// declaring variables
		int num;

		// take a number from the user
		System.out.print("Enter a number: ");
		num = input.nextInt();

		// print the day of the number
		switch(num) {

			case 1:
				System.out.println("Friday");
				break;
			case 2:
				System.out.println("Saturday");
				break;
			case 3:
				System.out.println("Sonday");
				break;
			case 4:
				System.out.println("Monday");
				break;
			case 5:
				System.out.println("Tuesday");
				break;
			case 6:
				System.out.println("Wednesday");
				break;
			case 7:
				System.out.println("Thursday");
				break;
			default:
				System.out.println("Invalid day number.");

		}

	}

}
