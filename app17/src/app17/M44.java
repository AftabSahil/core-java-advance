package app17;

public class M44 {
	public static void main(String[] args) {
		String s1 = "hellotest xyz hello test 123";
		int first = s1.lastIndexOf(' '), last = s1.length();
		String word;
		while(first != -1) {
			word = s1.substring(first + 1, last);
			System.out.println(word);
			last = first;
			first = s1.lastIndexOf(' ', last - 1);
		}
		System.out.println(s1.substring(0, last));
	}
}
