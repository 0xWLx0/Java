import java.util.*;

public class Projects_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numbers[] = {13, 7, 23, 2, 29, 3, 5, 71, 11, 41, 17, 19, 53, 73, 31, 37, 97, 43, 47, 59, 61, 79, 67, 83, 89};

		Arrays.sort(numbers);

		System.out.println("Enter first guess");
		int num1 = input.nextInt();

		System.out.println("Enter second guess");
		int num2 = input.nextInt();

		System.out.println(num1 + "  found at index = " + Arrays.binarySearch(numbers, num1));
		System.out.println(num2 + "  found at index = " + Arrays.binarySearch(numbers, num2));

	}

}
