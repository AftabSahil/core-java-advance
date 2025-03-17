package app8;
class G < A >{
	void test(A param) {
		System.out.println("test:" + param);
	}
}
public class M7 {
	public static void main(String[] args) {
		G<Integer> g1 = new G<>();
		g1.test(100);
		
		G<String> g2 = new G<>();
		g2.test("abc");
		
		G<Double> g3 = new G<>();
		g3.test(1.5);
		
		
		
	}
}
