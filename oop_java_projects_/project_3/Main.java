package project_3;

import java.util.Scanner;

public class Main {

    static int num_vol = 0, num_con = 0;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variables
        String word;

        //  take a string from the user
        System.out.print("Input the string: ");
        word = input.next();

        count(word);

        System.out.println("Number of Vowels in the string is: " + num_vol);
        System.out.println("Number of constants in the string is: " + num_con);
        
    }

    static void count(String word) {
 
        // count the vowels and the constants
        for(int i = 0; i < word.length(); i++) {

            if(isVowel(word.charAt(i)))
                num_vol++;  
            else
                num_con++;

        }        

    }

    static boolean isVowel (char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
  
        return false;

    }

}
