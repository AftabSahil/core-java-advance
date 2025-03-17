package app20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M9 {
	public static void main(String[] args) {
		String src = "a_RE34$&@16Hello";
		String exp = "\\W";	//opposite of w
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while (m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
			
		}
	}
}
