public class Project_10 {

	// set an Array as an argument in a function
	public static void printArray(int[] array) {

		for(int i = 0; i < array.length; i++) 
		{

			System.out.println(array[i]);

		}

	}

	public static void main(String[] args) {

		// first way
		int[] numbers = {1000, 2000, 3000, 4000, 5000};
		
		// call the printArray function with the numbers array as an argument
		printArray(numbers);


		System.out.println();


		// second way
		printArray(new int[] {11, 12, 13, 14, 15});

	}

}
