import java.util.*;

public class tags {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variables
		String s, tage;
		int first, end;

		// take an input from the user
		System.out.print("Enter a string: ");
		s = input.nextLine();

		System.out.print("Tags are: \n");	

		first = 0;
		end = 0;
		for(int i = 0;; i = end + 1) {

			first = s.indexOf("<", i) + 1;
			end = s.indexOf(">", i);

			if(end == -1 || first == -1)
				break;

			tage = s.substring(first, end);

			System.out.printf("-%s%n", tage);

		}

	}

}
