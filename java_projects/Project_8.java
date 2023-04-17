public class Project_8 {
	
	public static void main(String[] args) {

		// ch have the  value 'a'
		char ch = 'a';

		//
		char unicode = '\u03A9';

		// array of letters
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};


		// Character class
		// Character ch = new Character('a');


		// Escape Sequence
		// \t  --> add some of spaces (tab)
		// \b  --> remove the previous letter
		// \n  --> make anything comes after it in a new line
		// \r  --> make the code start from it
		// \f  --> puts a separator between the content (the effect won't show unless you used it with files)
		// \'  --> add the symbol ' 
		// \"  --> add the symbol "
		//   --> add a letter or a symbol using the it's unicode 

		// \t
		System.out.println("1\t 2\t 3\t 4");

		// \b
		System.out.println("abc\bd");

		// \n
		System.out.println("My\nname\nis\nMhamad");

		// \r
		System.out.println("This text will be removed \r from here it will start printing");

		// \'
		System.out.println("I love \'java\' very much");

		// \"
		System.out.println("I love \"java\" very much");

		//
		System.out.println("\u0645\u062d\u0645\u062F");

	}

}
