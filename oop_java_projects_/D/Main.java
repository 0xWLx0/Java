package D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

    
        if((n >= 1) && (n <= 30)) {

            if(n % 2 == 0)
                System.out.println("White");
            else
                System.out.println("Black");

        }
        
    }
    
}