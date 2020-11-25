package day_14_scope;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

	public CalendarPractice() {
		// TODO Auto-generated constructor stub
	}

		
	public static void main(String[] arg) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -900);
		cal.add(Calendar.DATE, -877);
		System.out.println(cal.getTime());
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = format1.format(cal.getTime());
		System.out.println(formatted);
	}
}
