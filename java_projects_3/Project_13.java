import java.util.Scanner;
import java.util.Arrays;

public class Project_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// declearing an array with size 3
		int[] arr = new int[3];
		
		// taking the input from the user
		System.out.print("Enter 3 numbers: ");
		arr[0] = input.nextInt();
		arr[1] = input.nextInt();
		arr[2] = input.nextInt();


		// printing the each value in the array
		System.out.printf("The value of index 0 = %d%n", arr[0]);
		System.out.printf("The value of index 1 = %d%n", arr[1]);
		System.out.printf("The value of index 2 = %d%n", arr[2]);

		// printing the array
		System.out.printf("The array: %s%n", Arrays.toString(arr));

		// Calculate the product of the array
		int product = arr[0] * arr[1] * arr[2];
		
		// printing the product of the array
		System.out.printf("The product of the array: %d%n", product);

		// Calculate the sum of the array
		int sum = arr[0] + arr[1] + arr[2];
		
		// Printing the sum of the array
		System.out.printf("The sum of the array: %d%n", sum);

	}

}
