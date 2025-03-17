package app17;

public class M23 {
	public static void main(String[] args) {
		String s1 = "abc test hello abc";
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('a', 5));
		System.out.println(s1.indexOf('t', 5));
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf('c', 5));
		System.out.println(s1.indexOf('b', 10));
	}
}
