package lab_4.exe_2;

public class StandardDeviationCalculation extends MeanComputation {

    private double[] elements;

    public StandardDeviationCalculation(double[] elements) {
    
        super(elements);
        this.elements = new double [elements.length];
        double mean = (new MeanComputation(elements)).computeMean();

        for(int i = 0; i < elements.length; i++)
            this.elements[i] = Math.pow(elements[i] - mean, 2);
        
    }

    // private double getSum() {

    //     double sum = .0;
    //     for(double e : this.elements)
    //         sum += e;
    //     return sum;

    // }

    public double getStandardDeviation() {

        return Math.sqrt(computeTotal() / this.elements.length);
    
    }

    public double[] getElements() {

        return this.elements;

    }

}