package app21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M4 {
	public static void main(String[] args) {
        //String src = "hello";
        //String src = "abchelloxy";
//        String src = "abchello4xyz";
//        String src = "abchello9xyz";
//        String src = "abchello8xyz";
//        String src = "abchello71xyz";
//        String src = "abchello38xyz";
        String src = "abchello7xyz";
        String exp = "hello[92]";
        Pattern p1 = Pattern.compile(exp);
        Matcher m1 = p1.matcher(src);
        System.out.println(m1.find());
    }
}
