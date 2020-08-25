package questionfive;

import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.Timer;

public class QuestionFive extends TimerTask{

	@Override
	public void run() {
		System.out.println("Hello World");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String interval = sc.nextLine();
		String strs[] = interval.split("d");
		int days = Integer.valueOf(strs[0]);
		long ms = TimeUnit.DAYS.toMillis(days);
		
		strs = strs[1].split("h");
		int hours = Integer.valueOf(strs[0]);
		ms += TimeUnit.HOURS.toMillis(hours);
		
		strs = strs[1].split("m");
		int minutes = Integer.valueOf(strs[0]);
		ms += TimeUnit.MINUTES.toMillis(minutes);
		
		strs = strs[1].split("s");
		int seconds = Integer.valueOf(strs[0]);
		ms += TimeUnit.SECONDS.toMillis(seconds);
				
		Timer timer = new Timer();
		timer.schedule(new QuestionFive(), 0,ms);
	}

}
