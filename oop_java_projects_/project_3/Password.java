package project_3;

import java.util.Scanner;

public class Password {
    
    static boolean Rule_1 = true, Rule_2 = true, Rule_3 = true, Rule_4 = true;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // variables
        String password;

        // take the password from the user
        System.out.print("Enter a password: ");
        password = input.next();

        passwordRule(password);

        System.out.println("Rule 1: " + Rule_1);
        System.out.println("Rule 2: " + Rule_2);
        System.out.println("Rule 3: " + Rule_3);
        System.out.println("Rule 4: " + Rule_4);
        
    }

    static void passwordRule(String password) {

        // Rule 1
        Rule_1 = password.length() == 9; 

        // Rule 2
        for(int i = 0; i < password.length(); i++) {

            if(isNumberInRange(password.charAt(i)) == false) {

                Rule_2 = false;
                break;

            }

        }

        // Rule 3
        for(int i = 0; i < password.length(); i++) {

            if(isLetter(password.charAt(i)) && (isCapital(password.charAt(i)) == false)) {

                Rule_3 = false;
                break;

            }

        }

        // Rule 4
        for(int i = 0; i < password.length(); i++) {

            if(isSymbol(password.charAt(i))) {

                Rule_4 = false;
                break;

            }

        }

    }

    static boolean isSymbol(char ch) {

        for(int j = 33; j <= 47 || (j >= 58 && j <= 64) || (j >= 91 && j <= 96) || (j >= 123 && j < 127); j++) {

            if(ch == j)
                    return true;

        }

        return false;

    }

    static boolean isNumberInRange(char ch) {
        
        if(ch == 57)
            return false;


        return true;

    }

    static boolean isLetter(char ch) {

        boolean value = false;

        for(int i = 65; i <= 90 ; i++) {

           if(ch == i) {

                value = true;
                break;

            }

        }

        for(int i = 97; i <= 122; i++) {

            if(ch == i) {

                value = true;
                break;

            }

        }

        return value;

    }

    static boolean isCapital(char ch) {

        for(int k = 65; k <= 90; k++) {

            if(ch == k)
                return true; 

        }

        return false;

    }
    
}
