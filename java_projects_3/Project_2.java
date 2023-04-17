import java.util.Scanner;

public class Project_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int num = input.nextInt();

		if(num <= 0) {

			System.out.println("The number of lines must be greater than zero.");

		}

		else {

			for(int i = 1; i <= num; i++) { // the main loop

				if(i % 2 == 0) {

					System.out.print(" ");

				}

				for(int j = 1; j <= num; j++) { // a loop that print the stars

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
