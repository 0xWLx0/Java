package lab_exam;

public abstract class View implements Displayable {

    private String backgroudColor;
    protected double width;
    protected double height;

    public View(String backgroudColor, double width, double height) {

        this.backgroudColor = backgroudColor;
        this.width = width;
        this.height = height;

    }

    public String getBackgroudColor() {
        return backgroudColor;
    }

    public String toString() {

        return "backgroud_color=" + backgroudColor + ", width=" + width + ", height=" + height;

    }
    
}
