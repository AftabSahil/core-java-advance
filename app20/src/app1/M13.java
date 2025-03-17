package app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M13 {
	public static void main(String[] args) {
		String src = "123-456";
		String exp = "^\\d{3}-\\d{3}$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}

}
