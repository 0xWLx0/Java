import java.util.Scanner;

public class Project_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Delclaring variables and initialize it with the value 5000
		int amount = 5000, withdrawal, remaining, total = 0, type_1 = 0, type_2 = 0, type_3 = 0;

		// take withdrawal from the user as input
		System.out.print("Enter withdrawal amount: ");
		withdrawal = input.nextInt();

		// check if the withdrawal amount is less than 5000 and multiple of 50
		if(withdrawal < amount && (withdrawal % 50) == 0) {

			// compute and print the minimum number of banknotes requited to represent the given withdrawal amount
			// compute and print the new amount after withdrawal
			
			// banknotes for 500
			type_1 = withdrawal / 500;
			if(type_1 != 0)
				System.out.printf("- 500 * %d%n", type_1);

			// banknotes for 100
			type_2 = (withdrawal - (type_1 * 500)) / 100;
			if(type_2 != 0)
				System.out.printf("- 100 * %d%n", type_2);

			// banknotes for 50
			type_3 = (withdrawal - ((type_2 * 100) + (type_1 * 500))) / 50;
			if(type_3 != 0)
				System.out.printf("- 50 * %d%n", type_3);

			// print the number of banknotes
			total = type_1 + type_2 + type_3;
			System.out.printf("You got %d banknotes.%n", total);


			// calculate and print the new amount after the withdrawal
			remaining = amount - withdrawal;
			System.out.printf("Remaining amount is %d.%n", remaining);

		}
		else
			System.out.println("You must enter an amount multiple of 50 and less than 5000.");

	}

}
