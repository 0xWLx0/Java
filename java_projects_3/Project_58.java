import java.util.*;

public class Project_58 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variables
		int num_students, total, mark, g, counter;
		double average;
		
		// take the number of students
		System.out.println("Enter the number of students: ");
		num_students = input.nextInt();

		// create an array with that store the students greade
		int[] marks = new int[num_students];

		// take the students mark
		total = 0;
		for(int i = 0; i < num_students; i++) {

			// take the grade from the user
			System.out.print("Enter the student mark: ");
			mark = input.nextInt();

			// adding the mark to the array
			marks[i] = mark;

			// add the mark to the total
			total += mark;

		}

		// calculte the average
		average = (double)(total) / num_students;

		// print the average 
		System.out.printf("The average is %.2f%n", average);

		// take a grade from the user
		System.out.print("Enter a grade: ");
		g = input.nextInt();

		// calculate the number of students having  grade greater than or equal to g
		counter = 0;
		for(int i = 0; i < num_students; i++) {

			if(marks[i] >= g)
				counter++;

		}

		System.out.printf("The number of students that have a gread greater than or equal to %d is %d%n", g, counter);

	}

}
