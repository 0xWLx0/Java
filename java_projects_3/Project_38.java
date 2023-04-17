import java.util.*;

public class Project_34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring variables
		String f_name, first_name, last_name, f_letter, s_letter;


		// take the first and last name from the user
		System.out.print("Please enter the full name: ");
		f_name = input.nextLine();

		int space = f_name.indexOf(" ");
		// capitalizaing the fist letter in the first and the last name
		// first name
		f_letter = (f_name.substring(0, 1)).toUpperCase();
		first_name = f_letter + f_name.substring(1, space);

		// last name
		s_letter = (f_name.substring((space + 1), (space + 2))).toUpperCase();
		last_name = s_letter + f_name.substring((space + 2), f_name.length());

		System.out.printf("The name after capitalization: %s %s%n", first_name, last_name);

	}

}
