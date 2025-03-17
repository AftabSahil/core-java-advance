package app17;

public class M26 {
	public static void main(String[] args) {
		String s1 = "abc;xyz;hello;test";
		String[] all = s1.split(";");
		for(String str : all) {
			System.out.println(str);
		}
	}
}
