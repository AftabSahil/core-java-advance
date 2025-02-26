package app2;

public class M8 {
	public static void main(String[] args) {
		String s1 = "100";
		
		Byte ref = Byte.valueOf(s1);
		byte b1 = ref.byteValue();
		
		byte b2 = Byte.parseByte(s1);
		
		System.out.println("done");
		
		
		
	}
}
