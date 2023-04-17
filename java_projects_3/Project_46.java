import java.util.*;

public class Project_46 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declraing variables
		int choice, num_pass;
		String[] pass_names_E, pass_names_F;

		do {
			// print the menu and take the user choice
			System.out.printf("chose the class:\n%s%n%s%n%s%n", "1- Economic class", "2- First class", "3- Exit");
			choice = input.nextInt();

			// take the number of passengers
			num_pass = 0;
			switch(choice) {
				
				case 1:
					System.out.print("Enter Number Of Passengers in economic class: ");
					num_pass = input.nextInt();
					break;

				case 2:	
					System.out.print("Enter Number Of Passengers in first class: ");
					num_pass = input.nextInt();
					break;

				case 3:
					System.out.println("Thanks you for travelling with us!");
					break;	

				default:
					System.out.println("wronge choice");

			}

			if(choice == 3)
				break;
			else if(choice != 2 && choice != 1)
				continue;

			pass_names_E = new String[choice == 1? num_pass: 0];
			pass_names_F = new String[choice == 2? num_pass: 0];

			// take the passengers names
			// for economic class
			for(int i = 0; i < pass_names_E.length; i++) {

				System.out.printf("Enter Name Of Passengers %d: ", (i + 1));
				pass_names_E[i] = input.next();

			}

			// for first class
			for(int i = 0; i < pass_names_F.length; i++) {

				System.out.printf("Enter Name Of Passengers %d: ", (i + 1));
				pass_names_F[i] = input.next();

			}

		}while(true);

	}

}
