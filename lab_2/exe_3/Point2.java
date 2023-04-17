package lab_2.exe_3;

public class Point2 {

    // stainal variables
    private static final double originX = 0.0;
    private static final double originY = 0.0;

    // instance variables
    private double x;
    private double y;

    public Point2() {

        this(originY, originX);

    }

    public Point2(double x, double y) {

        this.x = x;
        this.y = y;

    }

    public Point2(Point2 point) {

        this(point.x, point.y);

    }

    // prints the point's coordinates
    public String toString() {

        return String.format("(%.1f, %.1f)", x, y);

    }

}
