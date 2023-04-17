import java.util.*;

public class Project_63 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variables
		int num, total;
		
		// take the an input from the user
		System.out.print("Enter a number: ");
		num = input.nextInt();

		// until the user enter a negative number
		total = 0;
		while(num >= 0) {

			total++;

			System.out.printf("Total is: %d%n", total);

			// take the an input from the user
			System.out.print("Enter a number: ");
			num = input.nextInt();

		}


	}

}
