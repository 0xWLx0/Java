package B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int Size = input.nextInt();
        int[] arr = new int[Size];
        int result = 0;

        for(int i = 0; i < Size; i++) 
            arr[i] = input.nextInt();
        
        for(int i = 0; i < Size; i += 2) {

            if(Size == 1)
                break;
            
            if (!isEven(Size) && i == Size - 1) {
                int index = Arrays.binarySearch(arr, arr[Size - 1]);
                if(index != -1 && index == Size - 1)
                    result += arr[Size - 1];
                break;
            }

            if((arr[i] != arr[i + 1])) 
                result += arr[i] + arr[i + 1]; 

        }

        System.out.println(result);
        
    }
    
    public static boolean isEven(int num) {

        return num % 2 == 0;

    }

}
