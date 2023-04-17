import java.util.*;

public class Project_47 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number\n");
		int num = input.nextInt();

		for(int i = 2; i <= num; i++) {

			if((num % i) == 0)
				System.out.print(i + " ");

		}

	}

}
