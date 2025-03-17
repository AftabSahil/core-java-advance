package app22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class M2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		String s1 = sf.format(date);
		System.out.println(s1);
		try {
			Date d1 = sf.parse(s1);
			System.out.println(d1);
		}
		catch (ParseException ex) {
			ex.printStackTrace();
		}
	}
}
