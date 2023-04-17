import java.util.Scanner;

public class GuessingGame_myVersion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int computerGuess = (int) (Math.random() * 100 + 1);

		System.out.println(computerGuess);

		System.out.print("Enter a guess between 1 and 100: ");

		int userGuess = input.nextInt();

		int count = 1;

		while(userGuess != computerGuess) {

			System.out.println("Your guess is incorrect!, try again.\nTry Number: " + count);

			System.out.print("Enter a guess between 1 and 100: ");

			userGuess = input.nextInt();
			
			count ++;
		}

		if(userGuess == computerGuess) {

			System.out.println("Correct!\nTotal Guesses: " + count);

		}

	}

}
