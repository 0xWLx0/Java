import java.util.Scanner;
import java.util.Arrays;

public class Project_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Declaring the array
		char[] characters = new char[4];
		
		// taking the input from the user
		System.out.print("Read letter 1: ");
		characters[0] = input.next().charAt(0);
		System.out.print("Read letter 1: ");
		characters[1] = input.next().charAt(0);
		System.out.print("Read letter 1: ");
		characters[2] = input.next().charAt(0);
		System.out.print("Read letter 1: ");
		characters[3] = input.next().charAt(0);

		// convert the list of letters to Small letters
		String letters = new String(characters);
		String low_case = letters.toLowerCase();
		characters[0] = low_case.charAt(0);
		characters[1] = low_case.charAt(1);
		characters[2] = low_case.charAt(2);
		characters[3] = low_case.charAt(3);
		
		// Declaring a copy of the first array and convert each letter in the list to capital letter
		char[] upperCase = new char[4];
		String upper_case = letters.toUpperCase();
		upperCase[0] = upper_case.charAt(0);
		upperCase[1] = upper_case.charAt(1);
		upperCase[2] = upper_case.charAt(2);
		upperCase[3] = upper_case.charAt(3);


		// printing the list of letters in lower case and in upper case
		System.out.printf("Small letters %s and Capital letters %s%n", Arrays.toString(characters), Arrays.toString(upperCase));


	}

}
