package app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M1 {
	public static void main(String[] args) {
		String src = "abchelloxyz";
		String exp = "hello";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
