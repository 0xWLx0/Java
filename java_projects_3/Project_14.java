import java.util.Scanner;
import java.util.Arrays;

public class Project_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declaring the array
		double[] prices = {300, 200, 100};

		// printing the prices before the discount
		System.out.printf("Prices before the discount: %s%n", Arrays.toString(prices));

		// apply the discount on the list of prices
		prices[0] -= prices[0] * 0.10;
		prices[1] -= prices[1] * 0.10;
		prices[2] -= prices[1] * 0.10;
		
		// printing the prices after the discount
		System.out.printf("Prices after the discount: %s%n", Arrays.toString(prices));

	}

}
