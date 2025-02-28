package app2;

public class M2 {
	public static void main(String[] args) {
		double d1 = 1.5;
		Double obj = Double.valueOf(d1);	//	boxing
		double j = obj.doubleValue();	//	un boxing
		System.out.println("done");
	}
}
