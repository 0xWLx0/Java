import java.util.Scanner;

public class Exercise_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int lines = input.nextInt();

		System.out.print("Enter the number of columns: ");

		int columns = input.nextInt();

		if(lines <= 0 && columns <= 0) {

			System.out.print("The number lines and columns must be greater than zero.");

		}

		else {

			for(int i = 1; i <= lines; i++) {

				for(int k = 1; k < i; k++) {  // for the spaces

					System.out.print(" ");

				}

				for(int j = 1; j <= columns; j++) {  // for the stars

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
