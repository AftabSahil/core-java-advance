package app2;

public class M11 {
	public static void main(String[] args) {
		String s1 = "12.9";
		
		double d1 = Double.parseDouble(s1);
		System.out.println("double :" + d1);
		
		float f1 = Float.parseFloat(s1);
		System.out.println("float:" + f1);
		
		int i = Integer.parseInt(s1);
		System.out.println("int:" + i);
	}
}
