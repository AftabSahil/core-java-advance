//package app20;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class M1 {
//	public static void main(String[] args) {
//		String src = "aaaabfkbkbkjnjk";
//		String exp = "a";
//		
//		Pattern p1 = Pattern.compile(exp);
//		Matcher m1 = p1.matcher(src);
//		while (m1.find()) {
//			System.out.println(m1.start() + ":" + m1.group());
//			
//		}
//	}
//}


package app20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M1 {
	public static void main(String[] args) {
		String src = "aaaabfkbkbkjnjk";
		String exp = "hello";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		 
		System.out.println(m1.find());
			
		
	}
}