import java.util.*;

public class Project_34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// take the input from the user
		System.out.print("Enter a number (5-20): ");
		int count_row = input.nextInt();

		// declaring and initilazing counters
		int i = 0, j = 0;
		int count_col = 0;
		
		// 
		if(count_row >= 5  &&  count_row <= 20) {

			while(i < count_row) {

				j = -(count_row - 1);
				while(j < count_col) {

					System.out.print("x");

					j++;
				
				}
				
				count_col -= 1;
				i++;

				System.out.println();

			}

		}

		else
			System.out.print("Incorrect, Bye!");

	}

}
