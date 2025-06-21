package Programming_Questions;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Current Date
        LocalDate today = LocalDate.now();

        // Tomorrow
        LocalDate tomorrow = today.plusDays(1);

        // Yesterday
        LocalDate yesterday = today.minusDays(1);

        System.out.println("Today's Date     : " + today);
        System.out.println("Tomorrow's Date  : " + tomorrow);
        System.out.println("Yesterday's Date : " + yesterday);
	}

}
