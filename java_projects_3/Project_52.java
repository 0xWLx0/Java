import java.util.*;

public class Project_52 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring and initialzing a 2D array
		int[][] sec_ID = {{100, 25}, {200, 30}, {300, 20}, {400, 35}};
		
		// print the category
		System.out.printf("%s %21s%n", "Sections", "Number of Students");
		// print the array
		// print sections and IDs
		for(int i = 0; i < sec_ID.length; i++) {

			for(int j = 0; j < sec_ID[i].length; j++)
				System.out.printf("%-12d", sec_ID[i][j]);

			System.out.println();

		}

		System.out.println("\n");

		// variables
		int section = 0, ID = 0, row = 0, index = 0;
		
		
		//take the section as input
		System.out.print("Enter a section number to change the number of students it has, or -1 to exit: ");
		section = input.nextInt();
		while(section != -1) {

			// doing a binary search for the section	
			for(int i = 0; i < sec_ID.length; i++) {

				for(int j = 0; j < sec_ID[i].length; j++) {

					index = Arrays.binarySearch(sec_ID[i], section);
					row = i;
					if(index >= 0)
						break;

				}
				if(index >= 0)
					break;

			}
			// check if section exits
			if(index < 0) {

				System.out.println("Wrong section number!\n");
				// take the section as input
				System.out.print("\nEnter a section number to change the number of students it has, or -1 to exit: ");
				section = input.nextInt();
				continue;

			}


			// take a new student number
			System.out.print("Enter a new number: ");
			ID = input.nextInt();

			// check if Id is positive
			while(ID <= 0) {
				
				System.out.print("Enter a positive value: ");
				ID = input.nextInt();

			}

			// Update the selected section to the new students number
			sec_ID[row][index + 1] = ID;
			/*for(int i = 0; i < sec_ID.length; i++) {

				for(int j = 0; j < sec_ID[i].length; j++) {

					if(sec_ID[i][j] == sec_ID[row][index])
						sec_ID[i][j + 1] = ID;

				}
				if(exist >= 0)
					break;

			}*/

			// print the category
			System.out.printf("%s %21s%n", "Sections", "Number of Students");
			// print the array
			// print sections and IDs
			for(int i = 0; i < sec_ID.length; i++) {

				for(int j = 0; j < sec_ID[i].length; j++)	
					System.out.printf("%-12d", sec_ID[i][j]);

				System.out.println();

			}

			System.out.println("\n");

			//take the section as input
			System.out.print("Enter a section number to change the number of students it has, or -1 to exit: ");
			section = input.nextInt();

		}

	}

}
