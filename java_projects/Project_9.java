public class Project_9 {

	public static void main(String[] args) {

		// Decleare an Array
		/*
		// like this
		datatype[] arrayRefVar;

		// or like this
		datatype []arrayRefVar;

		// or like this
		datatype arrayRefVar[];
 		*/

		// For example:
		// Array from type double, have one dimension
		double[] doubleArray;

		// Array from type int, have two dimension
		int[][] intArray;

		// Array from type String, have one dimension
		String[] stringArray;

		// Create an Array then give it the value later
		// arrayRefVar = new datatype[size];
		
		// Create an Array then give it a value
		// arrayRefVar = {value0, value1, ..., valuek};
		
		// Create and Decleare and Assigning an Array in one line
		// datatype[] arrayRefVar = new datatype[size];
		// or like this
		// datatype[] arrayRefVar = {value1, value2, ..., valuek};
		
		// example for an array
		int[] a = {10, 20, 30, 40, 50};

		a[0] = 99; // change the value of index 0 (which equal to 10) to 99
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("a.length = " + a.length);

		
		int[] numbers = new int[5];

		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println("numbers[" + i + "]: " + numbers[i]);
		}
		// give a value to eche index
		numbers[0] = 1000;
		numbers[1] = 2000;
		numbers[2] = 3000;
		numbers[3] = 4000;
		numbers[4] = 5000;

		System.out.println();

		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println("numbers{" + i + "]: " + numbers[i]);
		}


		// foreach loop
		/*
		for(element: array) {
			// Statements
		}
 		*/
		// this foreach loop allows you to loop through an array
		
		int[] numbers_2 = {1000, 2000, 3000, 4000, 5000};

		for(int element: numbers_2) {
			System.out.println(element);
		}

		

	}

}
