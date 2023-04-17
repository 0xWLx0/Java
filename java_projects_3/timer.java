import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class timer {

	public static void main(String[] args) {

		// Timer =			A facility for threads to schedule tasks
		// 					for future execution in a background thread

		// TimerTask = 		A task that can be scheduled for one-time
		// 					or repeated execution by a Timer
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the timer start: ");

		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
			
			int time = input.nextInt();

			public void run() {
			
				if(time > 0) {

					System.out.println(time);

					time--;

				}

				else {

					timer.cancel();

				}
			
			}

		};

		
		timer.scheduleAtFixedRate(task, 0, 1000);

	}

}
