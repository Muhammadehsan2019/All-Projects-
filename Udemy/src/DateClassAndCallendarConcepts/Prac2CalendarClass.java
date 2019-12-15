package DateClassAndCallendarConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Prac2CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();//with callendar instance we get more feature, look at the below examples 

		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/YYYY hh:mm:ss");// crate another object for SimpleDateFormat
		System.out.println(sdf.format(calendar.getTime()));

		System.out.println(calendar.get(calendar.DAY_OF_MONTH));

		System.out.println(calendar.get(calendar.YEAR));

		System.out.println(calendar.get(calendar.DAY_OF_WEEK));

		System.out.println(calendar.get(calendar.WEEK_OF_YEAR));

		System.out.println(calendar.get(calendar.DAY_OF_YEAR));
		
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));
	}

}
