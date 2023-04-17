package assignment_1;

import java.util.*;

public class Paco {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables
        int num_paco, num_bas;

        // take the number of pacos
        System.out.print("Enter the number paco: ");
        num_paco = input.nextInt();

        for(int paco = 1; paco <= num_paco; paco++) {

            System.out.println("paco No: " + paco);

            // the number of bascats inside the paco from the user
            System.out.printf("Enter the number of bascats inside the paco No %d: ", paco);
            num_bas = input.nextInt();

            for(int bas = 1; bas <= num_bas; bas++) {

                System.out.println("eating the bascat NO: " + bas);

            }

        }

    }
    
}