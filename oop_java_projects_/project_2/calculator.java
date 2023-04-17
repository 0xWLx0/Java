package project_2;

import java.util.*;

public class calculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variables
        int num_1, num_2;
        char op;

        // take the operator and the numbers from the user
        System.out.print("first number: ");
        num_1 = input.nextInt();
        System.out.print("second number: ");
        num_2 = input.nextInt();
        System.out.print("operator: ");
        op = input.next().charAt(0);

        if(op == '+')
            sum(num_1, num_2);
        else if(op == '-')
            sub(num_1, num_2);
        else if(op == '*')
            product(num_1, num_2);
        else if(op == '/')
            division(num_1, num_2);
        else 
            System.out.println("Invalid operator.");

    }

    static int sum(int a, int b) {

        return a + b;

    }

    static int sub(int a, int b) {

        return a - b;

    }

    static int product(int a, int b) {

        return a * b;

    }
    static int division(int a, int b) {

        return a / b;

    }
    
}
