public class Project_4 {

	public static void welcomeMessage() {

		// Print Welcome message when the function is called
		System.out.println("Welcome to java");

	}

	public static void main(String[] args){
		// calling the welcomeMessage function
		welcomeMessage();
		System.out.println("5 + 10 = " + sum(5, 10));

	}

	public static int sum(int a, int b) {

		return a + b;

	}

}
