package L;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        String answer = "No";
        String n = "";

        if(N >= 100 && N <= 999) {

            n = String.format("%d", N);

            for(int i = 0; i < n.length(); i++) {

                if(n.charAt(i) == '7') {
                    
                    answer = "Yes";
                    break;

                }

            }


        }

        System.out.println(answer);


    }
    
}
