import java.util.Scanner;

public class Project_43 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring an array and the size
		System.out.print("Enter the size: ");
		final int size = input.nextInt();
		int[] arr = new int[size];

		// assigning values to the array
		System.out.printf("Enter a list of %d numbers: %n", size);
		for(int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt();

		// take a number from the user
		System.out.print("Enter a number: ");
		int key = input.nextInt();

		int i = 0;
		boolean flag = false;
		for(; i < arr.length; i++) {

			if(arr[i] == key) {

				System.out.printf("The number index is %d%n", i);
				flag = true;
				break;

			}
			
			i++;

		}

		if(!flag)
			System.out.println("The number not found");

	}

}
