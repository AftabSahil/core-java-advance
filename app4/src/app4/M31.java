package app4;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class M31 {
	public static void main(String[] args) {
		Date d1 = new Date();
		DateFormat df = DateFormat.getDateInstance();
		String s1 = df.format(d1);
		
	//	Date d2 = df.parse(s1);
		
		try {
			Date d2 = df.parse(s1);
		}
		catch(ParseException ex) {
			
		}
		
		try {
			Date d2 = df.parse(s1);
		}
		catch(ParseException ex) {
			
		}
	}
}
