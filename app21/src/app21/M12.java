package app21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M12 {
    public static void main(String[] args) {
        // Test strings
        // String src = "hello123";        // Would match
        // String src = "ahello123";       // Would match
        // String src = "hello123e";       // Won't match (extra character at end)
        // String src = "Rasdfghjhgfdshhello123"; // Matches only if pattern allows it
        String src = "awsd_34hello123"; // ❌ Won't match due to "_"

        // Incorrect regex pattern (does not allow underscore '_')
        String exp = "^[A-ZA-Z0-9]+hello\\d{1,4}$";

        Pattern p1 = Pattern.compile(exp);
        Matcher m1 = p1.matcher(src);

        // Print whether the pattern matches the input string
        System.out.println(m1.find());
    }
}
