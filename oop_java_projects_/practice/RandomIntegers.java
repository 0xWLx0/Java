package practice;

import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();

        // variables
        int face;

        // loop 20 times
        for(int i = 1; i <= 20; i++) {

            // pick a random number between 1 and 6
            face = random.nextInt(6) + 1;

            // display the random number
            System.out.printf("%d ", face);

            // print new line after each 5 random numbers
            if(i % 5 == 0)
                System.out.println();

        }

    }
    
}
