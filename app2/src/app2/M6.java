package app2;

public class M6 {
	public static void main(String[] args) {
		String s1 = "12.345";
		
		Double obj = Double.valueOf(s1);
		double d1 = obj.doubleValue();
		
		double d2 = Double.parseDouble(s1);
		
		System.out.println("done");
		
		
	}
}
