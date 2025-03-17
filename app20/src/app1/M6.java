package app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M6 {
	public static void main(String[] args) {
//		String src = "hello123";
		String src = "hello12321341234";
//		String src = "hello12";
//		String src = "hello1";
//		String src = "hello";
		String exp = "hello\\d{1,}";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
