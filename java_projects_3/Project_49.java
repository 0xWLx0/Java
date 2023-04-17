import java.nio.*;
import java.util.*;

public class Project_49 {

	private static Formatter output; // output text to file

	public static void main(String[] args) throws Exception {

		openfile();
		addRecords();
		closeFile();

	}

	// open file clients.txt
	public static void openfile() throws Exception {

		output = new Formatter("/home/wl/Documents/java_projects_3/clients.txt");

	} // end the method closeFile();


	// add records to file
	public static void addRecords() {

		Scanner input = new Scanner(System.in);
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", 
				"First Name", "Last Name", "Balance");
		try {

			while(input.hasNext()) { // loop until end-of-file indicator

			// output new record to file: assume valid input
			output.format("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());

			} // end while

		} // end try

		catch (NoSuchElementException elementException) {

			System.err.println("File improperly formed. Terminating.");

		}

		catch (IllegalStateException stateException) {

			System.err.println("Error reading from file. Terminating.");

		}

	} // end method addRecords

	// close file
	public static void closeFile() {

		if(output != null)
			output.close();

	} // end the method closeFile

}	// close the class
