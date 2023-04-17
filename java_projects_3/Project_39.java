public class Project_39 {

	public static void main(String[] args) {

		int x = 0, y = 0, z = 1;

		if(x == 0 || x == 1) {

			if(x == 0) {

				x = 2;
				y = x++;
			
			}

			z = --x;

		}
		
		else {

			y = 5;
			x = y++;
			z = y--;

		}

		System.out.printf("%d %d %d%n", x, y, z);

	}

}
