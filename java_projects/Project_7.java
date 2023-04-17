public class Project_7 {

	public static void main(String[] args){

		// if statement
		/* if(condition)
		{
			// code get executed if the condition is true
		}
		*/
	

		// else if
		/*
		else if(condition)
  		{
			// code get executed if the condition is true
		}
 		*/


		// else statement 
		/*
		else
		{
			// execute the code if the previous conditions were false
		}
 		*/

		// Only if statement
		int S = 30;
		if(S > 5) {
			System.out.println("S is bigger than 5");
		}
	
		// if statement with else statement
		int A = 20;
		if(A == 5) {
			System.out.println("A is equal to 5");
		}
		
		else {
			System.out.println("A is not equal to 5");
		}
		
		// else if statement
		int number = 3;

		if(number == 1) {
			System.out.print("one");
		}

		else if(number == 2) {
			System.out.println("two");
		}

		else if(number == 3) {
			System.out.println("three");
		}

		else if(number >= 4) {
			System.out.println("four or greater");
		}

		else {
			System.out.println("negative number");
		}


		// switch statement
		// Used when you want to test if the value of a specific variable is equal to a case in the list you chose, if the  value if the variable is equal to the value of the case, the code in the case will get executed.
		// default -> is like else statement get executed if none of the cases got executed
		/*
		switch(expression){
			
			case value;
				// Statements
				break;
			
			case value;
				// Statements
				break;

			default;
				// Statements
				break;  // you don't need to end the default with break because the programe will go out of the     switch in both cases 

		} 
		*/
		
		int x = 5;

		switch(x) {  // test the value if x


			case 1: // test if the value of x is equal to 1 
				System.out.println("x contain 1");
				break;

			case 2: // test if the value of x is equal to 2
				System.out.println("x contain 2");
				break;

			case 3: // test if the value of x is equal to 3
				System.out.println("x contain 3");

			default: // if none of the cases were true
				System.out.println("x contain different value");


		}

		int y = 3;

		switch(y) { // test the value of y


			// test if the value of y equal to 1 or 2 or 3
			case 1:
			case 2:
			case 3:
				System.out.println("y contain 1 or 2 or 3");
				break;

			default: // if the value of y is not 1 nor 2 or 3
				System.out.println("y contain different value");
			

		}

		// Nested conditions
		
		boolean isMale = true;
		int age = 14;

		if(isMale == true) {

			System.out.println("Gender: male");

			if(age <= 21) {
			
				System.out.println("He is a young boy");
			
			}

		}

		else {

			System.out.println("Gender: female");

			if(age <= 21) {

				System.out.println("She is a young girl");

			}

		}

	}

}
