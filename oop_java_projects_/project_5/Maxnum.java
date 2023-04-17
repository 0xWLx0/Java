package project_5;

import java.util.Scanner;

public class Maxnum {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        double num_1, num_2, num_3;

        // take 3 numbers from the user
        System.out.print("Enter 3 numbers: ");
        num_1 = input.nextDouble();
        num_2 = input.nextDouble();
        num_3 = input.nextDouble();

        System.out.printf("Max: %.2f%n", maxNum(num_1, num_2, num_3));
        
    }
 
    public static double maxNum(double num_1, double num_2, double num_3) {

        return maxNum(num_1, maxNum(num_2, num_3));

    }

    public static double maxNum(double num_1, double num_2) {

        if(num_1 > num_2)
            return num_1;

        return num_2;

    }

}
