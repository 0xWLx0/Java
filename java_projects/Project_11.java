public class Project_11 {

	// create a function that takes an array as an argument then return the reverse of this array
	public static int[] reverseArray(int[] array) {

		int[] result = new int[array.length];

		for(int i = 0, j = result.length; i < array.length; i++, j--)
		{

			result[j - 1] = array[i];

		}
		
		return result;

	}

	public static void main(String[] args) {

		int[] numbers = {1000, 2000, 3000, 4000, 5000}; // the array that you want to reverse

		int[] reversedNumbers;
		
		reversedNumbers = reverseArray(numbers);

		// printing eche element in the reversed array
		for(int i = 0; i < reversedNumbers.length; i ++)
		{

			System.out.println(reversedNumbers[i]);

		}

	}

}
