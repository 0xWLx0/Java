package lab_exam;

public class FixedView extends View {

    private boolean isFullScreen;

    public FixedView(String backgroudColor, double width, double height, boolean isFullScreen) {

        super(backgroudColor, width, height);
        this.isFullScreen = isFullScreen;

    }

    @Override
    public double getDisplayArea() {

        return (isFullScreen == true)? (width * height): (width * height * 0.5);  

    }

    @Override
    public String toString() {

        return String.format("FixedView [%s, %.1f]", super.toString(), getDisplayArea());

    }
    
}
