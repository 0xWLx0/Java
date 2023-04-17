import java.util.*;

public class Project_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);

		if(letter == 'a' || letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o') {

			System.out.println("Input letter is Vowel");

		}

		else {

			System.out.println("Input letter is Consonant");

		}

	}

}
