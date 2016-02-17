package _1924_2007년;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String days[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		Calendar cal = Calendar.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		cal.set(2007, month-1, day);
		int curDay = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(days[curDay - 1]);
	}

}
