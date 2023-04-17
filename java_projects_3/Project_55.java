import java.util.*;

public class Project_55 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declraing an array with size 10
		int[] nums = new int[10];
		
		// Prompt the user to enter 10 numbers and store these numbers in an array
		System.out.println("Enter 10 integer numbers: ");
		for(int i = 0; i < nums.length; i++)
			nums[i] = input.nextInt();
		
		// sort the array in ascenging order
		int temp = 0;
		for(int i = 0; i < nums.length; i++) {

			for(int j = 0; j < nums.length; j++) {

				temp = nums[i];
				if(nums[i] < nums[j]) {

					nums[i] = nums[j];
					nums[j] = temp;

				}

			}

		}

		// print the list of numbers after sorting
		System.out.printf("Numbers ordered ascendingly: %n%s%n", Arrays.toString(nums));
		
		// take number from the user
		System.out.print("Enter a number to get count of numbers greater than it: ");
		int num = input.nextInt();

		// count the number that are greater than num
		int counter = 0;
		for(int i = 0; i < nums.length; i++) {

			if(nums[i] > num)
				counter++;

		}

		// print the number of numbers that are greater than num
		System.out.printf("Count of numbers greate than %d is: %d%n", num, counter);

	}

}
