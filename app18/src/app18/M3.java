package app18;

public class M3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(2000);
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}
