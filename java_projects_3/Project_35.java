import java.util.*;

public class Project_35 {

	public static void main(String[] str) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();

		if(num == 2 || num == 1)
			System.out.printf("the number %d is prime", num);
		else 
			System.out.printf("the number %d is not prime", num);

	}

}
