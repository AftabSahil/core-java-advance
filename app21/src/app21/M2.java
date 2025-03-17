package app21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M2 {
    public static void main(String[] args) {
        //String src = "hello";
        //String src = "abchelloxy";
        String src = "abchello4xyz";
        String exp = "hello\\d";
        Pattern p1 = Pattern.compile(exp);
        Matcher m1 = p1.matcher(src);
        System.out.println(m1.find());
    }
}
