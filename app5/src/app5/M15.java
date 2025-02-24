package app5;
interface K{
	int test();
}


public class M15 {
	public static void main(String[] args) {
		K k1 = () -> 2000;
		System.out.println(k1.test());
		
		
		K k2=()->{
			return 400;
		};
		System.out.println();
	} 

}
