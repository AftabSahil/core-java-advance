package app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M10 {
	public static void main(String[] args) {
		//String src = "hello123";
		//String src = "ahello123";
		//String src = "hello123e";
		//String src = "Rasdfghjhgfdshello123";
		//String src = "awsd_34hello123";
		String src = "awsd34hello123";
		String exp = "^[a-zA-Z0-9]+hello\\d{1,4}$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
