import java.util.*;

public class Project_60 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// take a number from the user
		System.out.print("n = ");
		int num = input.nextInt();

		// creating an array
		int[][] nums = new int[num][num];

		// print the array before the left shift			
		for(int column = 0; column < nums[0].length; column++) {

			nums[0][column] = 1 + column;

		}	

		System.out.println(Arrays.toString(nums[0]));

		int temp = 0;

		// print the array with each left shift 
		for(int row = 1;  row < nums.length; row++) {

			// set the current row to the previous row
			for(int i = 0; i < nums[row].length; i++)
				nums[row][i] = nums[row - 1][i];

			// set the temp to the first element
			temp = nums[row][0];

			// do a left shift from the index to the index(length - 2)
			for(int column = 0; column < nums[row].length - 1; column++) {

				nums[row][column] = nums[row][column + 1];

			}

			// set the last element to temp which is the first element berfore the left shift
			nums[row][nums[row].length - 1] = temp;

			// print the array after doing the left shift
			System.out.println(Arrays.toString(nums[row]));

		}


	}

}
