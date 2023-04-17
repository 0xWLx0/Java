package assignment_2;

import java.util.Scanner;

public class ConvertIntgerToBinary {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        int num;

        // take a number from the user
        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.printf("%d in binary is %s%n", num, converter(num));
        
    }

    public static String converter(int num) {

        if(num == 0 || num == 1)
            return converteToString(num); 

        else {

            if(num % 2 == 0)
                return 0 + "" + converteToString(num);
            else
                return 1 + "" + converteToString(num);

        }

    }

    public static String converteToString(int num) {

        return String.format("%d ", num);

    }

}
