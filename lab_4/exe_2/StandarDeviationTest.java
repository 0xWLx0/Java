package lab_4.exe_2;

public class StandarDeviationTest {
    
    public static void main(String[] args) {

        double[] elements = {1, 4, 6, 2, 0, 9, 8, 3, 5, 7, 3};     
        StandardDeviationCalculation standardDeviationCalculation = new StandardDeviationCalculation(elements);
        
        System.out.println(standardDeviationCalculation.getStandardDeviation());

    }

}
