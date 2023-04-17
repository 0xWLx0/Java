public class Project_2 {

	public static void main(String[] args) {

		// Byte data type (The value must be a number less than 128 and greater than -129)
		byte a = 127;
		byte b = -128;

		// print the value of the variables that have byte data type
		System.out.println(a + b);
		
		// short data type (The value must be a number less than 32768 and greater than -32769)
		short x = 32767;
		short y = -32768;

		// print the value of the variables that have short data type
		System.out.println(x + y);

		// int data type (The value must be a number less than 2147483648 and greater than -2147483649)
		int c = 2147483647;
		int d = -2147483648;
		
		// print the value of the variables that have int data type
		System.out.println(c + d);

		// long data type (The value must be a number less than 9223372036854775808 and greater than -9223372036854775809) (the value must end the L)
		long e = 9223372036854775807L;
		long f = -9223372036854775808L;

		// print the value of the variables that have long data type
		System.out.println(e + f);

		// float data type (The value must be a decimal numebe and end that number with f) (single-precision 32-bit IEEE 754 floating point)
		float g = 12.05f;
		float h = -8.123f;
		
		// print the value of the varables that have float data type
		System.out.println(g + h);

		// double data type (The value must be a decimal numebe and end that number with d) (double-precision 64-bit IEEE 754 floating point)
		double i = 50.98794d;
		double j = -100.1d;

		// print the value of the variables that have double data type
		System.out.println(i);
		System.out.println(j);
		
		// boolean data type (true or false) (used in conditions)
		boolean k = true;
		boolean l = false;

		// print the value of the variables that have boolean data type
		System.out.println(k);
		System.out.println(l);

		/* char data type (The value can be a number, letter or symbol for a value) (if the value is a number the value must be greater than or equal to 0 and must be less than or equal to 65535) (the value can't be a decimal number) (if the value is a character the value must be one character and must be between '') (if you didn't put any value the value will be '/u0000' this symbol take the lowest possible value) (char data type also used in  conditions) */
		char m = 0;
		char n = 1234;
		char letter_A = 'A';

		// print the value of the variables that have char data type
		System.out.println(m);
		System.out.println(n);
		System.out.println(letter_A);
		
		// String data type (any text between "")
		String text1 = "Death to me";
		String text2 = "Fuck to the world";

		// print the value of the variables that have String data type
		System.out.println(text1);
		System.out.println(text2);

		// Reference data type (Any type whose origin is an object of a class is considered a reference data)
		// (You use the word 'new' when you create a variable has reference data)
		String website = "www.google.com";
		String[] name = new String[10];
		int[] number  = new int[100];
		float[] notes = new float[5];
		char[] alphabets = new char[29];
		// Scanner input = new Scanner(System.in);
		
		// print the value of variables thar have reference data type
		System.out.println(website);
		System.out.println(name);
		System.out.println(number);
		System.out.println(notes);
		System.out.println(alphabets);

	}

}
