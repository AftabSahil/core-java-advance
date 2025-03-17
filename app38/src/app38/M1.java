package app38;

@interface TestAnnotation{
	String message();
}

@FunctionalInterface
interface I{
	void test1();
//	void test2();
}

@TestAnnotation(message = "hello, this is from annotation")
public class M1 {

	
	@Deprecated
	void test() {
		System.out.println("done");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		M1 obj = new M1();
		obj.test();
	}
}
