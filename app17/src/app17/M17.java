package app17;

public class M17 {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = "ja" + s2;
		String s4 = s1 + "va";
		String s5 = "ja" + "va";
		String s6 = "java";
		String s7 = new String("java");
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);
		System.out.println(s3 == s7);
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		System.out.println(s4 == s7);
		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		System.out.println(s6 == s7);
	}
}
