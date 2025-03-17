package app8;
class F < X >{
	X field;
}
public class M6 {

	public static void main(String[] args) {
		F<Integer> f1 = new F<>();
		f1.field = 100;
		
		F<String> f2 = new F<>();
		f2.field = "abc";
		
		F<Double> f3 = new F<>();
		f3.field = 1.5;
		
		F<Boolean> f4 = new F<>();
		f4.field = true;
		
		F f5 = new F();
		f5.field = new Object();
		
		System.out.println("done");
	}
	
}
