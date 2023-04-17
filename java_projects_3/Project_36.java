import java.util.Arrays;

public class Project_36 {

	public static void main(String[] args) {

		String x = "salam";
		char[] a = new char[5];

		x = x.toUpperCase();

		for(int i = x.length() - 1; i >= 0; i--)
			a[i] = x.charAt((x.length() - 1) - i);

		System.out.println(Arrays.toString(a));

	}

}
