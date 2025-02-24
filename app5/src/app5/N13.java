package app5;
interface J{
	void test(int i);
}
public class N13 {
	public static void main(String[] args) {
//		J j1 = (int i) ->{
//			System.out.println("lambda expr1:" +i);
//			System.out.println("lambda expr2:" +i);
//			System.out.println("lambda expr3:" +i);
//			System.out.println("lambda expr4:" +i);
//		};
//		j1.test(10);
		
//		J j2 = (int a) ->{
//			System.out.println("lambda expr1:" +a);
//			System.out.println("lambda expr2:" +a);
//			System.out.println("lambda expr3:" +a);
//			System.out.println("lambda expr4:" +a);
//		};
//		j2.test(10);
		
		J j3 = (a) ->{
			System.out.println("lambda expr1:" +a);
			System.out.println("lambda expr2:" +a);
			System.out.println("lambda expr3:" +a);
			System.out.println("lambda expr4:" +a);
		};
		j3.test(10);
		
	}
}
