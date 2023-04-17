import java.util.Scanner;
import java.util.Arrays;

public class Project_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaring the array grades
		int[] grades = new int[5];

		// assgining grades to the array grades
		grades[0] = 90;
		grades[1] = 65;
		grades[2] = 55;
		grades[3] = 79;
		grades[4] = 80;

		// updating the grade of the student 5
		System.out.print("Enter the updated final grade for student number 5: ");
		grades[4] = input.nextInt();

		// pinting the grades after the update
		System.out.printf("Grades after the modifications: %n%s%n", Arrays.toString(grades));
		
		// Calculate the average 
		double average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;

		// Printing the final average of the students grades
		System.out.printf("%nThe Final average is %.1f%n", average);

		// Look up for the student ID by their grade
		// Taking the input from the user
		System.out.print("\nEnter a student grade for looking up:");
		int student_Grade = input.nextInt();

		// Finding the student that the user entered his grade, then print the ID of that student
		int student_Number = Arrays.binarySearch(grades, student_Grade);
		System.out.printf("The student number is: %d%n", student_Number + 1);
		

	}

}
