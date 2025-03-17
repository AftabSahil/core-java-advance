package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M13 {
	public static void main(String[] args) {
		String src = "abc                123           test               456";
		String exp = "\\s+";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
