import java.util.Scanner;

public class Project_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// taking the input from the user
		System.out.print("Enter password: ");
		String password = input.next();

		// Storing each character the password in an array
		char[] pwd2mask = {password.charAt(0), password.charAt(1), password.charAt(2), password.charAt(3), password.charAt(4)};

		// masking the password
		char[] maskedpwd = new char[5];
		maskedpwd[0] = (char)((pwd2mask[0] + 10) * 3);
		maskedpwd[1] = (char)((pwd2mask[1] + 10) * 3);
		maskedpwd[2] = (char)((pwd2mask[2] + 10) * 3);
		maskedpwd[3] = (char)((pwd2mask[3] + 10) * 3);
		maskedpwd[4] = (char)((pwd2mask[4] + 10) * 3);

		// convert the masked array to string
		String maskedPwd = new String(maskedpwd);

		// Print the masked pasword
		System.out.println("\nPassword after masking operation: " + maskedPwd);

		// Unmask the password
		char[] unmaskedpwd = new char[5];
		unmaskedpwd[0] = (char)(maskedpwd[0] / 3 - 10);
		unmaskedpwd[1] = (char)(maskedpwd[1] / 3 - 10);
		unmaskedpwd[2] = (char)(maskedpwd[2] / 3 - 10);
		unmaskedpwd[3] = (char)(maskedpwd[3] / 3 - 10);
		unmaskedpwd[4] = (char)(maskedpwd[4] / 3 - 10);

		// convert the unmasked password to string
		String unmaskedPwd = new String(unmaskedpwd);

		// Print the unmasked password
		System.out.println("\nPassword after unmasking operation: " + unmaskedPwd);
		
		System.out.println();

	}

}
