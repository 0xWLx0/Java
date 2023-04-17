import java.util.Scanner;

public class Project_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = input.nextInt();

		int[] numbers = new int[size];

		System.out.printf("Please Enter %d values: ", size);

		for(int i = 0; i < size; i++) {
		 
		 	numbers[i] = input.nextInt();

		 }

		int total = 0;

		for(int i = 1; i < size; i++) {

			if(numbers[i - 1] == numbers[i]) {
			
				total += numbers[i - 1] * numbers[i];

				break;

			}

		}

		System.out.printf("Total of unique values is %d\n", total);

	}

}
