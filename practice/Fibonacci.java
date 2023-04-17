package practice;

public class Fibonacci {

    public static void main(String[] args) {
        
        for(int i = 0; i <= 40; i++)
            System.out.printf("Fibonacci(%d) = %d%n", i, fibonacci(i));

    }
    
    public static long fibonacci(long num) {

        if(num == 1 || num == 0)
            return num;

        return fibonacci(num - 1) + fibonacci(num - 2);

    }

}
