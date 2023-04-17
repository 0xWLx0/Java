import java.util.*;
import java.nio.file.Paths;

public class Project_67 { 

		public static void main(String[] args) throws Exception {
		
         Scanner inputF= new Scanner(Paths.get("employees.txt"));
         Scanner inputK = new Scanner(System.in);
         String[] names = new String[100];
         double[] salary = new double[100];
         //----------------------------------------------------
     	   int i = 0;
   	       while (inputF.hasNext())
            	 {
            	     salary[i] = inputK.nextDouble();
            	     names[i] = inputK.next(); 
            	     i++;
            	    }
         	if (inputF != null)
            	 inputF.close();
         //-------------------------------------------------------
          	for(i = 0; i< names.length; i++){
            	  System.out.printf("%-15s  %10.2f %n ", names[i],salary[i]);
          	}
        	System.out.println("\n Longest Name: "+ findL(names));
        	System.out.println("\n Largest Salary: "+ findL(salary));
        
         	for(i = 0; i < salary.length; i++) // if the condition was <= i will go out of the array so it's out band error
         		salary[i] += 500;
         //------------------------------------------------------------
        	System.out.print("Enter Salary amount to search:");
         	double searchKey = inputK.nextDouble();
         
         	int location = Arrays.binarySearch(salary, searchKey);
        	System.out.printf(" %s  %f","Salary is");
        	System.out.println(location != -1 ? "found": "Not found"); // check if the location exist if == -1 it's not exits otherwise it exit

		}
         //------------------------------------------------------------
     public static String findL(String[] words) { 

		String longestWord = "";
	    for(int i = 0; i < words.length; i++)
    	    if (words[i].length() > longestWord.length())
        	    longestWord = words[i];
    	return longestWord;

	 }

    public static double findL(double[] numbers) {

   		double largest = numbers[0];
		for(int i = 0; i< numbers.length; i++)
    		if (numbers[i] > largest)
        	largest = numbers[i];
    	 return largest;

    }
}
