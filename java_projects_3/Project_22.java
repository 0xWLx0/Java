// the program should prompt the user to enter a month
// then print the current season of the year

import java.util.Scanner;
import java.util.Arrays;

public class Project_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// seting each seacon
		String[] Winter = {"december", "january", "february"};
		String[] Spring = {"march", "aprill", "may"};
		String[] Summer = {"june", "june", "august"};
		String[] Autumn = {"september", "October", "November"};

		// taking the input from the user
		System.out.print("Enter a month: ");
		String month = input.nextLine();

		// determine the current season and print it
		if(Arrays.asList(Winter).contains(month.toLowerCase()))
			System.out.print("It's Winter\n");
			
		else if(Arrays.asList(Spring).contains(month.toLowerCase()))
			System.out.print("It's Spring\n");

		else if(Arrays.asList(Summer).contains(month.toLowerCase()))
			System.out.print("It's Summer\n");
		
		else if(Arrays.asList(Autumn).contains(month.toLowerCase()))
			System.out.print("It's Autumn\n");

	}

}
