package assignment_1;

import java.util.*;

public class Boat {
    
    public static void main(String[] args) throws Exception {
        
        Formatter output = new Formatter("/home/wl/Documents/oop_java_projects/assignment_1/boat.txt");

        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {

            for(int k = 0; k < 5; k++)
                output.format("%c", ' ');

            for(int j = 0 ; j <= i; j++) {

                output.format("%c", '*');

            }

            output.format("%n");

        }

        for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= 10; j++) {

                if(j != 6)
                    output.format("%c", ' ');
                else
                    output.format("%c", '|');

            }

            output.format("%n");

        }

        for(int i = 1; i <= 10; i++) {

            if(i == 1) {

                for(int j = 1; j <= 12; j++)
                    output.format("%c", '-');

                output.format("%n");

            }

            if(i <= 2) {

                output.format("%c", '\\');          
            
                for(int e = i; e <= 1; e++)
                    output.format("%c", ' ');

                for(int k = 10; k > i; k--)
                    output.format("%c", ' ');

                output.format("%c", '/');

                output.format("%n");

                for(int q = 1; q <= i; q++)
                    output.format("%c", ' ');

            }

                       

            if(i == 5) {
                
                for(int j = 1; j <= 8; j++)
                    output.format("%c", '-');


                output.format("%n");

                break;

            }

        }

        output.close();

    }

}
