package app21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M8 {
    public static void main(String[] args) {
        //String src = "hello123";
        String src = "ahello123";
        String exp = "hello\\d{1,4}";  // Regular expression pattern
        Pattern p1 = Pattern.compile(exp);
        Matcher m1 = p1.matcher(src);
        System.out.println(m1.find());
    }
}
