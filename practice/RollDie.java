package practice;

import java.security.SecureRandom;

public class RollDie {
    
    public static void main(String[] agrs) {

        SecureRandom random = new SecureRandom();

        // variables
        int face;

        // create an array that represent each face
        int[] faces = new int[6];

        // loop 6000000 times
        for(int roll = 1; roll <= 6000000; roll++) {

            // pick a random number between 1 and 6
            face = random.nextInt(6) + 1;
            // add 1 to the total number frequency for that face
            faces[face - 1]++;

        }

        // print how many time each number has been repeated
        for(int i = 0; i < faces.length; i++)
            System.out.printf("face %d: %d%n", (i + 1), faces[i]);

        System.out.println();

    }

}
