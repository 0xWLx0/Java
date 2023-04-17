package O;

import java.util.Scanner;

public class Main {

    public static boolean isRainyConsecutive(String S, int i, int rainyDays) {

        boolean isRainyConsecutive  = S.charAt(i) == 'R';
        boolean otherConditions = (rainyDays == 0) || (((i != 0)?S.charAt(i - 1):'R') == 'R');
        isRainyConsecutive = isRainyConsecutive && otherConditions;

        return isRainyConsecutive;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String S = input.next();
        S  = S.toUpperCase();
        if(S.length() > 3)
            S = S.substring(0, 4);

        int rainyDays = 0;

        for(int i = 0; i < S.length(); i++)
            if(isRainyConsecutive(S, i, rainyDays))
                rainyDays++;
        
        System.out.println(rainyDays);

    }
    
}
