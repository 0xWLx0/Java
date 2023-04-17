import java.util.Scanner;

public class Project_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int num = input.nextInt();

		if(((num % 5) == 0) && ((num % 3) == 0)) {

			System.out.println("Fuzz Buzz");

		}

		else if((num % 5) == 0) {

			System.out.println("Fuzz");

		}

		else if((num % 3) == 0) {

			System.out.println("Buzz");

		}

	}

}
