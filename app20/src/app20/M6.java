package app20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M6 {
	public static void main(String[] args) {
		String src = "aaaa756bfkbkbk86j89njk";
		String exp = "[1-6]";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while (m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
			
		}
	}
}
