import java.util.*;

public class Project_44 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// delcaring variables and an array
		int max, min;
		int[] arr = new int[8];	

		// filling the array
		System.out.println("Enter a list of 8 numbers: ");
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();

		System.out.printf("The array berfor the sort: %s%n", Arrays.toString(arr));

		// sorting the list 
		int sort;
		for(int i = 0; i < arr.length; i++) {

			for(int j= 0; j < arr.length; j++) {
				
				sort = arr[i];

				if(arr[i] < arr[j]) {

					arr[i] = arr[j];
					arr[j] = sort;

				}

			}

		}

		System.out.printf("The array after the sort: %s%n", Arrays.toString(arr));

	}

}
