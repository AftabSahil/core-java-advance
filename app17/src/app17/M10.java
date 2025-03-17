package app17;

public class M10 {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = s1 + s1;
		String s3 = s1 + "abc";
		String s4 = "xyz" + s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
//		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
	}
}
