import java.util.*;

public class Project_66 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
        int day;
        int month;
        int year;
        int i = 1;
        System.out.println("plz enter today date:");
        System.out.printf("%10s : ", " day");
        day = x.nextInt();
		while (day < 1 || day > 30) {

            System.out.println(" incorrect plz enter again : ");
            day = x.nextInt();
        }

        System.out.printf("%10s : ", " month");
        month = x.nextInt();
		while (month < 1 || month > 12) {

            System.out.println(" incorrect plz enter again : ");
            month = x.nextInt();

        }

        System.out.printf("%10s : ", " year");
        year = x.nextInt();
		while (year < 1900 || year > 2100) {

            System.out.println(" incorrect plz enter again : ");
            year = x.nextInt();
        }

        System.out.println("enter the number of next dats you want to print ");
        int num = x.nextInt();

        while (num >= i) {

            if (day == 30) {

            	if (month == 12 && day == 30)
              		year++;

                day = 1;
				if(month == 12)
					month = 1;
				else
					month++;

            } else
                day++;
            
            System.out.printf("day %d date %d - %d - %d%n", i, day, month, year);

			i++;
        }

	}

}
