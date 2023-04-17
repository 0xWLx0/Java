package lab_4.exe_1;

public class MeanComputationTest {

    public static void main(String[] args) {

        double[] numbers = {1, 4, 6, 2, 0, 9, 8, 3, 5, 7, 3};
        MeanComputation avg = new MeanComputation(numbers);
        System.out.println(avg.computeMean());
        System.out.println();
        
    }
    
}
