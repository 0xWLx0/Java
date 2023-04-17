import java.util.*;

public class Project_65 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variables
		int year, month, day, num_of_next_dates;

		// take the date from the user
		System.out.println("Please enter today's date: ");
		// take the day
		System.out.print("\tday: ");
		day = input.nextInt();
		// check if the day in the range
		while(day < 1 || day > 30) {

			System.out.print("Incorrect, please enter again: ");
			day = input.nextInt();

		}


		// take the month
		System.out.print("\tmonth: ");
		month = input.nextInt();
		// check if the month in the range
		while(month < 1 || month > 12) {

			System.out.print("Incorrect, please enter again: ");
			month = input.nextInt();

		}
		
		// take the year
		System.out.print("\tyear: ");
		year = input.nextInt();
		// check if the year in the range
		while(year < 1900 || year > 2100) {

			System.out.print("Incorrect, please enter again: ");
			year = input.nextInt();

		}

		// take the number of the next dates
		System.out.print("Enter the number of next dates you want to print: ");
		num_of_next_dates = input.nextInt();

		// print the next dates
		int i = 1;
		while(i <= num_of_next_dates) {

			// check if the day equla to 30
			if(day == 30) {
			
				if(month == 12 && day == 30)
					year++;

				day = 1;
				if(month == 12)
					month = 1;
				else
					month++;

			}
			else
				day++;
			// check if the month equla to 12
			
			if(month == 12 && day == 30)
				year++;

			System.out.printf("Day %d date %d - %d - %d%n", i, day, month, year);

			i++;

		}

	}

}
