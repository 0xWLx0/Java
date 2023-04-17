import java.util.Scanner;

public class Exercise_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int lines = input.nextInt();

		if(lines <= 0) {

			System.out.println("The number of lines must be greater than zero.");

		}

		else {

			for(int i = 1; i <= lines; i++) {
				
				for(int j = 1; j <= i; j++) {

					System.out.print("*");

				}

				System.out.println();

			}

			for(int j = 1; j < lines; j++) {

				for(int i = (lines - 1); i >= j; i--) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
