import java.util.*;

public class Game {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declraing variables
		int num_guessed, guess, num_guesses, choice, range, max, min;

		// calculate the range and seting the random number(10-1)
		max = 10;
		min = 1;
		range = (max - min) + 1;
		guess = (int)(Math.random() * range) + min;
		num_guesses = 1;

		do{

			// print the memu
			System.out.printf("1.%s%n2.%s%n", "play game", "exit game");

			// take the user choice
			System.out.print("Enter your choice (1 to start and 2 to exit): ");
			choice = input.nextInt();

			if(choice != 1)
				break;

			// take a guess from the user and print the current round
			System.out.printf("Round %d%nEnter a guess(10-1): ", num_guesses);
			num_guessed = input.nextInt();

			// guess status
			if(num_guessed > guess)
				System.out.println("Too high!");
			else if(num_guessed < guess)
				System.out.println("Too low!");
			else {

				System.out.println("Correct!");
				break;

			}
			
			num_guesses++;

			if(num_guesses > 3 && num_guessed != guess) {

				System.out.println("Game over!");
				break;

			}

		
		}while(true);

	}

}
