public class Project_11_myVersion {

	// create a function that takes an array as an argument then return the reverse of this array
	public static int[] reverseArray(int[] array) {

		for(int i = 0, j = (array.length) - 1; i < array.length; i++, j--)
		{

				array[i] = array[j];

		}

		return array;

	}

	public static void main(String[] args) {

		int[] numbers = {1000, 2000, 3000, 4000, 5000}; // the array that you want to reverse
		
		int[] reversedNumbers;

		reversedNumbers = reverseArray(numbers);

		for(int i = 0; i < reversedNumbers.length; i++)
		{

			System.out.println(reversedNumbers[i]);

		}

	}

}

