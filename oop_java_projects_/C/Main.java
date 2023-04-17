package C;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static int fact(int num) {

        if(num == 0 || num == 1)
            return 1;

        return num * fact(num - 1);


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        // System.out.println("n = ");
        // int n = (int)Math.abs(input.nextDouble());
        // int T[] = new int[10];
        int T  = random.nextInt(1, (int)Math.pow(10, 5)); // (1 <= T <= 10 ^ 5)
        
        int n = random.nextInt(2, (int)Math.pow(10, 9)); // givan value
        int k = 1; // minimum integer k 
        // for subset T of the set {1, 2, ..., n} of size k

        int v = random.nextInt(1, T);
        int u = fact(v); // v is in T and u is fact of v

        for(int i = 1; i <= k; i++) {

            System.out.println();

        }
        
    }
    
}
