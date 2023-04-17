import java.util.*;

public class Project_53 {

	public static void main(String[] args) {

		Scanner x=new Scanner(System.in);
        int j=x.nextInt();
        int d[]= new int[j];

        // take the elment from the user
        System.out.println("enter a list");
        for(int i = 0 ; i < j;i++)
             d[i]=  x.nextInt();

        //check the min
        int min=d[0];
        for(int h =0  ; h < j;h++){
           if(min > d[h])
               min=d[h];

        }

        System.out.println("the min "+min);
		
	}

}
