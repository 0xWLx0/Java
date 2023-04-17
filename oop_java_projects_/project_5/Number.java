package project_5;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        int num;

        // take an integer from the user
        System.out.print("Enter an integer: ");
        num = input.nextInt();

        if(isEven(num))
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
        
    }

    public static boolean isEven(int num) {

        if(num % 2 == 0)
            return true;
        
        return false;

    }

}
