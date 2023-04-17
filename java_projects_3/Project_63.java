import java.util.*;

public class Project_63 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variables
		int rows, columns;

		// take the number of rows from the user
		System.out.println("enter the number of rows: ");
		rows = input.nextInt();

		// take the number of columns from the user
		System.out.println("enter the number of columns: ");
		columns  = input.nextInt();

		for(int i = 0; i < rows; i++) {
			
			// print # until the number columns
			for(int j = 0; j < columns; j++) {

				System.out.print("#");

			}

			System.out.println();

		}

	}

}
