public class Project_6 {

	public static void main(String[] args) {
		// for loop
		/*
		for(initialisation;condition;increment or decrement)
		{	
			// statements
		}	
		*/

		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		// while loop
		/*
		initialisation;
		while(condition)
		{
			// statements

		increment or decrement;
		}
		*/
		int j = 1; // create a variable
		while(j <= 10) // the condition
		{
			System.out.println(j); // Statememts
		
			j++; // increment
		}
		// Do while loop
		/*
		initialisation;
		do{
			// statements
		
			increment or decrement;
		}
		While(condition);
		*/
		int k = 1;
		
		do{
			System.out.println(k);
		
			k++;
		}		
		while(k <= 10);
		// break
		for(int a=1;a <= 10; a++)
		{
			if(a == 7){
				break;
			}
			System.out.println(a);
		}
		for(int b = 1;b <= 10;b++)
		{
			if(b == 4){
				continue;
			}
			System.out.println(b);

		}

	}

}
