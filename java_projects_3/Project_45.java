import java.util.*;

public class Project_45 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring variables and two arrays
		int choice, num_pass;
		String[] pass_names_F, pass_names_E;

		do{

			// print the menu and take the user choice
			System.out.printf("Chose the class:%n%s%n%s%n%s%n", "1- Economic class", "2- First class", "3- exit");
			choice = input.nextInt();

			// take the number of passengers at the selected class
			if(choice == 1) {

				System.out.print("Enter Number Of Passengers in economic class: ");
				num_pass = input.nextInt();

			}

			else if(choice == 2) {
	
				System.out.print("Enter Number Of Passengers in first class: ");
				num_pass = input.nextInt();

			}

			else if(choice == 3){

				System.out.println("Thank you for traveling with us!");
				break;

			}

			else {

				System.out.println("Wronge choice!");
				continue;

			}

			// give the size for the Economic class array and the frist class array
			pass_names_E = new String[choice == 1? num_pass: 0];
			pass_names_F = new String[choice == 2? num_pass: 0];

			// take the passengers name in the Economic class
			for(int i = 0; i < pass_names_E.length; i++) {

				System.out.printf("Enter Name Of Passenger %d: ", (i + 1));
				pass_names_E[i] = input.next();
				

			}
	
			// take the passengers name in the First class
			for(int i = 0; i < pass_names_F.length; i++) {

				System.out.printf("Enter Name Of Passenger %d: ", (i + 1));
				pass_names_F[i] = input.next();
				

			}


		} while(true);

	}

}
