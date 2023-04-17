import java.util.*;

public class Project_61 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variables
		int temp, row;

		// take the size from the user
		System.out.print("n = ");
		row = input.nextInt();

		// creating a 2D array with the size row
		int[][] nums = new int[row][row];

		for(int D = 0; D < row; D++)
			temp = nums[D][0];

		for(int i = 1, j = 0; i <= row && j < row; i++, j++) {
			
			nums[i][j] = i;
			for(int k = 1; k < nums.length; k++) {

				nums[k - 1] = nums[k];

			}

			nums[nums.length] = temp;

			System.out.print(nums[row][row]);

		}

	}

}
