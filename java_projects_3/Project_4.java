import java.util.Scanner;

public class Project_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true) {

			System.out.print("Enter Your friends names: ");

			String name = input.nextLine();

			if(name.equals("quit") == true) {

				break;

			}

			System.out.println("One of your friends is " + name);

		}

	}

}
