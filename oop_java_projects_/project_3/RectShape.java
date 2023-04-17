package project_3;

import java.util.Scanner;

public class RectShape {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variables
        double length, width;

        // take the length and the width from the user
        System.out.print("Enter the length: ");
        length = input.nextDouble();
        System.out.print("Enter the width: ");
        width = input.nextDouble();

        // print the area
        System.out.println(area(length, width));

        magnifier(3, length, width);

        magnifier(1, length, width);

        magnifier(2, length, width);
        
    }

    // calculate the area
    static double area(double length, double width) {

        return length * width;

    }
    
    // calculate the magnifier
    static void magnifier(int x, double length, double width) {

        System.out.println(area(length, x) * area(width, x));

    }

}
