public class Project_29 {

	public static void main(String[] args) {

		int i = 65;
		// print all letters and print if the letter is vawel or not
		while(i <= 90) {

			switch(i) {

				case 65, 69, 73, 79, 85:
					System.out.printf("The letter %c is vowel%n", (char)(i));
					break;

				default:
					System.out.printf("The letter %c is consonant%n", (char)(i));

			}

			i++;

		}

	}

}
