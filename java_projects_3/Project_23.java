import java.util.Scanner;

public class Project_24 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String word = s.nextLine();

		char f = word.charAt(0);
		char g = word.charAt(word.length() - 1);

		if(f == g)
			System.out.println("True");

	}

}
