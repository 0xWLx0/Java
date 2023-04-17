package project_8;

import java.util.Scanner;

public class CheckOrder {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        final int SIZE = 4;

        // create an array
        double[] nums = new double[SIZE];

        // take the numbers from the user
        System.out.print("Enter four numbers: ");
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextDouble();

        // print the order of the numbers
        order(nums);

        // pring the average
        System.out.printf("The average is: %.6f%n", average(nums));
        
    }

    // calculate the average
    static double average(double[] nums) {

        double total = 0;

        for(int i = 0; i < nums.length; i++) {

            total += nums[i];

        }

        return total / nums.length;
        
    }

    // print the array of numbers(double) order
    static void order(double[] nums) {

        if(isAscending(nums))
            System.out.println("\nThe numbers are in ascending order.");

        else if(isdescending(nums))
            System.out.println("\nThe numbers are in descending order.");

        else
            System.out.println("\nThe numbers are not ordered.");

    }

    // check if the array of numbers(double) is in ascending order
    static boolean isAscending(double[] nums) {

        boolean value = true;

        for(int i = 0, j = 1; i < nums.length - 1; i++, j++) {

            if(nums[i] > nums[j])
                value = false;

        }

        return value;

    }

    // check if the array of numbers(double) is in descending order
    static boolean isdescending(double[] nums) {

        boolean value = true;

        for(int i = 0, j = 1; i < nums.length - 1; i++, j++) {

            if(nums[i] < nums[j])
                value = false;

        }

        return value;

    }

}
