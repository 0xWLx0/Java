import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int lines = input.nextInt();

		if(lines <= 0) {

			System.out.println("The number of lines must be greater than zero.");

		}

		else {

			for(int i = 1; i <= lines; i++) {

				for(int k = 1;  k < i; k++) {  // for the spaces

					System.out.print(" ");

				}

				for(int j = lines; i <= j ; j--) {  // for the normal stars

					System.out.print("*");

				}

				for(int f = lines; i < f; f--) {  // for the sconde row of stars

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
