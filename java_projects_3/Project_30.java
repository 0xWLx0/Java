// The program should prompt the user to enter a the number of lines
// then drow a triangle using the entered data

import java.util.Scanner;

public class Project_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring variables
		int lines;

		// take the number of lines from the user
		System.out.print("Enter the number of lines: ");
		lines = input.nextInt();

		// printing the triangle
		for(int i = 1; i <= lines; i++) {

			for(int f = lines; f >= i; f--)
				System.out.print(" ");

			for(int j = 1; j <= i; j++)
				System.out.print("*");

			for(int k = 2; k <= i; k++) 
				System.out.print("*");

			System.out.println();

		}


	}

}
