package assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class SortMarks {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variables
        int temp;
        int size;

        // take the size from the user
        System.out.print("Enter the size: ");
        size = input.nextInt();

        // creating an array
        int[] marks = new int[size];

        // take the marks from the use
        System.out.print("Enter the marks: ");
        for(int i = 0; i < marks.length; i++)
            marks[i] = input.nextInt();


        // print the array before sorting
        System.out.println("Befor sorting: " + Arrays.toString(marks));

        // sorting the array
        for(int i = 0; i < marks.length; i++) {

            for(int j = i + 1; j < marks.length; j++) {

                if(marks[j] < marks[i]) {

                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;

                }

            }

        }

        // printing the array afte sorting
        System.out.println("After sorting: " + Arrays.toString(marks));


    }
    
}
