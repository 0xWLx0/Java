package lab_4.exe_2;

public class MeanComputation {

    private double[] numbers;
    public MeanComputation(double[] numbers) {

        this.numbers = new double[numbers.length];
        for(int i = 0; i < numbers.length; i++) 
            this.numbers[i] = numbers[i];
   
    }

    protected double computeTotal() { 
        
        double total = .0; 
        for(double e : this.numbers)
            total += e;

        return total;

    }

    public double computeMean() {

        return (computeTotal() / this.numbers.length);

    }

    public double[] getNumbers() {

        return this.numbers;

    }
}