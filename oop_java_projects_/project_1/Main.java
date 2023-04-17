package project_1;

public class Main {
    
    public static void main(String[] args) {
        
        Invoice invoice1 = new Invoice("A5544", "Big Black Book", 500, 250.00);
        Invoice invoice2 = new Invoice("A5542", "Big Pink Book", 300, 50.00);
        
        System.out.printf("invoice 1 %s\t%s\t%d\t%.2f\n", invoice1.getNum(), invoice1.getDes(), invoice1.getQ(), invoice1.getPrice());
        System.out.printf("invoice 2 %s\t%s\t%d\t%.2f\n", invoice2.getNum(), invoice2.getDes(), invoice2.getQ(), invoice2.getPrice());

    }

}
