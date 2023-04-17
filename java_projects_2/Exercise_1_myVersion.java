import java.util.Scanner;

public class Exercise_1_myVersion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter the number of lines: ");
		num = input.nextInt();
		if(num <= 0) {

			System.out.println("Please enter a number greater than zero");

		}

		else {

			for(int i = 1; i <= num; i++) {

				for(int j = 1; j <= i; j++) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
