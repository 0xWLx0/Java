import java.util.Scanner;

public class Project_8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String password = input.nextLine();

		System.out.printf("%8s %10b%n", "Rule1 |", password.length() >= 8);
		System.out.printf("%8s %10b%n", "Rule2 |", password.indexOf('?') == -1);
		System.out.printf("%8s %10b%n", "Rule3 |", password.startsWith("#"));

	}

}
