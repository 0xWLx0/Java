import java.util.Scanner;

public class Project_41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String sentence = input.nextLine();
		
		int i = 1;
		int space = 1;
		int num_words = 1;

		while(space >= 0) {

			space = sentence.indexOf(" ", i);
			num_words += 1;

			i++;

		}

		int j = 1;
		int num_sentence = 0;
		int dot_1 = 0;
		int dot_2 = 0;
		int dot_3 = 0;

		while(dot_1 >= 0 || dot_2 >= 0 || dot_3 >= 0) {

			dot_1 = sentence.indexOf(".", j);
			dot_2 = sentence.indexOf("!", j);
			dot_3 = sentence.indexOf("?", j);

			if(dot_1 >= 0)
				num_sentence += 1;

			if(dot_2 >= 0)
				num_sentence += 1;

			if(dot_2 >= 0)
				num_sentence += 1;

			j++;

		}

		System.out.printf("Words: %d%nSentences: %d%n", num_words, num_sentence);

	}

}
