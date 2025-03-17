package app18;

public class M2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		sb.append("abc");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------");
		sb.append("adddddddnsjshdujidfh");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------");
		sb.append("adddddddnsjshdujidfh");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
