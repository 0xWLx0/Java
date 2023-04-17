package lab_2.exe_1_and_2;

public class Point {
    
    // must not final
    double x;
    double y;

    // moves this point (x, y) by the given amounts
    public void translate(double x, double y) {

        // you need to use this keyword
        this.x = this.x + x;
        this.y = this.y + y;

    }

    // prints the point's coordinates
    public String toString() { // toString method is not static method

        return "(" + x + ", " + y + ")";

    }

}
