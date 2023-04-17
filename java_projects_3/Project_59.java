import java.util.*;

public class Project_59 {

	public static void main(String[] arags) {

		Scanner input = new Scanner(System.in);

		// variables
		String noun, plural, new_letter, last_two_letters, last_letter;

		// take a noun from the user
		System.out.print("Enter a noun: ");
		noun = input.next();

		do {

			if(noun.equalsIgnoreCase("q"))
					break;

			// take the last letter from the noun
			last_letter = noun.substring(noun.length() - 1).toLowerCase();

			// take the last two letters
			last_two_letters = noun.substring(noun.length() - 2).toLowerCase();

			// deterimen the what is the last letter and update it to the plural from
			// and set the plural form of the noun
			if(last_letter.equals("y")) {

				new_letter = "ies";
				plural = noun.substring(0, noun.length() - 1) + new_letter;

			}
			else if(last_letter.equals("s") || last_letter.equals("x") || last_letter.equals("z") || last_two_letters.equals("ch")
					|| last_two_letters.equals("sh")) {

				new_letter = "es";
				plural = noun + new_letter;

			}
			else {

				new_letter = "s";
				plural = noun + new_letter;

			}	

			// print the plural form of the noun
			System.out.printf("Plural form: %s%n", plural);

			// take a noun from the user
			System.out.print("Enter a noun: ");
			noun = input.next();

		}while(true);

	}

}
