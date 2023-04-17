// The program should prompt the user to enter a String and enter a character
// then print the position index of the character in the string
// and print the total number of occurrences of that character in the string
// end

import java.util.Scanner;

public class Project_27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring variables
		String S;
		char ch;
		int total = 0, index = 0;

		// take a String from the user
		System.out.print("Enter a string: ");
		S = input.nextLine();

		// take a character from the user
		System.out.print("Enter a character: ");
		ch = input.next().charAt(0);

		// print the character position index in the String
		// System.out.printf("The character %c position index in the string %s is %d%n", ch, S, S.indexOf(ch));

		// calculate the total occurrence of the character in the string
		while(index <= (S.length() - 1)) {

			if(S.charAt(index) == ch)
				// print the character position index in the String
				System.out.printf("The character %c position index in the string %s is %d%n", ch, S, index);
				total++;

			index++;

		}

		// print the total occurrence of the character in the string
		System.out.printf("The total number of occurrence of the character %c in the string %s is %d%n", ch, S, total);

	}
}
