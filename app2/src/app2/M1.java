package app2;

public class M1 {
	public static void main(String[] args) {
		int i = 10;
		Integer obj = Integer.valueOf(i);	// boxing
		int j = obj.intValue();	//unboxing
		System.out.println("done");
	}
}
