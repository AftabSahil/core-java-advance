package app17;

public class M24 {
	public static void main(String[] args) {
		String s1 = "abc test hello abc";
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.lastIndexOf('a', 5));
		System.out.println(s1.lastIndexOf('t', 5));
		System.out.println(s1.lastIndexOf('c'));
		System.out.println(s1.lastIndexOf('c', 5));
		System.out.println(s1.lastIndexOf('b', 10));
	}
}
