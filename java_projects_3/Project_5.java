import java.util.Scanner;

public class Project_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 4-bit binary number: ");

		String binary = input.nextLine();

		int decimal = Integer.parseInt(binary, 2);

		System.out.println(decimal);

	}

}
