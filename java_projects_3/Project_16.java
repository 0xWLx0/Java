import java.util.Scanner;

public class Project_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// declaring varables
		double r = 0, area, circleumference;

		// taking the input from the user
		System.out.print("Enter the radius: ");
		r = input.nextDouble();

		while(r != -1) {

			// Calculate (pi * r) ^ 2
			area = Math.pow((Math.PI * r), 2);

			// Calculate (2 * pi r)
			circleumference = 2 * Math.PI * r;

			System.out.printf("The area = %.2f%n", area);
			System.out.printf("The circleumference = %.2f%n", circleumference);

			// taking the input from the user 
			System.out.print("Enter the radius: ");
			r = input.nextDouble();

		}

	}

}
