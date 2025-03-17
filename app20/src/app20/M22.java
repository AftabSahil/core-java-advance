package app20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M22 {
	public static void main(String[] args) 
	{ 
		String src = "abx@hello.s.com"; 
//		String src = "abx@gmail.co.in"; 
//		String src = "abx@gmail.com"; 
//		String src = "abx@something.in"; 
//		String src = "abx@abc.com"; 
//		String src = "abx@hello.s.7com"; 
//		String src = "abx@hello.s.org"; 
		
		String exp  = "[a-zA-Z]+@[a-zA-Z0-9_]+([a-zA-Z0-9_]+\\.)*\\.[a-z]{2,}$"; 
		Pattern p1 = Pattern.compile(exp); 
		Matcher m1 = p1.matcher (src); 
		System.out.println(m1.find()); 
	}
}
