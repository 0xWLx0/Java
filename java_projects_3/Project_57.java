import java.util.*;

public class Projct_53 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// create an array for the user order
		String[] order = new String[4];

		// create a 2D array with 4 rows and 2 columns for each row
		String[][] menu = new String[4][4];

		// drinks
		menu[0][0] = "kola";
		menu[0][1] = "pepcy";
		menu[0][2] = "7diet";
		menu[0][3] = "lemon";

		// launch
		menu[1][0] = "burger";
		menu[1][1] = "Knafa";
		menu[1][2] = "foul";
		menu[1][3] = "shoram";

		// sweet
		menu[2][0] = "ice kreem";
		menu[2][1] = "cake";
		menu[2][2] = "sweet";
		menu[2][3] = "choklet";

		// salda
		menu[3][0] = "salda";
		menu[3][1] = "suse";
		menu[3][2] = "tometo";
		menu[3][3] = "lettce";
		
		// varialbes
		int drink, meal, sweet, salda;
		int choice = 0;

		do {

			// take the user drink
			// first print the list of drinks
			System.out.printf("drings: %s%n",  Arrays.toString(menu[0]));
			// second take the user choice
			System.out.print("Enter you choise (1-4): ");
			drink = input.nextInt();
			
			for(int i = 0; drink < 1 || drink > 4; i++) {

				System.out.print("Enter you choise (1-4): ");
				drink = input.nextInt();

			}
			order[0] = menu[0][drink - 1];	

			// take the user meal
			// first print the list of meals
			System.out.printf("meals: %s%n",  Arrays.toString(menu[1]));
			// second take the user choice
			System.out.print("Enter you choise (1-4): ");
			meal = input.nextInt();
			
			for(int i = 0; meal < 1 || meal > 4; i++) {

				System.out.print("Enter you choise (1-4): ");
				meal = input.nextInt();

			}
			order[1] = menu[1][meal - 1];


			// take the user sweet
			// first print the list of sweets
			System.out.printf("sweets: %s%n",  Arrays.toString(menu[2]));
			// seccnd  take the user choice
			System.out.print("Enter you choise (1-4): ");
			sweet = input.nextInt();
			
			for(int i = 0; sweet < 1 || sweet > 4; i++) {

				System.out.print("Enter you choise (1-4): ");
				sweet = input.nextInt();

			}
			order[2] = menu[2][sweet - 1];
			
			// take the user salda
			// first print the list of saldas
			System.out.printf("saldas: %s%n",  Arrays.toString(menu[3]));
			// second take the user choice
			System.out.print("Enter you choise (1-4): ");
			salda = input.nextInt();
			
			for(int i = 0; salda < 1 || salda > 4; i++) {

				System.out.print("Enter you choise (1-4): ");
				salda = input.nextInt();

			}
			order[3] = menu[3][salda - 1];


			// print the user order
			System.out.println("Your order is: ");
			System.out.printf("drink: %s%n", order[0]);
			System.out.printf("meal: %s%n", order[1]);
			System.out.printf("sweet: %s%n", order[2]);
			System.out.printf("salda: %s%n", order[3]);

			// cheak if the user want anther order
			System.out.print("Enter 1 to take anther order otherwise enter -1: ");
			choice = input.nextInt();

			if(choice != 1) {

				System.out.println("Thank you!.");
				break;

			}


		} while(true);

	}

}
