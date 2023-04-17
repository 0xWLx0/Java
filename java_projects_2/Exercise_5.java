import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int num1 = input.nextInt();

		System.out.print("Enter the number of columns: ");

		int num2 = input.nextInt();

		if(num1 <= 0) {

			System.out.println("Please enter a number greater than zero.");

		}

		else {

			for(int i = 1; i <= num1; i++) {
				
				for(int k = 1; k <= num1 - i; k++) {

					System.out.print(" ");

				}

				for(int j = 1; j <= num2; j++) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

	}

}
