import java.util.Scanner;

public class Project_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring and initilaizing variables
		int passes = 0, failures = 0, students = 1, status;

		// count the number of passes and failures in 10 students
		while(students <= 10) {

			// prompt the user to enter 1 if the student pass and 0 if the student fail
			System.out.print("Enter the student status (1 if pass and 2 if fail): ");
			status = input.nextInt();

			// if pass add one to passes and if fail add one to failures
			if(status == 1)
				++passes;
			else if(status == 2)
				failures++;
			else
				System.out.print("Unknown status\n");

			students++;

		}
		
		// print the number of passes and failures students
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// determine if the instructor deserves a bonus or not
		if(passes >= 8)
			System.out.print("Bonus to the instructor\n");

	}

}
