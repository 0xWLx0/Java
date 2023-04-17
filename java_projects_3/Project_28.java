// The program should calculte the checksum by asking the user to enter 12 digits of ISBN 
// and print the checksum result

import java.util.Scanner;

public class Project_28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// declaring and initilazing variables
		int size = 13, total = 0, index = 0;

		// declaring an array the store 13 digits of ISBN
		int[] ISBN = new int[size];

		// prompt the  user to enter 12 digits of ISBN and calculate the sum of the first 12 digits
		System.out.printf("Enter 12 digits: ");
		while(index <= (size - 2)) {

			ISBN[index] = input.nextInt();
			
			if(((index + 1) % 2) == 0 )
				total += 3 * ISBN[index];
			else
				total += ISBN[index];

			index++;

		}

		// calculate the checksum which is the digit 13 in the ISBN
		ISBN[size - 1] = 10 - (total % 10);
		if(ISBN[size - 1] == 10)
			ISBN[size - 1] = 0;

		// printing the checksum
		System.out.printf("The checksum is %d%n", ISBN[size - 1]);

		// printing the whol ISBN
		System.out.print("The ISBN is: ");
		for(int i = 0; i <= (size - 1); i++)
			System.out.print(ISBN[i]); 

		System.out.println();

	}

}
