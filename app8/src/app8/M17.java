package app8;
class Y < E >{
	E f1;
}
public class M17 {
		public static void main(String[] args) {
			X<?super Number> x1 = null;
			x1 = new X<Number>();
			x1 = new X<Object>();
//			x1 = new X<Integer>();
//			x1 = new X<Float>();
//			x1 = new X<Double>();
			
			x1.f1 = 1000;
			x1.f1 = 1.4;
			
			System.out.println("done");
			
		}
}
