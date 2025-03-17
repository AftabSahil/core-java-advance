package app17;

public class M25 {
	public static void main(String[] args) {
		String s1 = "abc xyz abc xyz";
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 5));
		System.out.println(s1.indexOf("xyz"));
		System.out.println(s1.indexOf("xyz", 10));
		System.out.println(s1.lastIndexOf("abc"));
		System.out.println(s1.lastIndexOf("abc", 5));
		System.out.println(s1.lastIndexOf("xyz"));
		System.out.println(s1.lastIndexOf("xyz", 10));
	}
}
