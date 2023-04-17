import java.util.Scanner;

public class Project_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double price[] = new double[4]; // create an array that have 4 elements

		System.out.print("Enter the price of 4 kinds of food: \n");

		for(int i = 0; i < price.length; i++) {  // the user enter the price for eche item

			price[i] = input.nextDouble();

		}

		System.out.print("Enter the index of the food's price: "); // if the user want to call any item he needs to give us the     index of that item 

		int index = input.nextInt();

		System.out.print("Enter the quantity: "); // the number of items that the user want to order

		int quantity = input.nextInt();

		double extra_charge = 5;  // if the order is a meal

		System.out.print("Single or Meal ?  (enter 1 for single, 2 for meal): ");

		int choice = input.nextInt();

		if(choice == 1) {

			System.out.println("The total price is " + checkoutSingle(price[index], quantity));

		}

		else if(choice == 2) {

			System.out.println("The total price is " + checkoutMeal(price[index], quantity, extra_charge));

		}

	}

	static double checkoutSingle(double price, int quantity) {  // if the order is single

		double totalPrice = price * quantity;  // counting the total price of the order

		return totalPrice;

	}

	static double checkoutMeal(double price, int quantity, double extra_charge) {  // if the order is a meal

		double totalPrice = (price + extra_charge) * quantity;

		return totalPrice;

	}

}
