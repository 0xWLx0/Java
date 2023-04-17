package F;

import java.util.Scanner;

public class Main {

    public static int sharedArea(int[] nums) {

        int area = 1;

        for(int i = 0; i < nums.length; i++) {

            int r = nums[i] / 8;
            area *= Math.pow(r, 2) * Math.PI;

        }


        return area;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] nums = new int[4];

        for(int i = 0; i < nums.length; i++)
            nums[i] =  input.nextInt();

        System.out.println(sharedArea(nums));

    }
    
}
