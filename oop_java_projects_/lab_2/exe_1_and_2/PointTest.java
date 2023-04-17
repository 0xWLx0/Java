package lab_2.exe_1_and_2;

import static java.lang.System.out;

public interface PointTest {
    
    public static void main(String[] args) {
        
        Point p = new Point();

        // you can use the out class because we import the out class
        out.println("initial p: " + p);

        p.x = 3.2;
        p.y = 5.7;

        out.println("update p: " + p);

    }

}
