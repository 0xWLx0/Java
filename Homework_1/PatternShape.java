package Homework_1;
import java.util.Scanner;

public class PatternShape {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variables
        int size;
        char choice;

        // take the user choice
        System.out.print("Choose a shape (a or b): ");
        choice = input.next().charAt(0);

        switch(choice) {
 
            case 'a', 'A':
                // the shape size
                System.out.print("Enter shapes' size: ");
                size = input.nextInt();
                shapeA(size);
                break;


            case 'b', 'B':
                // the shape size
                System.out.print("Enter shapes' size: ");
                size = input.nextInt();
                shapeB(size);

        }
    }

    // shape A
    public static void shapeA(int size) {

        for(int i = 1; i <= size; i++) {

            for(int j = 1; j <= i; j++)
                System.out.print('#');

            System.out.println();

        }

    }

    // shape B
    public static void shapeB(int size) {

        for(int i = size; i >= 1; i--) {

            for(int j = 1; j <= i; j++)
                System.out.print('#');

            System.out.println();

        }

    }

}
