import java.util.Scanner;
import java.util.Arrays;

public class Project_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Seting the variables
		double BMI, weight, height, low_normal, high_normal;
		
		// Taking the input from the user
		System.out.print("Please enter your height in m : ");
		height = input.nextDouble();

		System.out.print("Please enter your weight in kg : ");
		weight = input.nextDouble();

		// Calculate the BMI, low_normal and high_normal
		BMI = weight / (height * height);
		low_normal = 18.5 * (height * height);
		high_normal = (double)25 * (height * height);


		// printing the BMI
		System.out.printf("Your BMI is %.2f%n", BMI);


		// Determinte the status
		if(BMI < 15)
			System.out.printf("Your are %s, you need to %s %.2f kgs%n", "extremely underweight", "gain", low_normal - weight);
		else if(BMI < 18.5)
			System.out.printf("Your are %s, you need to %s %.2f kgs%n", "underweight", "gain", low_normal - weight);
		else if(BMI <= 25.0)
			System.out.printf("You weight is normal%n");
		else if(BMI <= 30)
			System.out.printf("Your are %s, you need to %s %.2f kgs%n", "Overweight", "loose", weight - high_normal);
		else if(BMI <= 35)
			System.out.printf("Your are %s, you need to %s %.2f kgs%n", "obese", "loose", weight - high_normal);
		else
			System.out.printf("Your are %s, you need to %s %.2f kgs%n", "extremely obese", "loose", weight - high_normal);

	}

}
