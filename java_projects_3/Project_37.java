import java.util.*;

public class Project_37 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// declaring and initilazing variables
		int passes = 0, failures = 0, total;
		double total_P, total_F;
		char ch = ' ';

		// take P or F or S (P for pass, F for fail, S for stop)
		while(ch != 'S') {

			System.out.print("Please enter P for Pass, F for Fail or S to stop ");
			ch = input.next().charAt(0);

			if(ch == 'P')
				passes++;
			else if(ch == 'F')
				failures++;

		}

		// calculate the total
		total = passes + failures;

		// calculate the ratio of Passes and Failures
		total_P = ((double)(passes) / total) * 50;
		total_F = ((double)(failures) / total) * 50;

		// print the scale
		int i = 0;
		while(i <= 100) {

			System.out.printf("%-5d", i);
			
			if(i == 100)
				System.out.print("%");

			i += 10;

		}

		System.out.println();

		int j = 0;
		while(j <= 100) {

			System.out.printf("%-5s", "|");
			
			j += 10;

		}

		System.out.println();

		// print the P and F scale 
		int P = 1;
		while(P <= total_P) {

			System.out.print("*");

			P++;

		}
		
		System.out.println(" P");

		int f = 1;
		while(f <= total_F) {

			System.out.print("*");

			f++;

		}

		System.out.println(" F");

	}

}
