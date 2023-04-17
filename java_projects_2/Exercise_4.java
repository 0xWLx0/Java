import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int num = input.nextInt();

		if(num <= 0) {

			System.out.println("Please enter a number greater than zero.");

		}

		else {

			for(int i = 1; i <= num; i++) {
				
				for(int k = 1; k < i; k++) {

					System.out.print(" ");

				}

				for(int j = 0; j <= num - i; j++) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
