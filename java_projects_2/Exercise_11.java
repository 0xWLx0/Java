import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");

		int num = input.nextInt();

		if(num <= 0) {

			System.out.println("The number of lines must be greater than zero.");

		}

		else {

			for(int i = 1; i <= num; i++) {

				for(int j = num; i < j; j--) {

					System.out.print(" ");

				}

				for(int k = 1; k <= i; k++) {

					System.out.print("*");

				}

				for(int f = 1; f < i; f++) {

					System.out.print("*");

				}

				System.out.println();

			}

			for(int i = 1; i < num; i++) {

				for(int j = 0; j < i; j++) {

					System.out.print(" ");

				}

				for(int k = num; i < k; k--) {

					System.out.print("*");

				}

				for(int f = (num - 1); i < f; f--) {

					System.out.print("*");

				}

				System.out.println();

			}

		}

    }

}
