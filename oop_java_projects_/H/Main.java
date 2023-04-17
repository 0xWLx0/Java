package H;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int A = input.nextInt(); 
        A = ((A >= 0) && (A <= 100))? (A): random.nextInt(100);
        int B = input.nextInt();
        B = ((B >= 0) && (B <= 100))? (B): random.nextInt(100);
        int C = input.nextInt();
        C = ((C == 1) || (C == 0))? (C): random.nextInt(2);

        String Winer = "";

        
        if(C == 0) 
            if(A > B) Winer = "Takahashi";
            else  Winer = "Aoki";
        
        else if(C == 1) 
            if(B > A) Winer = "Aoki";
            else  Winer = "Takahashi";

                

        System.out.println(Winer);
        
    }
    
}
