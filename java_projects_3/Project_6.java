import java.util.Arrays;

public class Project_6 {

	public static void main(String[] args) {

		int[][] x = {{1, 2, 3, 4}, {4, 3, 2, 1}};

		// System.out.println(Arrays.deepToString(x));

		for(int[] arr: x) {

			// System.out.println(Arrays.toString(arr));

		}

		char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
		String s = new String("hello");

		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(charArray);
		String s4 = new String(charArray, 6, 3);

		// System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4);

		String fruit = "banana";
		char letter = fruit.charAt(0);

		// System.out.println(letter);

		// System.out.println(fruit.length());
		// System.out.println(fruit.charAt(fruit.lenght););  --> error
		// System.out.println(fruit.charAt(fruit.length() - 1));

		String name = "Hello Java";

		String upperName = name.toUpperCase();
		// String lowerName = name.toLowerCase();

		// System.out.println(name + "\n" + upperName);

		// System.out.println(fruit.substring(0));
		// System.out.println(fruit.substring(2));
		// System.out.println(fruit.substring(6));
		// System.out.println(fruit.substring(0, 3));
		// System.out.println(fruit.substring(2, 5));

		int index = fruit.indexOf('a');
       
		// System.out.println(index);

		index = fruit.indexOf('a', 2);

		// System.out.println(index);

		index = fruit.indexOf("nan");

		// System.out.println(index);

		index = fruit.lastIndexOf('a');

		// System.out.println(index);
		
		index = fruit.lastIndexOf('a', 4);

		// System.out.println(index);
		
		String name1 = "Java";
		String name2 = "JAVA";

		// boolean answer = name1.equals(name2);
		// System.out.println("Answer = " + answer);

		// answer = name1.equalsIgnoreCase(name2);
		// System.out.println("Answer = " + answer);

		name1 = "Alan Turing";
		name2 = "Ada Lovelace";

		int answer = name1.compareTo(name2);

		// System.out.println("Answer = " + answer);

		name1 = "started";
		name2 = "start";
		String name3 = "end";

		System.out.println(name1.startsWith("s"));
		System.out.println(name1.startsWith("st"));

		System.out.println(name2.startsWith("s"));
		System.out.println(name2.startsWith("st"));

		System.out.println(name1.endsWith("d"));
		System.out.println(name1.endsWith("ed"));

		System.out.println(name2.endsWith("d"));
		System.out.println(name3.endsWith("d"));

	}

}
