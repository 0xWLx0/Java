// The program should prompt the user to enter four numbers
// then print if they are in ascending order or descending order or neither
// then calculate the average of the enterd four numbers
// and print the average
// end

import java.util.Scanner;

public class Project_24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaring variables
		double num_1, num_2, num_3, num_4, average;
		boolean exp_1, exp_2;

		// take the four numbers from the user as input
		System.out.print("Enter four numbers: ");
		num_1 = input.nextDouble();
		num_2 = input.nextDouble();
		num_3 = input.nextDouble();
		num_4 = input.nextDouble();

		// calculate the average
		average = (num_1 + num_2 + num_3 + num_4) / 4;

		// assigning a value to the boolean variables
		exp_1 = (num_1 < num_2) && (num_2 < num_3) && (num_3 < num_4);
		exp_2 = (num_1 > num_2) && (num_2 > num_3) && (num_3 > num_4);

		// printing the average and the order
		if(exp_1)
			System.out.printf("The numbers are in ascending order.%nTheir average is: %.6f%n", average);
		else if(exp_2)
			System.out.printf("The numbers are in descending order.%nTheir average is: %.6f%n", average);
		else
			System.out.printf("The numbers are not ordered.%nTheir average is: %.6f%n", average);

	}

}
