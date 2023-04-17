package lab_exam;

public class Tester {

    public static void main(String[] args) {

        Displayable[] displayables = new Displayable[2];

        FixedView fixedView = new FixedView("Blue", 30, 40, true);
        AdjustableView adjustableView = new AdjustableView("White", 30, 40, 0.5);

        displayables[0] = fixedView;
        displayables[1]  = adjustableView;

        for(Displayable displayable: displayables) {

            System.out.println(displayable);
            System.out.println("Display area = " + displayable.getDisplayArea());

        }
        
    }
    
}
