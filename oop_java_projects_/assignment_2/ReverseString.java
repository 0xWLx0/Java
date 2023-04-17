package assignment_2;

import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        // variables
        String word;

        // take a string from the user
        System.out.print("Enter a string: ");
        word = input.nextLine();

        System.out.println("After reverse: " + reversedString(word));
        
    
    }

    // reversing the string
    public static String reverse(String word, int index) { 

        if(index == 0)
            return word.charAt(index) + "";


        return word.charAt(index) + reverse(word, index - 1);

    }

    // lowering the args
    public static String reversedString (String word) {

        return reverse(word, word.length() - 1);

    }

}
