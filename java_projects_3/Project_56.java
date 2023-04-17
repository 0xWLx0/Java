import java.util.*;

public class Project_56 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// delaring an array with size 5
		int[] nums = new int[5];

		// take numbers from the user
		System.out.println("Enter a list of 5 numbers: ");
		for(int i = 0; i < nums.length; i++)
			nums[i] = input.nextInt();

		// inversing the array
		int temp = 0;	
		for(int i = 0, j = nums.length - 1; i < (nums.length / 2); i++, j--) {

			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;

		}

		System.out.printf("%s%n", Arrays.toString(nums));

		/*System.out.print("[");

		for(int i = nums.length - 1; i >= 1; i--)
			System.out.print(nums[i] + ", ");

		System.out.print(nums[0] + "]");
		System.out.println();*/

	}

}
