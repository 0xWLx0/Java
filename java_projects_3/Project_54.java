import java.util.*;

public class Project_54 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 

		// variables
		String name_1, name_2, half_1, half_2;
		int half_end_1, half_end_2;

		// take first name from the user
		System.out.print("Enter 1 first name? ");
		name_1 = input.next();
		half_end_1 = (int)(Math.ceil((double)name_1.length() / 2));

		// take first name from the user
		System.out.print("Enter 2 first name? ");
		name_2 = input.next();
		half_end_2 = (int)(Math.ceil((double)name_2.length() / 2));

		// take the half of each name
		half_1 = name_1.substring(0, half_end_1).toUpperCase();	
		half_2 = name_2.substring(0, half_end_2).toUpperCase();

		// print the Suggested baby name:
		System.out.printf("Suggested baby name: %s%s%n", half_1, half_2);

	}

}
