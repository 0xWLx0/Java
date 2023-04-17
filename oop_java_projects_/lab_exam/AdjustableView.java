package lab_exam;

import java.time.temporal.WeekFields;

public class AdjustableView extends View {

    private double ration;

    public AdjustableView(String backgroudColor, double width, double height, double ration) {

        super(backgroudColor, width, height);
        this.ration = ration;

    }

    @Override    
    public double getDisplayArea() {

        return width * height * ration;

    }

    @Override
    public String toString() {

        return String.format("AdjustableView [%s, %.1f]", super.toString(), getDisplayArea());
        
    }

}
