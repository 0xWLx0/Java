import java.util.Scanner;

public class Project_41 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String sentence = input.nextLine();
		
		int i = 0;
		char space, dot;
		int num_words = 1, num_sentence = 0;


		while(i < sentence.length()) {

			space = sentence.charAt(i);
			dot = sentence.charAt(i);

			if(space == ' ')
				num_words++;

			switch(dot) {

				case '.':
					num_sentence++;
					break;

				case '!':
					num_sentence++;
					break;

				case '?':
					num_sentence++;
					break;

			}

			i++;

		}

		System.out.printf("Words: %d%nSentences: %d%n", num_words, num_sentence);

	}

}
