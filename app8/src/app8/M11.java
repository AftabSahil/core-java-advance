package app8;
class K < E  extends Number >{
	E f1;
}
public class M11 {
	public static void main(String[] args) {
		K<Integer> k1 = new K<>();
		k1.f1 = 100;
		
//		K<String> k2 = new K<>();
		
		K<Double> k3 = new K<>();
		K<Float> k4 = new K<>();
		K<Byte> k5 = new K<>();
//		K<Boolean> k6 = new K<>();
		K<Long> k7 = new K<>();
		K<Short> k8 = new K<>();
		K<Number> k9 = new K<>();
		
		System.out.println("done");
	}
}
