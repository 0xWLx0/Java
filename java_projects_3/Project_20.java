import java.util.Scanner;
import java.util.Arrays;

public class Project_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaring an array that have a list of gym item names
		String[] products = {"Dumbbell", "Mat", "Gloves", "Treadmill", "Air bike"};

		// Declaring an array to store the prices of the gym items 
		double[] prices = {300.15, 300.15, 300.15, 300.15, 300.15};

		// prompt the user to update the Treadmill price
		System.out.print("Enter Treadmill updated price: ");
		prices[3] = input.nextDouble();

		// apply 20% discount to the Dumbbell product, if the price of the Dumbbell is 100.5 apply another 20% discount to be 80.4
		prices[0] = prices[0] - (prices[0] * (20 /100));

		// printing the Products and their prices
		System.out.printf("Products: %s%nPrices: %s%n", Arrays.toString(products), Arrays.toString(prices));

	}

}
