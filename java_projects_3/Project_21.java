// The program should prompt the user to enter a set and enter Relation with the set
// then determine the Relation 
// check if the Relation is Reflexive or Symmetric or Antisymmetric or Transitive
// if the Relation is Reflexive and Symmetric and Transitive print equivalence Relation
// if the Relation is Reflexive and Antisymmetric and Transitive print Partial Ordering Relation
// end

import java.util.Scanner;
import java.util.Arrays;

public class Project_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		// taking the size from the user
		System.out.print("Enter the size of the set: ");
		int size = input.nextInt();

		// creating the set
		int[] set = new int[size];

		// taking each element of the set from the user
		System.out.print("Enter the each element of the set: ");
		for(int i = 0; i < size; ++i) {

			set[i] = input.nextInt();

		}

		System.out.printf("The set: %s%n", Arrays.toString(set));

	}

}
