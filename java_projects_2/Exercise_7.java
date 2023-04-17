import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number lines: ");

		int lines = input.nextInt();

		if(lines <= 0) {

			System.out.println("The number of lines must be greater than zero.");

		}

		else {

			for(int i = 1; i <= lines; i++) {

				for(int k = lines; k > i; k--) { // for spaces

					System.out.print(" ");

				}

				for(int j = 1; j <= i; j++) {

					System.out.print("*");

				}

				for(int f = 1; f < i; f++) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
