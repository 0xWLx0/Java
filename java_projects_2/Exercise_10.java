import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int lines = input.nextInt();

		if(lines <= 0) {

			System.out.println("The nunber of lines must be greater than zero.");

		}

		else {

			for(int i = 1; i <= lines; i++) {

				for(int j = (lines - 1); i <= j; j--) {

					System.out.print(" ");

				}

				for(int k = 1; k <= i; k++) {

					System.out.print("*");

				}

				System.out.println();

			}

			for(int j = 1; j < lines; j++) {

				for(int i = 1; i <= j; i++) {

					System.out.print(" ");

				}

				for(int k = (lines - 1); k >= j; k--) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
