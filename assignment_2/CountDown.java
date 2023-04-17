package assignment_2;

import java.util.Scanner;

public class CountDown {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        int num;

        // take a number from the user
        System.out.print("Enter a number: ");
        num = input.nextInt();

        // count Down from num to 1
        System.out.println(countDown(num));
        
        
    }

    public static String countDown(int num) {

        if(num == 1)
           return num + ""; 
            
        return num + "\n" + countDown(num - 1);

    }

}
