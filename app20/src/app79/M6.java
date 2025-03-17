package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M6 {
	public static void main(String[] args) {
		String src = "a1b2c3test5hellojava";
		String exp = "[1-6]";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
