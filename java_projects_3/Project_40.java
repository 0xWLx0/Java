import java.util.*;

public class Project_40 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring and initilazing variables
		int month, day;

		// take the month from the user
		System.out.print("Enter month: ");
		month = input.nextInt();

		while(month != -1) {

			// take the day from the user
			System.out.print("Enter day: ");
			day = input.nextInt();

			// calculate the date of the next day
			switch(month) {

				case 2:
					if(day == 28) {
	
						day = 1;
						month++;
	
					}
					else
						day++;
	
					break;
	
				case 4, 6, 9, 11:
					if(day == 30) {
	
						day = 1;
						month++;
	
					}
					else
						day++;
	
					break;
	
				case 1, 3, 5, 7, 8, 10:
					if(day == 31) {
	
						day = 1;
						month++;
	
					}
	
					else
						day++;
	
					break;
	
				case 12:
					if(day == 31) {
	
						day = 1;
						month = 1;

					}
					else
						day++;
	
					break;

			}

			System.out.printf("Next day is: %02d/%02d%n%n", day, month);

			// take the month from the user 
			System.out.print("Enter month: ");
			month = input.nextInt();

		}

		System.out.println("Good bye");

	}

}
