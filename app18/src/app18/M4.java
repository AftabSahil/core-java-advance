package app18;

public class M4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello abc test");
		System.out.println(sb);
		sb.delete(4, 8);
		System.out.println(sb);
	}
}
