package practice;

public class Sum {
    
    public static void main(String[] args) {
        
        System.out.println("the sum of 15 + 20 = " + sum(15, 20));

        System.out.println("The product of 15 multipl 5 = " + product(15, 5));

    }

    public static int sum(int num_1, int num_2) {

        return num_1 + num_2;

    }

    public static int product(int num_1, int num_2) {

        return num_1 * num_2;

    }

}
