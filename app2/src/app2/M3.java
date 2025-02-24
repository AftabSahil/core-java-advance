package app2;

public class M3 {
	public static void main(String[] args) {
		byte b1 = 120;
		
		Byte ref = Byte.valueOf(b1);	//boxing
		byte i = ref.byteValue();	//unboxing
		System.out.println("done");
	}
}
