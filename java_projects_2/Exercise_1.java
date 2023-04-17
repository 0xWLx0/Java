import java.util.Scanner;

public class Exercise_1 {

 	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;

		do{

			System.out.print("Enter the number of lines: ");
			num = input.nextInt();
			
		}
		while(num <= 0);

		for(int i = 1; i <= num; i++) {

			for(int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
