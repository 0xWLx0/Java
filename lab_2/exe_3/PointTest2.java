package lab_2.exe_3;

import static java.lang.System.*;

public class PointTest2 {

    public static void main(String[] args) {

        Point2 p1 = new Point2();

        // you can use the out class because we import the out class
        out.println("No-Argument consturnctor: " + p1);

        Point2 p2 = new Point2(5.1, 2.3);

        out.println("Constructor using cooridnates: " + p2);

        Point2 p3 = new Point2(p2);

        out.println("Constructor using another object: " + p3);

    }

}
