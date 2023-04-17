package practice;

public class Factorial {

    public static void main(String[] args) {

        // loop 21 times
        // calculate the factorial for the numbers between 0 and 21
        for(int num = 0; num <= 21; num++)
            System.out.printf("%d! = %d%n", num, factorial(num));

    }
    
    public static long factorial(long num) {

        if(num == 1 || num == 0)
            return 1;

        return num * factorial(num - 1);

    }

}
