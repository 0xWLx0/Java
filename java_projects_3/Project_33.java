import java.util.*;

public class Project_33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring variables
		int num_students, grade, total, counter, g, high;
		double average;

		// take the number of students from the user
		System.out.print("Enter the number of students: ");
		num_students = input.nextInt();

		// declaring and initilaizing an array
		int[] grades = new int[num_students];

		// taking the grade of each student and calculate the total
		total = 0;
		counter = 0;
		grade = 0;
		while(counter < num_students && grade != -1) {

			// taking the student grade
			System.out.print("Enter the student grade: ");
			grade = input.nextInt();

			if(grade != -1) {

				grades[counter] = grade;
				total += grade;

			}

			counter++;

		}

		// calculate the average
		average = (double)(total) / num_students;

		System.out.printf("The average of the students grades is: %.2f%n", average);


		// take a grade from the user
		System.out.print("Enter a grade: ");
		g = input.nextInt();

		// count the students that have a grade greater than or equal to g
		high = 0;
		int i = 0;
		while(i < num_students) {

			if(grades[i] >= g)
				high++;
			
			i++;

		}

		// print the number of students that have a grade greater than or equal to g
		System.out.printf("The number of students that have a grade greater than or equal to %d is %d%n", g, high);

	}

}
