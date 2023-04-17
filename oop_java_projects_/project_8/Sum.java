package project_8;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        int num_1, num_2, num_3;
        double num1, num2;

        // take numbers 
        System.out.print("Enter three numbers: ");
        num_1 = input.nextInt();
        num_2 = input.nextInt();
        num_3 = input.nextInt();

        System.out.println("The sum is: " + sum(num_1, num_2, num_3));

        System.out.printf("The average is: %.1f", average(num_1, num_2, num_3));

        System.out.print("Enter two numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.printf("The sum is: %.2f%n", sum(num1, num2));



    }

    public static double average (double num1, double num2, double num3) {

        return sum(num1, num2, num3) / 3;

    }

    public static int sum(int num_1, int num_2, int num_3) {

        return num_1 + num_2 + num_3;

    }

    public static double sum(double num_1, double num_2) {

        return num_1 + num_2;

    }

    public static double sum(double num1, double num2, double num3) {

        return num1 + num2 + num3;

    }

}