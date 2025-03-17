package pack1;
interface F{
	default void test1(){
		System.out.println("F-test1");
	}
}
interface G{
	default void test1(){
		System.out.println("G-test1");
	}
}
//class H implements F, G {
//	
//}

public class M5 {

}
